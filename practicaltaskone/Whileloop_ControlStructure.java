package practicaltaskone;

import java.util.Scanner;

public class Whileloop_ControlStructure {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Printing numbers in reverse order, decreasing by 2 each time:");
		while(n>=1) {
			System.out.println(n);
			n-=2;
		}
		sc.close();
	}

}
