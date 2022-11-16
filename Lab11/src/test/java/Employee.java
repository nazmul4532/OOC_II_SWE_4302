import java.util.*;
import java.time.LocalDateTime;
public class Employee {
    private int ID;
    private String name;
    private int experience;

    private int age;

    private int salary;

    public Employee(String name) {
        this.name = name;
    }
    public void setID (int newID ) {
         this . ID = (int ) ( Math . random () * newID ) ;
         }
    public void setExperience ( Date joining ) {
         Calendar calendar = Calendar . getInstance ( Locale . US ) ;
         calendar . setTime ( joining ) ;
         LocalDateTime now = LocalDateTime . now () ;
         int years = now . getYear () - calendar . get ( Calendar . YEAR ) ;
         this . experience = years ;
    }
    public void setExperience ( int years) {
        this.experience = years;
    }
    public void setName ( String name ) {
        this.name = name;
    }
    public void setAge( int years) {
        this.age = years;
    }
    public void setSalary( int salary)
    {
        this.salary = salary;
    }
    public int getID() {
        return this.ID;
    }
    public String getName() {
        return this.name;
    }
    public int getExperience() {
        return this.experience;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getAge(){
        return this.age;
    }



    @Override
    public String toString () {
         return ID +
                 "," + name +
                 "," + experience +
                 "," + salary +
                 "," + age;
 }


}
