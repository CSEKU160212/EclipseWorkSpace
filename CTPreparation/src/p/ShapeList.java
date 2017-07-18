package p;

import java.util.ArrayList;

public class ShapeList {

	ArrayList<Shape> sListtt =new ArrayList<Shape>();
	public void AddShape(Shape obj) {
		sListtt.add(obj);
	}
	
	public String toString()
	{
		String str="";
		for(Shape iShape : sListtt)
		{
			str+=iShape+"\n";
		}
		return str;
	}
	
}
