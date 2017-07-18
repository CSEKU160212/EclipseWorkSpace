package Code;


public class Point3D extends Point2D {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return this.z;
	}
	public String toString() {
		return super.toString() + " Z=" + this.z;
	}
}
