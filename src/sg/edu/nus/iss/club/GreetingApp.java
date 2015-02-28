package sg.edu.nus.iss.club;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class GreetingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Good Day!!!");
		
		//Su added.. print out current date time.
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Date Format"+dateFormat.format(date)); //2014/08/06 15:59:48		
		System.out.println("LocalDateTime.Now()"+LocalDateTime.now());
		System.out.println("LocalDate.Now()"+LocalDate.now());
		System.out.println("ZonedDateTime.Now()"+ZonedDateTime.now());
		
		
		
	}

}
