package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Radius value: ");
		double radius = sc.nextDouble();
		
		final double pi=3.14d;
		
		double area=pi*radius*radius;
		
		System.out.println("The Radius Of circle is: "+area);
		System.out.printf("%.2f",area);
		
		sc.close();

	}

}
