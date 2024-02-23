package javaBasics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegeXPasswordValidation {
	
	public static boolean isvalidpassword(String password)
	{
		//atleast one number //atleast one captital character //atleast one small charcter//one special charcter //
		//8-20 no whitespace
		String regex="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@$=%^])(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		if(password==null)
		{
			return false;
		}
		Matcher m = p.matcher(password);
		
		return m.matches();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your password for validation");
		String password = sc.nextLine();
		System.out.println(isvalidpassword(password));
		sc.close();	

	}

}
