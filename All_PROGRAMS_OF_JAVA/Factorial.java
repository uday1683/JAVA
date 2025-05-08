package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		sc.close();
	}

}
