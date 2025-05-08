package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Factors_of_given_numbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int n=sc.nextInt();
		
		System.out.printf("Factors of %d is\n",n);
		System.out.printf("%d ",1);
		
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
				System.out.printf("%d ",i);
		}
		System.out.printf("%d",n);
		sc.close();
	}

}
