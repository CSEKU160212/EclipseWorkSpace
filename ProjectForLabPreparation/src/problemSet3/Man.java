package problemSet3;

public class Man {
	private  String name;
	private  int age;
	public Man(String name) {
		super();
		this.name = name;
	}
	public Man(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public Man(Man obj) {
		this.name=obj.name;
		this.age=obj.age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void manInfo()
	{
		System.out.println("ManInfo\nName: "+name+"\nAge: "+age+"\n");
	}
	public String toString()
	{
		return "Name: "+name+"\nAge: "+age	;
	}
}
