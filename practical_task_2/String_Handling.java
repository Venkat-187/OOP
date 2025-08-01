package practical_task_2;

public class String_Handling {

	public static void main(String[] args) {
		String str = "Programming";
	    System.out.println("Original: " + str);
	    System.out.println("Uppercase: " + str.toUpperCase());
	    System.out.println("Substring (1,4): " + str.substring(1, 4));
	    System.out.println("Replaced 'g' with '@': " + str.replace('g', '@'));
	    System.out.println("Length: " + str.length());
	    System.out.println("Equals 'Programming': " + str.equals("Programming"));
	    System.out.println("Equals 'programming' (ignore case): " + str.equalsIgnoreCase("programming"));
	    System.out.println("Is empty: " + str.isEmpty());
	    System.out.println("Char at index 3: " + str.charAt(3));
	    System.out.println("Contains 'ram': " + str.contains("ram"));
	    System.out.println("Index of 'i': " + str.indexOf('i'));
	    String str2 = "  Programming  ";
	    System.out.println("Trimmed: " +str2.trim());

	}

}
