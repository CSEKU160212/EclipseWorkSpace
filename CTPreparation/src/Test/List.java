package Test;

import java.util.ArrayList;

public class List {

	ArrayList<Circle> cList=new ArrayList<Circle>();
	
	public void addList(Circle obj)
	{
		cList.add(obj);
	}
	
	public String toString() {
		String str="";
		for(Circle i: cList)
		{
			str+=i+"\n";
		}
		return str;
	}
	
}
