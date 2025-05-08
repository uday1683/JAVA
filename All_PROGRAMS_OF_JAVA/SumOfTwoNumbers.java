package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class SumOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("The addition of "+a+" and "+b+" is:"+sum);
		sc.close();
	}

}
