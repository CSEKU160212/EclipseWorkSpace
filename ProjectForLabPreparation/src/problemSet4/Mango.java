package problemSet4;

public class Mango extends Fruit{

	private String taste;
	public Mango(String name)
	{
		super(name);
		this.setPlace("jessore");
		this.setTaste("sweet");
		count++;
		total=count+count2;
	}
	public Mango(Mango obj) {
		super(obj.name);
		setPlace(obj.getPlace());
		taste=obj.getTaste();
		count++;
		total=count+count2;
	}

	public Mango(String name, String place, String taste) {
		super(name);
		setPlace(place);
		this.taste=taste;
		count++;
		total=count+count2;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public void getInfo() {
		System.out.println("Name : "+name+"\nPlace : "+getPlace()+"\ntaste : "+taste+"\ntotal fruits : "+total+"\n"+count+" mangoes "+count2+" jackfruits\n");
	}
	
	public String toString()
	{
		return "Name : "+name+"\nPlace : "+getPlace()+"\ntaste : "+taste+"\ntotal fruits : "+total+"\n"+count+" mangoes "+count2+" jackfruits\n";
	}

}
