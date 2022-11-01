import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.io.IOException;

public class Lab9Test {
    Student std = new Student("20000042118", "Nazmul", Program.CSE, 3.81f);
    Student std1 = new Student("20000042151", "Sian", Program.SWE, 3.95f);
    Student std2 = new Student("20000042149", "Dihan", Program.IT, 3.75f);
    Student std3 = new Student("20000042172", "Shanta", Program.SWE, 3.81f);
    Student std4 = new Student("20000042133", "Nafisa", Program.CSE, 3.81f);
    Student std5 = new Student("20000042106", "Ayesha", Program.IT, 3.95f);
    Student std6 = new Student("20000042140", "Tanzim", Program.IT, 3.75f);

    @Test
    public void testStudentEnrollmentAddStudent() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        assertEquals(4,enrollment.students.size());
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        assertEquals(6,enrollment.students.size());


    }
    @Test
    public void testStudenEnrollmenttGetStudentByID() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        Student s = enrollment.getStudent(std2.getStudentID());
        assertEquals("ID : 20000042149 Name: Dihan Program : IT CGPA : 3.75\n",s.studentInfo());

    }
    @Test
    public void testStudentEnrollmentGetStudentByObject() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        Student dummy = enrollment.getStudent(std1);
        assertEquals("ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n", dummy.studentInfo());
    }
    @Test
    public void testStudentEnrollmentGetAllStudents() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        assertEquals(6,enrollment.getAllStudents().size());;
    }
    @Test
    public void testStudentEnrollmentRemoveByID() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        assertEquals(6,enrollment.students.size());
        enrollment.removeStudent(std3.getStudentID());
        assertEquals(5,enrollment.students.size());
        enrollment.removeStudent(std4.getStudentID());
        assertEquals(4,enrollment.students.size());
    }
    @Test
    public void testStudentEnrollmentRemoveByObject() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        assertEquals(6,enrollment.students.size());
        enrollment.removeStudent(std3);
        assertEquals(5,enrollment.students.size());
        enrollment.removeStudent(std4);
        assertEquals(4,enrollment.students.size());
    }
    @Test
    public void testResultPublicationSortByIDAndCGPA() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        ResultPublication publish = new ResultPublication();
        ArrayList<Student> stds = publish.printSortedList(enrollment.getAllStudents());
        String str="";
        for(Student st : stds){str = str + st.studentInfo();}
        assertEquals("ID : 20000042106 Name: Ayesha Program : IT CGPA : 3.95\n" +
                "ID : 20000042133 Name: Nafisa Program : CSE CGPA : 3.81\n" +
                "ID : 20000042140 Name: Tanzim Program : IT CGPA : 3.75\n" +
                "ID : 20000042149 Name: Dihan Program : IT CGPA : 3.75\n" +
                "ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n" +
                "ID : 20000042172 Name: Shanta Program : SWE CGPA : 3.81\n",str);
    }
    @Test
    public void testResultPublicationSortByID() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        ResultPublication publish = new ResultPublication();
        ArrayList<Student> stds = publish.printSortedListByID(enrollment.getAllStudents());
        String str="";
        for(Student st : stds){str = str + st.studentInfo();}
        assertEquals("ID : 20000042106 Name: Ayesha Program : IT CGPA : 3.95\n" +
                "ID : 20000042133 Name: Nafisa Program : CSE CGPA : 3.81\n" +
                "ID : 20000042140 Name: Tanzim Program : IT CGPA : 3.75\n" +
                "ID : 20000042149 Name: Dihan Program : IT CGPA : 3.75\n" +
                "ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n" +
                "ID : 20000042172 Name: Shanta Program : SWE CGPA : 3.81\n",str);
    }
    @Test
    public void testResultPublicationSortByCGPA() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        ResultPublication publish = new ResultPublication();
        ArrayList<Student> stds = publish.printSortedListByCGPA(enrollment.getAllStudents());
        String str="";
        for(Student st : stds){str = str + st.studentInfo();}
        assertEquals("ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n" +
                "ID : 20000042149 Name: Dihan Program : IT CGPA : 3.75\n" +
                "ID : 20000042172 Name: Shanta Program : SWE CGPA : 3.81\n" +
                "ID : 20000042133 Name: Nafisa Program : CSE CGPA : 3.81\n" +
                "ID : 20000042106 Name: Ayesha Program : IT CGPA : 3.95\n" +
                "ID : 20000042140 Name: Tanzim Program : IT CGPA : 3.75\n",str);
    }
    @Test
    public void testResultPublicationSortByName() {

//        System.out.println(std.studentInfo());
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        ResultPublication publish = new ResultPublication();
        ArrayList<Student> stds = publish.printSortedListByName(enrollment.getAllStudents());
        String str="";
        for(Student st : stds){str = str + st.studentInfo();}
        assertEquals("ID : 20000042106 Name: Ayesha Program : IT CGPA : 3.95\n" +
                "ID : 20000042149 Name: Dihan Program : IT CGPA : 3.75\n" +
                "ID : 20000042133 Name: Nafisa Program : CSE CGPA : 3.81\n" +
                "ID : 20000042172 Name: Shanta Program : SWE CGPA : 3.81\n" +
                "ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n" +
                "ID : 20000042140 Name: Tanzim Program : IT CGPA : 3.75\n",str);
    }
    @Test
    public void testExporterCSV() throws IOException {
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std4);
        enrollment.addStudent(std5);
        enrollment.addStudent(std6);
        ResultPublication publish = new ResultPublication();
        ArrayList<Student> stds = publish.printSortedListByCGPA(enrollment.getAllStudents());
        Exporter export = new Exporter(Format.CSV,enrollment.getAllStudents());
        export.writeToFile();
    }
    @Test
    public void testExporterXML() throws IOException {
        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.addStudent(std1);
        enrollment.addStudent(std2);
        enrollment.addStudent(std3);
        enrollment.addStudent(std4);
        ResultPublication publish = new ResultPublication();
        ArrayList<Student> stds = publish.printSortedListByCGPA(enrollment.getAllStudents());
        Exporter export = new Exporter(Format.XML,enrollment.getAllStudents());
        export.writeToFile();
    }
    @Test
    public void testStudentSetID(){
//        Student std123 = new Student("118", "Nazmul", Program.CSE, 3.81f);
        Student std123 = new Student("2000042118", "Nazmul", Program.CSE, 3.81f);
//        if I swapped the commented out line with the implemented line.. then an error would be thrown.
    }
    @Test
    public void testStudentGetStudentInfo(){
        assertEquals("ID : 20000042118 Name: Nazmul Program : CSE CGPA : 3.81\n",std.studentInfo());
    }
