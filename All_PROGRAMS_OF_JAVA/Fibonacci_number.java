package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Fibonacci_number 
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 Value: ");
		int n1=sc.nextInt();
		
		System.out.println("Enter n2 vale:");
		int n2=sc.nextInt();
		
		System.out.println("ENter the limit");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				System.out.println(n1);
			}
			else if (i==2) 
			{
				System.out.println(n2);
			}
			else
			{
				int sum=n1+n2;
				System.out.println(sum);
				n1=n2;
				n2=sum;
			}
		}
		sc.close();
	}

}
