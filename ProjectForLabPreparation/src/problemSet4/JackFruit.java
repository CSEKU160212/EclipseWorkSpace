package problemSet4;

public class JackFruit extends Fruit{
	private String taste;
	public JackFruit(String name) {
		super(name);
		count2++;
		total=count+count2;
	}

	public JackFruit(String name, String place, String taste) {
		super(name);
		setPlace(place);
		this.taste=taste;
		count2++;
		total=count+count2;
	}

	@Override
	public void getInfo() {
		System.out.println("Name : "+name+"\nPlace : "+getPlace()+"\nTaste : "+taste+"\n");
	}

	public void setPlace(Mango obj3) {
		setPlace(obj3.getPlace());
	}

}
