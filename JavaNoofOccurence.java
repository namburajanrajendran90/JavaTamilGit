package javaBasics;

import java.util.Arrays;

public class JavaNoofOccurence {
	
	public void NoOFOccur(int noarr[],int lengthofarr)
	{
		
		for (int i=0;i<lengthofarr;i++)
		{
			int nofinfd = noarr[i];
			int result =0;
			for(int j=0;j<lengthofarr;j++)
			{
				if(nofinfd==noarr[j])
				{
					result++;
				}
			}
			System.out.println("the number :-"+nofinfd+" Occured " +result+ " times in the array");			
		}
		
	}	
	public static void main(String[] args) 
	{
		JavaNoofOccurence pbj = new JavaNoofOccurence();		
		int numArray[] = {1,6,6,4,4,8,6,0,6,7,2,2,2,5,6};
		System.out.println(Arrays.toString(numArray));
		int lenOfArray = numArray.length;		
		pbj.NoOFOccur(numArray, lenOfArray);	
	}

}
