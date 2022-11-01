import java.util.*;
public class SortByCGPA implements Comparator<Student>{
    public int compare(Student a, Student b)
    {
        int val = (int) (a.CGPA - b.CGPA);
        return val;
    }
}