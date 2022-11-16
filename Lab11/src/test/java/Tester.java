import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
public class Tester {
    @Test
    public void testFileWrite(){
        Employee dummy = new Employee("Nazmul");
        dummy.setID(42118);
        dummy.setExperience(0);
        dummy.setSalary(69420);
        dummy.setAge(20);
        EmployeeDB db = new EmployeeDB();
        db.save(dummy);
        dummy = new Employee("Sian");
        dummy.setID(42151);
        dummy.setExperience(5);
        dummy.setSalary(99999);
        dummy.setAge(25);
        db.save(dummy);

    }
    @Test
    public void testReadFile(){
        EmployeeDB db = new EmployeeDB();
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee dummy = new Employee("Nazmul");
        dummy.setID(42118);
        dummy.setExperience(0);
        dummy.setSalary(69420);
        dummy.setAge(20);
        employees.add(dummy);
        dummy = new Employee("Sian");
        dummy.setID(42151);
        dummy.setExperience(5);
        dummy.setSalary(99999);
        dummy.setAge(25);
        employees.add(dummy);


        ArrayList<Employee> emp = db.employeesList();
        assertEquals(employees.size(), emp.size());
    }
    @Test
    public void testReadFile(){
        EmployeeDB db = new EmployeeDB();
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee dummy = new Employee("Nazmul");
        dummy.setID(42118);
        dummy.setExperience(0);
        dummy.setSalary(69420);
        dummy.setAge(20);
        employees.add(dummy);
        dummy = new Employee("Sian");
        dummy.setID(42151);
        dummy.setExperience(5);
        dummy.setSalary(99999);
        dummy.setAge(25);
        employees.add(dummy);


        ArrayList<Employee> emp = db.employeesList();
        assertEquals(employees.size(), emp.size());
    }
    @Test
    public void testAgeFilter(){
        EmployeeDB db = new EmployeeDB();
        ArrayList<Employee> dum = db.ageFilter(20);
        assertEquals(1,dum.size());
    }
    @Test
    public void testSalaryFilter(){
        EmployeeDB db = new EmployeeDB();
        ArrayList<Employee> dum = db.salaryFilter(200);
        assertEquals(2,dum.size());
    }
    @Test
    public void testIncrementMapper(){
        EmployeeDB db = new EmployeeDB();
    }
}
