package practicaltaskone;

import java.util.Scanner;

public class ForLoop_ControlStructure {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Reverse Order: ");
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}
		sc.close();
	}

}
