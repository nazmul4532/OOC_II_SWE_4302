import java.util.*;

public class StudentEnrollment {
    public  ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        for(Student std : students)
        {
            if(std.getStudentID() == student.getStudentID())
            {
                students.remove(std);
                break;
            }
        }
    }
    public Student getStudent(Student student) {
        for(Student std : students)
        {
            if(std.getStudentID() == student.getStudentID())
            {
                return std;
            }
        }
        return null;
    }

    public void removeStudent(String studentID) {
        for(Student std : students)
        {
            if(std.getStudentID() == studentID)
            {
                students.remove(std);
                break;
            }
        }
    }
    public Student getStudent(String studentID){
        for(Student std : students)
        {
            if(std.getStudentID() == studentID)
            {
                return std;
            }
        }
        return null;
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public void printStudentList(){
        System.out.println("The list of students are printed :\n");
        for(Student std : students)
        {
            System.out.println(std.studentInfo());
        }
    }


}
