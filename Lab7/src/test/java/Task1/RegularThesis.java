package Task1;

public class RegularThesis extends ProgramMasters implements IMastersProgram{
    public RegularThesis(String major) {
        this.major = major;
    }
    @Override
    public boolean isEligible(float cgpa, String major){
        return this.major.equals(major) && cgpa >= 3.8;
    }
    @Override
    public int getMarks(int theoryM, int thesisM, int pm){
        return theoryM + thesisM;
    }
}
