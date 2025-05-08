package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int num =sc.nextInt();
		
		int reverse=0;
		
		while(num>0)
		{
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num=num/10;
		}
		System.out.println("Rererse number is "+reverse);
		sc.close();
	}

}
