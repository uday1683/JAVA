package All_PROGRAMS_OF_JAVA;

import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"* "+i+" = "+n*i);
		}
		sc.close();
	}

}
