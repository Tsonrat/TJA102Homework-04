package hw5;

import java.util.Scanner;

public class StarSquare {
	
	//請設計一個方法為starSquare，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	
	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*")	;	
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int width = input.nextInt();
		int height = input.nextInt();
		
		starSquare(width, height);
		
		input.close();
	}

}
