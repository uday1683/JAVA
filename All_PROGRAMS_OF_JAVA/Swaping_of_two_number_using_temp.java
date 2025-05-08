package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Swaping_of_two_number_using_temp {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number a and b :");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int temp;
		
		System.out.println("Before Swaping a value is "+a);
		System.out.println("Before Swaping b value is "+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Before Swaping a value is "+a);
		System.out.println("Before Swaping b value is "+b);
		
		sc.close();
	}

}
