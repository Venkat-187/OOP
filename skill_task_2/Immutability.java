package skill_task_2;

public class Immutability {

	public static void main(String[] args) {
		String str1 = "This is java";
		String str2 = str1.concat(" programming");
		
		System.out.println("Original String: " + str1);
		System.out.println("Modified String: " + str2);
		System.out.println("Is the original string the same as the modified one? " + (str1 == str2));

	}

}