//    @Test
//    public void testStudentModification() {
//
////        System.out.println(std.studentInfo());
//        StudentEnrollment enrollment = new StudentEnrollment();
//        enrollment.addStudent(std1);
//        enrollment.addStudent(std2);
//        enrollment.addStudent(std3);
//        enrollment.addStudent(std4);
//        enrollment.addStudent(std5);
//        enrollment.addStudent(std6);
//        Student dummy = enrollment.getStudent(std1);
//        assertEquals("ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n", dummy.studentInfo());
//        enrollment.removeStudent(std3);
//        enrollment.removeStudent(std4.getStudentID());
//        ArrayList<Student> stds = enrollment.getAllStudents();
//        String str="";
//        Student s = enrollment.getStudent(std1);
//        assertEquals("ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n",s.studentInfo());
//        s = enrollment.getStudent(std2.getStudentID());
//        assertEquals("ID : 20000042149 Name: Dihan Program : IT CGPA : 3.75\n",s.studentInfo());
//        for(Student st : stds){str = str + st.studentInfo();}
//        assertEquals("ID : 20000042151 Name: Sian Program : SWE CGPA : 3.95\n"+
//                "ID : 20000042149 Name: Dihan Program : IT CGPA : 3.75\n" +
//                "ID : 20000042106 Name: Ayesha Program : IT CGPA : 3.95\n" +
//                "ID : 20000042140 Name: Tanzim Program : IT CGPA : 3.75\n",str);
//    }
}
