public class Person {
    public String name;
    public int age;
    public String address;
    public Person(){

    }
    public Person  (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        String personInfo = name +" " + age+ " " + address;
        return personInfo;
    }
}
