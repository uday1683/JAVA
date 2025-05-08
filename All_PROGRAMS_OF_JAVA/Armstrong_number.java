package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a=sc.nextInt();
		int original =a;
		int count=String.valueOf(a).length();
		
		int check=0;
		while(a!=0)
		{
			int rem=a%10;
			check += Math.pow(rem, count); 
			a=a/10;
		}
		System.out.println(check);
		if(original==check)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstrong ");
		}
		sc.close();

	}

}
