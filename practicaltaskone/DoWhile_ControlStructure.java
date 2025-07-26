package practicaltaskone;

import java.util.Scanner;

public class DoWhile_ControlStructure {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		System.out.println("Counting from Reverse with a step of 2:");
		do {
			System.out.println(num);
			num-=2;
		}while(num>0);
		
		sc.close();
		
	}

}
