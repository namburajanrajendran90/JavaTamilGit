package javaBasics;

public class JavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha[];
		alpha = new char[2];
		alpha[0]='A';
		alpha[1] = 'C';
		System.out.println(alpha[1]);
		
		int number[] = {1,4,5,9,6};
		
		int max=number[0];
		
		for(int i = 0;i<number.length;i++)
		{
			//System.out.println(number[i]);
			
			if(max<number[i])
			{
				max =number[i];
			}
			
		}
		System.out.println(max);
		String car[]= {"Maruti","Tata","Honda","BMW"};		
		
		for(String ca:car)
		{
			System.out.println(ca);
			if(ca.equalsIgnoreCase("Honda"))
			{
				System.out.println(ca);
				break;
			}				
			
		}
		
		int num[][] = {{1,2,3,4},{3,4,5}};
		
		for(int k=0;k<num.length;k++)
		{
			
			for (int j=0;j<num[k].length;j++)
			{
				
				System.out.println(num[k][j]);
				
			}
			
		}
		
		//
		char[] srcarray = {'a','b','J','A','V','A','L'};
		char[] tgtarray = new char[4];
		
		System.arraycopy(srcarray, 2, tgtarray, 0, 4);

		System.out.println(String.valueOf(tgtarray));
		// i am adding in emergency fix
		
		for (char tgt:tgtarray)
		{
			System.out.println(tgt);
		}
		
		char tgtarray1[]=srcarray.clone();
		System.out.println(String.valueOf(tgtarray1));
	}

}
