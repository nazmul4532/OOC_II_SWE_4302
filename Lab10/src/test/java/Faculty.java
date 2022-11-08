import java.util.ArrayList;
@DevelopmentHistory(developer = "Nazmul")
public class Faculty {
    public String name;
    public String designation;
    public int salary;

    public ArrayList<Course> courses;

    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(developer = "Nazmul"))
    public Faculty(String name, String designation, int salary, ArrayList<Course> courses)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courses = courses;
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(developer = "Nazmul"))
    public Faculty(String name, String designation, int salary)
    {
        this.name = name;
        this.designation = designation;
        this. salary = salary;
    }

    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(developer = "Nazmul"))
    public void teach(Course course)
    {
        System.out.println("I am teaching "+course.CourseName+".\n");
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(developer = "Nazmul"))
    public void research(String topic)
    {
        System.out.println("I am reseaching " + topic+".\n");
    }

}