package Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefactoredMastersProgramTest {
    @Test
    public void isEligibleThesis(){
        RefactoredMastersProgram mp=new RefactoredMastersProgram(DegreeType.RegularThesis,"swe");
        boolean isEligible=mp.isEligible(2,"swe");
        assertFalse(isEligible);
        isEligible=mp.isEligible(3.9f,"swe");
        assertTrue(isEligible);
    }
    @Test
    public void getMarksThesis(){
        RefactoredMastersProgram mp=new RefactoredMastersProgram(DegreeType.RegularNonThesis,"swe");
        int marks=mp.getMarks(80,60,40);
        assertEquals(100,marks);
    }
    @Test
    public void isEligibleThesisDifferentMajor(){
        RefactoredMastersProgram mp=new RefactoredMastersProgram(DegreeType.RegularThesis,"cse");
        boolean isEligible=mp.isEligible(3.9f,"swe");
        assertFalse(isEligible);
    }
    @Test
    public void isEligibleNonThesis(){
        RefactoredMastersProgram mp=new RefactoredMastersProgram(DegreeType.RegularNonThesis,"swe");
        boolean isEligible=mp.isEligible(3.9f,"swe");
        assertTrue(isEligible);
    }
    @Test
    public void getMarksNonThesis(){
        RefactoredMastersProgram mp=new RefactoredMastersProgram(DegreeType.RegularNonThesis,"swe");
        int marks=mp.getMarks(60,60,40);
        assertEquals(80,marks);
    }
    @Test
    public void isEligibleNonThesisDifferentMajor(){
        RefactoredMastersProgram mp=new RefactoredMastersProgram(DegreeType.RegularNonThesis,"cse");
        boolean isEligible=mp.isEligible(3.9f,"swe");
        assertFalse(isEligible);
    }
    @Test
    public void isEligibleExecutive(){
        RefactoredMastersProgram mp = new RefactoredMastersProgram(DegreeType.Executive, "swe");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.76f, "swe");
        assertTrue(isEligible);

    }
    @Test
    public void getMarksExecutive() {
        RefactoredMastersProgram mp = new RefactoredMastersProgram(DegreeType.Executive, "swe");
        int marks = mp.getMarks(60, 60, 40);
        assertEquals(60, marks);
    }
}
