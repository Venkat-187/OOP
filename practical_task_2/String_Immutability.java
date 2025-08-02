package practical_task_2;

public class String_Immutability {

	public static void main(String[] args) {
		 String str = "This is java";
	     System.out.println("Before concat: " + str);
	     str.concat(" programming"); 
	     System.out.println("After concat before assigning: " + str);
	     str = str.concat(" programming");
	     System.out.println("After concat with assignment: " + str);
	}

}
