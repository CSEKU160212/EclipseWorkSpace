package problemSet3;

public class Student  extends Man{
	private String institution;
	public Student(String name, String institution) {
		super(name);
		this.institution = institution;
	}
	public Student(String name, int age, String institution)
	{
		super(name, age);
		this.institution=institution;
	}
	public Student(String name)
	{
		super(name);
	}
	public Student(String institution, Man obj) {
		super(obj);
		this.institution=institution;
	}
	public Student(Student obj3) {
		super(obj3.getName(),obj3. getAge());
		this.institution=institution;
	}
	public void setDetails(Student obj2) {
	
	  institution=obj2.institution;
	  setAge(obj2.getAge());
		
	}
	public void studentAndAgeInfo() {
		System.out.println("StudentAndAgeInfo \n"+"Institution: "+institution+"\nAge: "+getAge()+"\n");
	}
	public String getDetails() {
		return "Details\n"+super.toString()+"\nInstitution: "+institution+"\n";
	}
	public void remix(String str) {
		System.out.println("Remix Details\n"+getName()+"\n"+str+"\n"+getAge()+"\n"+str+"\n"+institution+"\n");
	}
	
}
