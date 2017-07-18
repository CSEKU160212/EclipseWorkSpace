package pp;

public class CarClass {

	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public CarClass(int height, int width) {
			this.height=height;
			this.width=width;
	}
	
	public int area(int height, int width) {
		return height*width;
	}
	
@Override
public String toString() {
	return "The main Area is "+area(height, width)+"\n";
}
	
	
}
