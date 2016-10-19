package Day2.Assignment4;

import java.util.Scanner;

public class numberOfDaysInMonth {
	public static void main(String[] args) {
		System.out.println("Please enter the Month (MM) Format followed by Year (YYYY) Format");
		Scanner user_input = new Scanner(System.in);
		String month;
		int year;
		month = user_input.next();
		year = user_input.nextInt();
		user_input.close();

		switch (month) {
		case "04":
			System.out.println("Total Days in the month is 30");
			break;
		case "06":
			System.out.println("Total Days in the month is 30");
			break;
		case "09":
			System.out.println("Total Days in the month is 30");
			break;
		case "11":
			System.out.println("Total Days in the month is 30");
			break;
		case "02":
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println("Total Days in the month is 29");
				break;
			} else {
				System.out.println("Total Days in the month is 28");
				break;
			}
		default:
			System.out.println("Total Days in the month is 31");
		}

	}
}
