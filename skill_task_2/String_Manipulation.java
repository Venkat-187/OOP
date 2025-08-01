package skill_task_2;

public class String_Manipulation {

	public static void main(String[] args) {
		String str = " This is java ";
		
		System.out.println("Length: " + str.length());
		System.out.println("Trimmed: " + str.trim());
		System.out.println("Uppercase: " + str.toUpperCase());
		System.out.println("Lowercase: " + str.toLowerCase());
		System.out.println("Equals 'this is java': " + str.trim().equals("this is java"));
		System.out.println("EqualsIgnoreCase 'this is java': " + str.trim().equalsIgnoreCase("this is java"));
		System.out.println("Index of 'j': " + str.indexOf('j'));
		System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));
		System.out.println("Char at index 7: " + str.charAt(7));
		System.out.println("Substring (5, 13): " + str.substring(5, 13));
		System.out.println("Replace 'a' with '#': " + str.replace('a', '#'));
		System.out.println("Starts with ' This': " + str.startsWith(" This"));
		System.out.println("Ends with 'ava ': " + str.endsWith("ava "));
		System.out.println("Contains 'java': " + str.contains("java"));
		System.out.println("Is empty: " + str.isEmpty());
	}

}
