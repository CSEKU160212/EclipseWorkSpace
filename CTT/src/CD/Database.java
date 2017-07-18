package CD;

import java.util.*;
import java.util.ArrayList;
public class Database {
    private ArrayList items;

   public Database()  {
        items = new ArrayList();
    }

   public void addItem(Item theItem)  {
        items.add(theItem);
    }
   public void sort(){
    Collections.sort(items);
   }
   public String toString() {
   String result = "";
        for(Iterator iter = items.iterator(); iter.hasNext(); )  {
            Item item = (Item)iter.next();
            result += item.toString();
        }
    return result;
    }
}
