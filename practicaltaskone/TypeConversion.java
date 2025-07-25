package practicaltaskone;
import java.util.Scanner;

public class TypeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int i = sc.nextInt();
        float f = i;  
        System.out.println("Implicit conversion from int to float: " + f);

        System.out.print("Enter a floating-point number: ");
        float n = sc.nextFloat();  
        int d = (int) n;  
        System.out.println("Explicit conversion from float to int: " + d);

        sc.close();
	}

}
