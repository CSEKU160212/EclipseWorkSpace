package Code;


public class Point2D {
	private int x,y;
	public static int count=0;
	public Point2D() {
		x = 0;
		y = 0;
	}
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public String toString() {
		return "X="+this.x+" Y="+this.y;
	}
}
