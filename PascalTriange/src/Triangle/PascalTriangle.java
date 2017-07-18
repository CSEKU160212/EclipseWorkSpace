package Triangle;

import java.util.Scanner;

public class PascalTriangle {
	
	static Scanner Myscanner =new Scanner(System.in);
	
	public static void main(String[] args) {
		
	    int userInput;
	     int row=1;
	     int col=1;
	     System.out.print("Please enter the length: ");
		 userInput = Myscanner.nextInt();
		 System.out.println(+userInput);
			 int[][] pascal= new int[userInput][userInput];
			if(userInput>0 && userInput<20){
				
				for(int i=0; i<userInput; i++){
					pascal[0][i] = 1;
					pascal[i][0] = 1; 
				}
				
				for(row = 1; row<userInput; row++){
					for(col=1; col<userInput-row; col++){
					pascal[row][col] = pascal[row][col-1] + pascal[row-1][col];
					}
				}
				for(row = 0; row<userInput; row++){
					for(col=0; col<userInput-row; col++){
					prln(pascal[row][col]+ "\t");
					}
					
					pr("\n\n");
	                }
			}
	}
	static void prln(Object any){
		System.out.print(any);
	}

	static void pr(Object any){
		System.out.print(any);
	}

}
