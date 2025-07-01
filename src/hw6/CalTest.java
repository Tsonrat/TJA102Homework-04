package hw6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		try {
			System.out.println("請輸入x的值:");
			int x = input.nextInt();
			
			System.out.println("請輸入y的值:");
			int y = input.nextInt();
			
			int result = (int) Calculator.powerXY(x, y);
			System.out.println(x + "的" + y + "次方等於" + (int)result);
			input.close();
			
		} catch (java.util.InputMismatchException e) {
			System.out.println("輸入格式不正確!");
			input.close();
		} catch (CalException e) {
			System.out.println(e.getMessage());
			input.close();
		}
	
		
	}

}
