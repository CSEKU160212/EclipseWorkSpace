package FoysalsProblem;

import java.util.ArrayList;
import java.util.Iterator;

public class Database {
ArrayList<CD> cDList=new ArrayList<CD>();
ArrayList<Item> itemList=new ArrayList<Item>();
public void addCD(CD c) {
cDList.add(c);	
}
public void addItem(Item i) {
	itemList.add(i);
}
public void showAll() {
for(Iterator<CD> iter=cDList.iterator(); iter.hasNext();)
{
	CD cdItems=(CD)iter.next();
	System.out.println(cdItems);
}
for(Iterator<Item> iteratorrrr=itemList.iterator(); iteratorrrr.hasNext();)
{
	Item itm=(Item)iteratorrrr.next();
	System.out.println(itm);
	}
}

public void showCD()
{
	for(Iterator<CD> iterator=cDList.iterator(); iterator.hasNext();) {
		CD cdItems=(CD)iterator.next();
		System.out.println(cdItems);
	}
	}
public void CDTitleChange(String currentTitle, String newTitle) {
		for(Iterator<CD> itrrr= cDList.iterator(); itrrr.hasNext();)
		{
			CD itms=(CD)itrrr.next();
			if(currentTitle.contains(itms.getTitle()))
			{
				itms.setTitle(newTitle);
			}
			}
		}
}
