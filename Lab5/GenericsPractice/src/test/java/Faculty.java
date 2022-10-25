public class Faculty extends Person{
   public String designation;
   public Faculty(String name, int age, String address, String designation){
      this.name = name;
      this.age = age;
      this.address = address;
      this.designation = designation;
   }
   @Override
   public String toString(){
      String facultyInfo = name + " " + age + " " + address + " " + designation;
      return facultyInfo;
   }
}
