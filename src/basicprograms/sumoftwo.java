package basicprograms;
import java.util.Scanner;

public class sumoftwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("The sum of given numbers is "+sum);
		sc.close();
	}

}
