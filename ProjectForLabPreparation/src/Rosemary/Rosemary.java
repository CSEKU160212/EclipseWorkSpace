package Rosemary;

public class Rosemary extends Plant{

	private int leaves;
	public Rosemary(String name) {
         super(name);
         setLeaves(1024);
         count++;
         }
	public Rosemary(String name,  int leaves) {
		super(name);
		this.setLeaves(leaves);
		count++;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public static int getNumRosemaries() {
			return count;
	}
	
	
	

}
