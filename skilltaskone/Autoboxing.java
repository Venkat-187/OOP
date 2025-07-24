package skilltaskone;

public class Autoboxing {

	public static void main(String[] args) {
		int n=256;
		Integer i=n;
		System.out.println("Original Number: "+n);
		Integer d=Integer.valueOf(n);
		System.out.println("After Autoboxing: "+i);
		System.out.println("After Converting Explicitly: "+d);
	}
}
