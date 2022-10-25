import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeGenericsTest {
    @Test
    void testGenericsStudents(){

        String expected ="Nazmul 22 Taltola 200042118"+"\n"+"Tanzim 21 Rangpur 200042140"+"\n"+"Shanta 20 Dhanmondi 200042172"+"\n"+"Ayesha 21 Mohakhali 200042106"+"\n";

        List<Student> students = new ArrayList<Student>();
        Student std1 = new Student("Nazmul",22,"Taltola","200042118");
        students.add(std1);
        Student std2 = new Student("Tanzim",21,"Rangpur","200042140");
        students.add(std2);
        Student std3 = new Student("Shanta",20,"Dhanmondi","200042172");
        students.add(std3);
        Student std4 = new Student("Ayesha",21,"Mohakhali","200042106");
        students.add(std4);
        Printer printer = new Printer();
        printer.list = (ArrayList) students;
        assertEquals(expected, printer.printList(printer.list));
    }

    @Test
    void testGenericsFaculty(){
        String expected = "Tasnim 28 IUT Lecturer"+"\n"+"Tanjila 35 Pirerbagh Lecturer"+"\n"+"Jubair 69 Agargaon Professor"+"\n";
        List<Faculty> faculty = new ArrayList<Faculty>();
        Faculty teacher1 = new Faculty("Tasnim",28,"IUT", "Lecturer");
        Faculty teacher2 = new Faculty("Tanjila",35,"Pirerbagh", "Lecturer");
        Faculty teacher3 = new Faculty("Jubair",69,"Agargaon", "Professor");

        faculty.add(teacher1);
        faculty.add(teacher2);
        faculty.add(teacher3);
        Printer printer = new Printer();
        printer.list = (ArrayList)faculty;
        assertEquals(expected, printer.printList(printer.list));
    }
}
