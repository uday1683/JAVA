package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class EvenOrOdd
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int input=sc.nextInt();
		
		if(input%2==0)
		{
			System.out.println(input+" is a even number");
		}
		else
		{
			System.out.println(input+"is a odd number");
		}
		
		sc.close();
	}

}
