package practical_task_2;

public class String_Builder_and_Buffer {

	public static void main(String[] args) {
		StringBuilder strb = new StringBuilder("This is java");
		strb.append(" programming");
		System.out.println("String Builder: " + strb.toString());

		StringBuffer strbf = new StringBuffer("This is java");
		strbf.append(" programming");
		System.out.println("String Buffer: " + strbf.toString());
	}

}
