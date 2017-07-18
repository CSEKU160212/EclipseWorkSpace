package Code;

import java.util.ArrayList;

public class PointList {
	ArrayList<Point2D> p = new ArrayList<>();
	static int  count1=1;
	public void AddPoint(Point2D p) {
		this.p.add(p);
	}
	public String toString() {
		String all = "";
		for(Point2D i : p)
			all +="Point "+(count1++)+" :"+ i+"\n";
		return all;
	}
}
