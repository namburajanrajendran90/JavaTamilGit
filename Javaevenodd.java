package javaBasics;

import java.util.Scanner;

public class Javaevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter a valid number");		
		int number =0;
		
		try {
			number = myObj.nextInt();
		}catch(Exception e)
		{
			System.out.println("User input is wrong ,enter a valid number");
		}
		
		myObj.close();
		String Result = (number%2==0)?number + " is an even number" : number + " is an odd number";
		System.out.println(Result);
	}

}
