package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Prime_Or_Not {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("Prime number ");
		}
		else
		{
			System.out.println("Not prime ");
		}
		sc.close();
	}


}
