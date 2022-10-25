public class Student extends Person{
    public String studentID;
    public Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
    }
    @Override
    public String toString() {
        String studentInfo = name +" " + age+ " " + address+" "+studentID;
        return studentInfo;
    }
}

