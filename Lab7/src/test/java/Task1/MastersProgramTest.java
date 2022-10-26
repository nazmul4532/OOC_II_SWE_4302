package Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MastersProgramTest{
        @Test
public void isEligibleThesis(){
        MastersProgram mp=new MastersProgram(DegreeType.RegularThesis,"swe");
        boolean isEligible=mp.isEligible(2,"swe");
        assertFalse(isEligible);
        isEligible=mp.isEligible(3.9f,"swe");
        assertTrue(isEligible);
        }
        @Test
public void getMarksThesis(){
        MastersProgram mp=new MastersProgram(DegreeType.RegularNonThesis,"swe");
        int marks=mp.getMarks(80,60,40);
        assertEquals(100,marks);
        }
        @Test
public void isEligibleThesisDifferentMajor(){
        MastersProgram mp=new MastersProgram(DegreeType.RegularThesis,"cse");
        boolean isEligible=mp.isEligible(3.9f,"swe");
        assertFalse(isEligible);
        }
        @Test
        public void isEligibleNonThesis(){
                MastersProgram mp=new MastersProgram(DegreeType.RegularNonThesis,"swe");
                boolean isEligible=mp.isEligible(3.9f,"swe");
                assertTrue(isEligible);
        }
        @Test
        public void getMarksNonThesis(){
                MastersProgram mp=new MastersProgram(DegreeType.RegularNonThesis,"swe");
                int marks=mp.getMarks(60,60,40);
                assertEquals(80,marks);
        }
        @Test
        public void isEligibleNonThesisDifferentMajor(){
                MastersProgram mp=new MastersProgram(DegreeType.RegularNonThesis,"cse");
                boolean isEligible=mp.isEligible(3.9f,"swe");
                assertFalse(isEligible);
        }
        @Test
        public void isEligibleExecutive(){
                MastersProgram mp=new MastersProgram(DegreeType.Executive,"swe");
                boolean isEligible=mp.isEligible(3.9f,"swe");
                assertTrue(isEligible);
        }
        @Test
        public void getMarksExecutive(){
                MastersProgram mp=new MastersProgram(DegreeType.Executive,"swe");
                int marks=mp.getMarks(60,60,40);
                assertEquals(60,marks);
        }
        @Test
        public void isEligibleExectuiveDifferentMajor(){
                MastersProgram mp=new MastersProgram(DegreeType.Executive,"cse");
                boolean isEligible=mp.isEligible(3.9f,"swe");
        }

}