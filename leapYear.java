
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args){
	
		
		int year;

		Scanner SC = new Scanner(System.in);
        System.out.println("enter the year");
		year = SC.nextInt();

		
		if (year % 400 == 0 | year % 4 ==0){
			System.out.println(" : Leap Year");
		}
        else {
			
			System.out.println(" : Not Leap Year");
		}
	}
}

