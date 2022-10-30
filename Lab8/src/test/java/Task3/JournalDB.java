package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JournalDB {
private Map<String, ArrayList<String>> repository;
public JournalDB()
{
    this.repository = new HashMap<String, ArrayList<String>>();
}
public void save(String id,String string2)
{
    ArrayList<String> list = new ArrayList<String>();
    list.add(string2);
    repository.put(id, list);
}
public void save(String id, ArrayList<String> stringList)
{
    repository.put(id, stringList);
}
public ArrayList<String> load(String string){
    return repository.get(string);
    }
}

