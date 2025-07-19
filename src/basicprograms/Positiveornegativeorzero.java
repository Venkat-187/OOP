package basicprograms;
import java.util.Scanner;

public class Positiveornegativeorzero {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if (n>0) {
			System.out.println("The number is positive.");
		}
		else if(n<0) {
			System.out.println("The number is negative.");
		}
		else {
			System.out.println("The number is zero.");
		}
		sc.close();
	}

}
