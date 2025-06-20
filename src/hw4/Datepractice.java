package hw4;

import java.util.Scanner;

public class Datepractice {
	
	public static void main(String[] args) {
		
		Scanner date_input = new Scanner(System.in);
		System.out.print("請輸入yyyy年mm月dd日:");
		int year = date_input.nextInt();
		int month = date_input.nextInt();
		int day = date_input.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("沒有這個月份!");
			date_input.close();
			return;
		}
		
		int[] days_in_month = {31, 28, 31, 30, 31, 30, 
							   31, 31, 30, 31, 30, 31};
		
		boolean is_leap = (year % 4 == 0);
		if (is_leap) {
			days_in_month[1] = 29;
		}
		
		if (day < 1 || day > days_in_month[month - 1]) {
			System.out.println("沒有這個日期!");
			date_input.close();
			return;
			
		}
		
		int total = 0;
		for (int i = 0; i < month - 1 ; i++) {
			total += days_in_month[i];
		}
		
		total += day;
		
		System.out.println("輸入的日期為該年的第" + total +"天");
		
		date_input.close();
	}
		
		
}
