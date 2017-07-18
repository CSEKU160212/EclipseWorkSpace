import java.util.ArrayList;

public class Teacher  extends Person{
private int numCourses=0;
private ArrayList<String> courses=new ArrayList ();
public Teacher(String name, String address) {
	super(name, address);
}



public String toString() {
	String r=super.toString();
	return "Teacher: "+ r;
}

public boolean addCourse(String course)
{
	boolean s=courses.equals(course);
	return s;
}

public boolean removeCourse(String course)
{
	boolean s1=courses.equals(course);
	return s1;
}
	



}
