package practicaltaskone;

public class Operators {

	public static void main(String[] args) {
        int x = 55;
        int y = 45;
        int add = x + y;          
        int sub = x - y; 
        int prod = x * y;
        int quotient = x / y; 
        int remainder = x % y;
        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + add);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println();
        
        System.out.println("\nRelational Operators:");
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y)); 
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y)); 
        System.out.println();
        
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("b1 && b2: " + (b1 && b2)); 
        System.out.println("b1 || b2: " + (b1 || b2)); 
        System.out.println("!b2: " + (!b2));

	}

}
