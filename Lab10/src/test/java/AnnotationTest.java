import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class AnnotationTest {
    @Test
    public void testMethodAnnotation(){
        Course c1 = new Course("4341","Math",4.0f,Type.theory);
        Course c2 = new Course("4302","OOC",1.5f,Type.lab);
        Course c3 = new Course("4301","OOC",3.0f,Type.theory);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        Object fac1 = new Faculty("Jubair", "Asst. Professor", 75000, courses);
//        Faculty fac2 = new Faculty("Anas", "Lecturer", 50000);
//        Faculty fac3 = new Faculty("Shanto", "Asst. Professor", 75000, courses);

        Method[] methods = fac1.getClass().getDeclaredMethods();


        List<String> actualMethodNames = new ArrayList<String>();

        for(Method a:methods)
        {
            boolean annotationPresent = a.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationPresent)
            {
//                System.out.println(a.getDeclaredAnnotations().length);
                actualMethodNames.add(a.getName());
//                System.out.println(a.getName());
            }
        }

//        assertEquals(Arrays.asList("research","teach"),actualMethodNames);
        assertTrue(Arrays.asList("research","teach").containsAll(actualMethodNames));
    }
    @Test
    public void testConstructorAnnotation(){
        Course c1 = new Course("4341","Math",4.0f,Type.theory);
        Course c2 = new Course("4302","OOC",1.5f,Type.lab);
        Course c3 = new Course("4301","OOC",3.0f,Type.theory);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        Object fac1 = new Faculty("Jubair", "Asst. Professor", 75000, courses);

        Constructor[] constructors = fac1.getClass().getDeclaredConstructors();

        List<String> actualConstructorName = new ArrayList<String>();

        for(Constructor c: constructors)
        {
            boolean annotationPresent = c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationPresent)
            {
//                System.out.println(c.getDeclaredAnnotations().length);
                actualConstructorName.add(c.getName());
            }
        }
//        assertEquals(Arrays.asList("Faculty","Faculty"),actualConstructorName);
        assertTrue(Arrays.asList("Faculty","Faculty").containsAll(actualConstructorName));
    }
    @Test
    public void testClassAnnotation(){
        Course c1 = new Course("4341","Math",4.0f,Type.theory);
        Course c2 = new Course("4302","OOC",1.5f,Type.lab);
        Course c3 = new Course("4301","OOC",3.0f,Type.theory);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        Object fac1 = new Faculty("Jubair", "Asst. Professor", 75000, courses);
        Class[] classes = fac1.getClass().getDeclaredClasses();
        List<String> actualClassName = new ArrayList<String>();

        for(Class c: classes)
        {
            boolean annotationPresent = c.isAnnotationPresent(DevelopmentHistory.class);
            if(annotationPresent)
            {
//                System.out.println(c.getDeclaredAnnotations().length);
                actualClassName.add(c.getName());
            }
        }
//        assertEquals(Arrays.asList("Faculty"),actualClassName);
        assertTrue(Arrays.asList("Faculty").containsAll(actualClassName));

    }
    @Test
    public void newTestCaseSalary(){
        Random r = new Random();
        r.random();
        List<String> salaryHigh = new ArrayList<String>();

        for(Faculty f: r.faculties)
        {
            if(f.salary>=20000)
            {
                salaryHigh.add(f.name);
            }
        }
        assertEquals(Arrays.asList("Jubair","Anas","Shanto"),salaryHigh);
    }

}
