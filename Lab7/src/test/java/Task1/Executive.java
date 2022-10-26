package Task1;

public class Executive extends ProgramMasters implements IMastersProgram{

    public Executive(String major)
    {
        this.major = major;
    }
    @Override
    public boolean isEligible(float cgpa, String major){
        return (cgpa >= 3.75 || this.major.equals(major));
    }
    @Override
    public int getMarks(int theoryM, int thesisM, int pm){
        return theoryM;
    }
}
