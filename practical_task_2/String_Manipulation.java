package practical_task_2;

public class String_Manipulation {

	public static void main(String[] args) {
		String str = "Ferrari";
	    System.out.println("Original String: " + str);
	    System.out.println("Uppercase: " + str.toUpperCase());
	    System.out.println("Lowercase: " + str.toLowerCase());
	    System.out.println("Substring (1,4): " + str.substring(1, 4));
	    System.out.println("Replaced 'e' with '@': " + str.replace('e', '@'));
	    System.out.println("Length of the string: " + str.length());
	    System.out.println("Is empty?: " + str.isEmpty());
	    System.out.println("Char at index 3: " + str.charAt(3));
	    System.out.println("Contains 'err'?: " + str.contains("err"));
	    System.out.println("Index of 'i': " + str.indexOf('i'));
	    System.out.println("Starts with 'Fer': " + str.startsWith("Fer"));
	    String str2 = "  This is a Ferrari  ";
	    System.out.println("New String with leading and trailing spaces: "+str2);
	    System.out.println("Trimmed: " +str2.trim());
	}

}
