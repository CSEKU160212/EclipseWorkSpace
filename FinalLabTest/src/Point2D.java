
public class Point2D {
public int x, y;
public static int count=0;
public Point2D() {
	this.x=0;
	this.y=0;
	count++;
}
	public Point2D(int x, int y) {
		this.x=x;
		this.y=y;
		count++;
			}
	public static int getCount() {
	return count;
	}
	public String toString() {
		return "X="+this.x+" Y="+this.y;
	}
	

}
