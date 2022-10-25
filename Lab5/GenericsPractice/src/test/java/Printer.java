import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Printer<T> {

    public T tempObj;
    public ArrayList<T> list= new ArrayList<T>();

    Person person = new Person();

    String printList (List<? extends Person> list){
        String personInfo="";
        for(Person person : list)
        {
            personInfo += person.toString() + "\n";
        }
        return personInfo;
    }

    public Printer (){

    }
    public Printer(T obj) {

        list = new ArrayList<>();

        tempObj = obj;
    }
    public void add(T obj) {


        list.add(obj);
    }
    @Override
    public String toString(){
        String str = this.list != null ? this.list.stream().map(Object::toString).collect(Collectors.joining(", ")) : "";
        return str;
    }
}
