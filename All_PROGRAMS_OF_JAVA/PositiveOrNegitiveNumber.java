package All_PROGRAMS_OF_JAVA;
import java.util.Scanner;

public class PositiveOrNegitiveNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		int input=sc.nextInt();
		
		
		if(input%2==0)
		{
			System.out.println("Positive Numbe");
		}
		else
		{
			System.out.println("Negitive Number");
		}
		
		sc.close();

	}

}
