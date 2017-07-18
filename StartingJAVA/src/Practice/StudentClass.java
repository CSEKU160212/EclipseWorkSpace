package Practice;

public class StudentClass extends HumanClass{

	
	String studentName;
	private double cGpa;
	private int studentId;
	int amountOfBook;
	
	public StudentClass(String Name, int id, double gpa, int book ) 
	{
		super();
		studentName=Name;
		studentId=id;
		cGpa=gpa;
		amountOfBook=book;
	}
	
	public double getcGpa() {
		return cGpa;
	}
	public void setcGpa(int cGpa) {
		this.cGpa = cGpa;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
	
}
