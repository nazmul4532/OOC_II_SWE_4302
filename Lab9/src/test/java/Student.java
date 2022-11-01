public class Student {
    public String ID;
    public String Name = null;
    public Program program = null;
    public float CGPA = 0;

    public Student(String ID, String Name, Program program, float CGPA) {
        setStudentID(ID);
        this.Name = Name;
        this.program = program;
        this.CGPA = CGPA;

    }
    public String getStudentID()
    {
        return this.ID;
    }
    public void setStudentID(String studentID){
        if(studentID.length()<9)
        {
            throw new IllegalArgumentException("Student ID must be greater than 9 characters");
        }
        else {
            this.ID = studentID;
        }
    }

    public void play(){
        System.out.println("Student "+ID+" is playing");
    }
    public void study(){
        System.out.println("Student "+ID+" is studying");
    }
    public String studentInfo (){
        String str = "ID : "+ID+" Name: "+Name+" Program : "+program+" CGPA : "+CGPA +"\n";
        return str;
    }


}
