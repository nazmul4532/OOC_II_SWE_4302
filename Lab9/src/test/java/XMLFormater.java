import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XMLFormater implements IFormater{
    ArrayList<Student> students;

    public XMLFormater(ArrayList<Student> stds)
    {
        this.students = stds;
    }
    @Override
    public void format() throws IOException {
        String fileName = "/Users/nazmul/Desktop/Java/Lab9/studentXML.xml";

        try {

            FileWriter fw = new FileWriter(fileName);
            for(Student student : students) {
                String str = student.studentInfo();
                for (int i = 0; i < str.length(); i++)
                    fw.write(str.charAt(i));
            }
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

