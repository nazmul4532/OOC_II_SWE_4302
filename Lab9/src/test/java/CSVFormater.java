import java.io.FileWriter;
import java.util.ArrayList;

public class CSVFormater implements IFormater {
    ArrayList<Student> students;

    public CSVFormater(ArrayList<Student> stds)
    {
        this.students = stds;
    }

    @Override
    public void format() {

    String fileName = "/Users/nazmul/Desktop/Java/Lab9/studentCSV.csv";

        try {
        FileWriter fw = new FileWriter(fileName);
        for (Student student : students) {
            String str = student.studentInfo();
            for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
        }
        fw.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
