package SeventhLecture;

import java.util.Scanner;

public class SeventhLecture {

	private static OurThread thread1=new OurThread("Child1", 0, 500, 12, null, true);
	private static OurThread thread2=new OurThread("Child2", 5000, 1000, 330, thread1, true); 
	private static OurThread thread3=new OurThread("Child3", 160201, 2000, 50, thread2, true); 
	
	private static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		String commandString;
		
		System.out.println("Please enter your Command sir: ");
		commandString=myScanner.nextLine();
		
		while(!commandString.toLowerCase().equals("exit"))
		{
			if (commandString.equals("1")) {
				System.out.println("Counter in Thread1: "+thread1.getCounter());
				threadStatus();
			} 
			else if(commandString.equals("2")){
				System.out.println("Counter in Thread2: "+thread2.getCounter());
				threadStatus();
			}
			else if (commandString.equals("3")) {
				System.out.println("Counter in Thread3: "+thread3.getCounter());
				threadStatus();
			}
			else if (commandString.equals("1S")) {
				thread1.stopThread();
				System.out.println("Thread1 is stopped ");
				threadStatus();
			}
			else if (commandString.equals("2S")) {
				thread2.stopThread();
				System.out.println("Thread2 is stopped ");
				threadStatus();
			}
			else if (commandString.equals("3S")) {
				thread3.stopThread();
				System.out.println("Thread3 is stopped ");
				threadStatus();
			}
			else {
				System.out.println("Plzzzzzzzzz give  correct Command: ");
			}
			
			commandString=myScanner.nextLine();
		}
		
		
		
	}
	
	
	private static void threadStatus() {
		System.out.println("Thread1 is "+thread1.isAlive());
		System.out.println("Thread2 is "+thread2.isAlive());
		System.out.println("Thread3 is "+thread3.isAlive());
		
		
	}

}
