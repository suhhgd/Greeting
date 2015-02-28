package sg.edu.nus.iss.club;

import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

public class GreetingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Adding greeting based on the time of the day 
		
		int hour = LocalDateTime.now().getHour();
		if (hour <12){
			System.out.println("Good Morning!!!");
		}else if(hour < 16){
			System.out.println("Good Afternon!!!");
		}else {
			System.out.println("Good Night!!!");
		}
		System.out.println("Good Day!!!");
		
		//Su added.. print out current date time.
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Date Format"+dateFormat.format(date)); //2014/08/06 15:59:48		
		System.out.println("LocalDateTime.Now()"+LocalDateTime.now());
		System.out.println("LocalDate.Now()"+LocalDate.now());
		System.out.println("ZonedDateTime.Now()"+ZonedDateTime.now());
		
		
		//Making 1 change
	}
}
