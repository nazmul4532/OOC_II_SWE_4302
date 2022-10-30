package Task3;

import java.util.ArrayList;

public class Journal {
    private ArrayList<String> entries = new ArrayList<String>();
    public void addEntry(String entry) {
        entries.add(entry);
    }
    public void addEntries(ArrayList<String> entryList) {
        for(String entry : entryList)
        {
            entries.add(entry);
        }
    }
    public void removeEntry(String entryRemove) {
        for(String entry : entries)
        {
            if(entry.equals(entryRemove))
            {
                entries.remove(entry);
            }
        }
    }
    @Override
    public String toString(){
        String entryAll="";
        for(String entry : entries)
        {
            entryAll+=entry+"\n";
        }
        return entryAll;
    }
}
