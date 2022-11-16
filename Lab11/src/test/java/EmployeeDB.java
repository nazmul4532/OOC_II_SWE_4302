import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
//import javax.security.auth.Subject;

public class EmployeeDB {


        public void save ( Employee employee ) {
        FileWriter fw = null ;
        try {
            fw = new FileWriter ("/Users/nazmul/Desktop/Java/Lab11/employeeList.txt", true ) ;
            fw . write ( employee . toString () + "\n") ;
            } catch ( IOException e ) {
            e . printStackTrace () ;
            } finally {
            try {
                fw . close () ;
                } catch ( IOException e ) {
                e . printStackTrace () ;
                }
            }
        }

        // this code will give error if there is no file
        public void anotherSave () {
        try {
             Files . write ( Paths . get (" myfile . txt ") , " the text ". getBytes () ,
                    StandardOpenOption . APPEND ) ;
            } catch ( IOException e ) {
             e . printStackTrace () ;
            }
        }

        //Tasks begin here
        public ArrayList<Employee> employeesList (){
            File subjectFile = new File ("/Users/nazmul/Desktop/Java/Lab11/employeeList.txt");
            Scanner scanFile = null;
            try {
                scanFile = new Scanner(subjectFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            //This array will store the list of subject objects.
            ArrayList <Employee> employees = new ArrayList <>();

            //Subjects split into code and name and added to a new subject object.
            String [] token = new String[4];

            while (scanFile.hasNextLine()) {
                token = scanFile.nextLine().split(",");
                String id = token[0];
                String name = token [1];
                String experience = token [2];
                String salary = token [3];
                String age = token [4];

                Employee dummy = new Employee(name);
                dummy.setID(Integer.valueOf(id));
                dummy.setExperience(Integer.valueOf(experience));
                dummy.setSalary(Integer.valueOf(salary));
                dummy.setAge(Integer.valueOf(age));
                employees.add(dummy);
                //Each subject is then added to the subject list array list.
            }
            return employees;
        }


        //This is an impure method as it modifies one of its arguments.
        public List < Employee > add ( List < Employee > employees , Employee
                employee ) {
             employees . add ( employee ) ;
             return employees ;
        }
        public ArrayList < Employee > ageFilter ( int age){
            ArrayList < Employee > emp = employeesList();
            ArrayList<Employee> dum = new ArrayList();
            for(Employee e : emp){
                if(e.getAge() == age)
                {
                    dum.add(e);
                }
            }
            return dum;
        }
    public ArrayList < Employee > salaryFilter ( int salary){
        ArrayList < Employee > emp = employeesList();
        ArrayList<Employee> dum = new ArrayList();
        for(Employee e : emp){
            if(e.getSalary() >= salary)
            {
                dum.add(e);
            }
        }
        return dum;
    }
    public ArrayList < Employee > incrementMapper (int increment) {
        ArrayList<Employee> emp = employeesList();
        ArrayList<Employee> dum = new ArrayList();
        for (Employee e : emp) {
            {
                e.setSalary(e.getSalary() + (e.getSalary() * increment) / 100);
            }
        }
        return emp;
    }
}