package practical_task_2;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time_API {
	
		    public static void main(String[] args) {
		    	
		        LocalDateTime now = LocalDateTime.now();
		        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		        System.out.println("Current Date-Time: " + now.format(format));

		        LocalDate startDate = LocalDate.of(2025, 1, 1);
		        Period diff = Period.between(startDate, LocalDate.now());
		        System.out.println("Difference: " + diff.getYears() + " years, " + diff.getMonths() + " months");
		        

		        LocalTime currentTime = LocalTime.now();
		        System.out.println("Current Time: " + currentTime);
		        System.out.println("Time after 1 hour: " + currentTime.plusHours(1));
		        System.out.println("Time before 35 minutes: " + currentTime.minusMinutes(35));
		        
		    }
	}


