package skilltaskone;

public class Unboxing {

	public static void main(String[] args) {
		Float n=new Float(102.15f);
		float f=n;
		float e=n.floatValue();
		System.out.println("Original Number: "+n);
		System.out.println("After Unboxing: "+f);
		System.out.println("After Converting Explicitly: "+e);
	}

}
