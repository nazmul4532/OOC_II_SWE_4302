import java.util.*;
public class SortByName implements Comparator<Student>{
    public int compare(Student a, Student b)
    {
        return a.Name.compareTo(b.Name);
    }
}
