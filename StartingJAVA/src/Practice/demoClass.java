package Practice;

public class demoClass {

	public static void main(String[] args) {
		
		FarmerClass Farmer1=new FarmerClass(50, 500, 4, 8);
		System.out.println("This is for FarmerClass: ");
		System.out.println("Eye: "+Farmer1.getNoOfEye());
		System.out.println("Leg: "+Farmer1.getNoOfLeg());
		System.out.println("Hand: "+Farmer1.getNoOfHand());
		System.out.println("Nose: "+Farmer1.getNoOfNose());
		System.out.println("Humanities: "+Farmer1.getHumanitiesYesOrNo());
		System.out.println("Land: "+Farmer1.getOwnLandInAcore());
		System.out.println("Engine: "+Farmer1.noOfEngineMachine);
		System.out.println("Cow: "+Farmer1.getNoOfCow());
		System.out.println("Rice: "+Farmer1.geAmountOfRicePerYear());
		
		System.out.println("\n\n\n");
		
		StudentClass student1=new StudentClass("Abdul Lotif", 160212, 3.98, 38);
		System.out.println("This is for studentClass");
		System.out.println("Name: "+student1.studentName);
		System.out.println("Eye: "+student1.getNoOfEye());
		System.out.println("Leg: "+student1.getNoOfLeg());
		System.out.println("Hand: "+student1.getNoOfHand());
		System.out.println("Nose: "+student1.getHumanitiesYesOrNo());
		System.out.println("Student ID: "+student1.getStudentId());
		System.out.println("CGPA: "+student1.getcGpa());
		System.out.println("Amount of BOOKS: "+student1.amountOfBook);
		
		System.out.println("\n\n\n");
		
	teacherClass t1=new teacherClass("MESU", "Professor", "Khulna University", "CSE");
		
	System.out.println("This is for teacherClass");
		System.out.println("Name: "+t1.teacherName);
		System.out.println("Eye: "+t1.getNoOfEye());
		System.out.println("Leg: "+t1.getNoOfLeg());
		System.out.println("Hand: "+t1.getNoOfHand());
		System.out.println("Nose: "+t1.getHumanitiesYesOrNo());
		System.out.println("Designation: "+t1.designation);
		System.out.println("Institution Name: "+t1.institutions);
		System.out.println("Subject: "+t1.nameOfSubject);
		
		
		

	}

}
