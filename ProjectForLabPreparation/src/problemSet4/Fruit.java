package problemSet4;
public abstract class Fruit {
	public String name;
	public static int count=0, count2=0, total=0;

	private String place;
	
	public Fruit(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	

	public abstract void getInfo();
}