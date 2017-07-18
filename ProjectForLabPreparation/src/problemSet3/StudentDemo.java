package problemSet3;


public class StudentDemo {
 
	public static void main(String[] args) {
		Student shish=new Student("Shish",21,"ku");
		Man JTanvir=new Man("Tanvir");
		JTanvir.setAge(shish.getAge());
		Student Tanvir=new Student("Ru",JTanvir);
		Student shahed=new Student("Shahed");
		shahed.setDetails(shish);

		
		
		Student swajan=new Student(new Student("Swajan",20,"kuet"));
		shish.manInfo();

		Tanvir.studentAndAgeInfo();
		
		System.out.println(shahed.getDetails());
		swajan.remix("m");

	}

}
