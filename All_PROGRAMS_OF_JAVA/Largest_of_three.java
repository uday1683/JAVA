package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Largest_of_three {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number a  b and c:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b&&a>c)
			{
			System.out.println("A IS BIG");
			
			}
		else if (b>a&&b>c)
		{
			System.out.println("B IS BIG");
		}
		else
		{
			System.out.println("C IS BIG");
		}
		
		
		sc.close();

	}

}
