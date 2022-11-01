import java.io.IOException;
import java.util.*;

//Exporter class is the factory class formating
public class Exporter {
    private IFormater form;
    public Exporter(Format form, ArrayList<Student> students)
    {
        this.form = chooseFormat(form, students);
    }
    public void writeToFile() throws IOException {
        form.format();
    }
    public IFormater chooseFormat(Format formater, ArrayList<Student> students)
    {
        IFormater form;
        if(formater.equals(Format.CSV))
        {
            form = new CSVFormater(students);
        }
        else if(formater.equals(Format.XML))
        {
            form = new XMLFormater(students);
        }
        else form = null;
        return form;
    }
}