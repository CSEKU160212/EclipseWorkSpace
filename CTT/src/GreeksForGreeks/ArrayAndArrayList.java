package GreeksForGreeks;

import java.util.ArrayList;
import java.util.Scanner;


//Difference between Array && ArrayList..... 
public class ArrayAndArrayList {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {

		int [] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		System.out.println(arr[1]);
		
		try{
		for(int i=0; i<=3; i++)
		{
			arr[i]=scanner.nextInt();
		}}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		ArrayList<Integer> arrl=new ArrayList<Integer>();
		arrl.add(1);
		arrl.add(2);
		System.out.println(arrl.get(1));
		
	}

}
