package Rosemary;
public class Plant {

	 private String name;
	 public static int count=0;

	 public Plant(String name){
	  this.name = name;
	 }

	 public String getName(){
	  return name;
	 }

	 public static void main(String[] args){
	  Plant[] garden = new Plant[3];
	  garden[0] = new Plant("Vine");
	  //Create a Rosemary plant with the name Vanity
	  // it will have 1024 leaves by default
	  garden[1] = new Rosemary("Vanity");
	  //This one will have 2048 leaves
	  garden[2] = new Rosemary("Pride", 2048);

	  for (Plant p: garden){
	   System.out.println(p.getName()); //print their names
	  }
	  //getRosemaries() returns the total number of rosemaries
	  //  that have been created.
	  System.out.println("There are " + Rosemary.getNumRosemaries()
	    + " rosemary plants.");

	  Rosemary r = new Rosemary("Loathing");
	  System.out.println(r.getName());
	  System.out.println("There are " + Rosemary.getNumRosemaries()
	    + " rosemary plants.");

	 }
	}