import java.util.*;
public class SortByID implements Comparator<Student>{
    public int compare(Student a, Student b)
    {
        return a.getStudentID().compareTo(b.getStudentID());
    }
}
