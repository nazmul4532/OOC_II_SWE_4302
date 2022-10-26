package Task1;

public class RegularNonThesis extends ProgramMasters implements IMastersProgram{
    public RegularNonThesis(String major) {
        this.major = major;
    }
    @Override
    public boolean isEligible(float cgpa, String major){
        return this.major.equals(major);
    }
    @Override
    public int getMarks(int theoryM, int thesisM, int pm){
        return theoryM + pm/2;
    }
}
