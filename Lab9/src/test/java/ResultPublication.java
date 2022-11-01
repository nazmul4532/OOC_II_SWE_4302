import java.lang.reflect.Array;
import java.util.*;
public class ResultPublication{
    public ArrayList<Student> printSortedListByID(ArrayList<Student> unsortedList){
        Collections.sort(unsortedList, new SortByID());
//        for(Student student : unsortedList){
//            System.out.println(student.studentInfo());
//        }
        return unsortedList;
    }
    public ArrayList<Student> printSortedListByCGPA(ArrayList<Student> unsortedList){
        Collections.sort(unsortedList, new SortByCGPA());
//        for(Student student : unsortedList){
//            System.out.println(student.studentInfo());
//        }
        return unsortedList;
    }
    public ArrayList<Student> printSortedListByName(ArrayList<Student> unsortedList){
        Collections.sort(unsortedList, new SortByName());
//        for(Student student : unsortedList){
//            System.out.println(student.studentInfo());
//        }
        return unsortedList;
    }
    public ArrayList<Student> printSortedList(ArrayList<Student> unsortedList){
        Collections.sort(unsortedList, new SortByCGPA());
        Collections.sort(unsortedList, new SortByID());
//        for(Student student : unsortedList){
//            System.out.println(student.studentInfo());
//        }
        return unsortedList;
    }

}
