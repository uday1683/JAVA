package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		String input=sc.nextLine();
		
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			rev+=input.charAt(i);
		}
		
		if(input.equals(rev))
		{
			System.out.println("Given Input is Palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
		
		sc.close();

	}

}
