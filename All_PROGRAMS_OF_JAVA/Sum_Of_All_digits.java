package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Sum_Of_All_digits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum Of All Digits is: "+sum);
		sc.close();
	}

}
