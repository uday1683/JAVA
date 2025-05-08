package All_PROGRAMS_OF_JAVA;
import java.util.Scanner;

public class LargestOfThreeVariblesUsingTernary {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a=sc.nextInt();
		System.out.println("Enter b value : ");
		int b=sc.nextInt();
		System.out.println("Enter c value : ");
		int c=sc.nextInt();
		
		String result=((a>b&b>c)?"a is big":(b>a&b>c)?"b is big":"c is big");
		System.out.println(result);
		
		sc.close();
	}

}
