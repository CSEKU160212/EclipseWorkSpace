import java.util.ArrayList;


public class PointList {

	ArrayList <Point2D> pArrayList=new ArrayList<>();

	public static int count2=1;
	public void AddPoint(Point2D obj) {
       pArrayList.add(obj);
	}
	public String toString()
	{
		String str="";
		for(Point2D d:pArrayList)
		{
			str+="Point "+(count2++)+" :"+d+"\n";
		}
		return str;
		
	}
	
}
