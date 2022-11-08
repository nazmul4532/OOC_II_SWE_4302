public class Course {
    String CourseCode;
    String CourseName;
    Float CourseCredit;
    Type type;

    public Course(String courseCode, String courseName, Float courseCredit, Type type) {
        this.CourseCode = courseCode;
        this.CourseName = courseName;
        this.CourseCredit = courseCredit;
        this.type = type;
    }

}
