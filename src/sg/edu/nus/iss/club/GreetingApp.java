package sg.edu.nus.iss.club;

import java.time.LocalDateTime;

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
	}
}
