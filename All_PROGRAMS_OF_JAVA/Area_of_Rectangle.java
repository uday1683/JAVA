package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Area_of_Rectangle {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length : ");
		double length=sc.nextDouble();
		System.out.println("enter breadth : ");
		double breadth=sc.nextDouble();
		
		double area=length*breadth;
		System.out.println("Area Of Reactangle is:"+area);
		sc.close();

	}

}
