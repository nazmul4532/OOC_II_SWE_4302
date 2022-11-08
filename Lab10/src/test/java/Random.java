import java.util.ArrayList;

public class Random {
    public ArrayList<Faculty> faculties = new ArrayList<Faculty>();
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(developer = "Nazmul"))
    public void random(){
        Course c1 = new Course("4341","Math",4.0f,Type.theory);
        Course c2 = new Course("4302","OOC",1.5f,Type.lab);
        Course c3 = new Course("4301","OOC",3.0f,Type.theory);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        Faculty fac1 = new Faculty("Jubair", "Asst. Professor", 75000, courses);
        Faculty fac2 = new Faculty("Anas", "Lecturer", 50000);
        Faculty fac3 = new Faculty("Shanto", "Asst. Professor", 75000, courses);
        Faculty fac4 = new Faculty("Naz", "Novice", 15000, courses);
        Faculty fac5 = new Faculty("Sian", "Beginner", 18000, courses);
        faculties.add(fac1);
        faculties.add(fac2);
        faculties.add(fac3);
        faculties.add(fac4);
        faculties.add(fac5);
    }

}
