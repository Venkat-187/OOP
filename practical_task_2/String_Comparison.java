package practical_task_2;

public class String_Comparison {

	public static void main(String[] args) {
		String str_1 = "Bentley";
	    System.out.println("First String: " + str_1);
	    String str_2 = "bentley";
	    System.out.println("Second String: " + str_2);
	    String str_3 = new String("Bentley");
	    System.out.println("Third String: " + str_3);
	    
	    System.out.println("First String == Second String?" + (str_1==str_2) );
	    System.out.println("First String == Third String? " + (str_1==str_3) );
	    
	    System.out.println("Equals Case where str = 'Bentley': " + str_1.equals("Bentley"));
	    System.out.println("Equals Ignore Case where str = 'bentley': " + str_1.equalsIgnoreCase(str_2));
	    
	    System.out.println("CompareTo method with first and third string : " + str_1.compareTo(str_3));
	}

}
