package hw3;

import java.util.Scanner;

public class Random {
	
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		String playagain;
		
		do {
		
			number = (int)(Math.random() *101);
			System.out.println("猜一個數字(0~100):");
			int guess = sc.nextInt();
			int guesses = 0;
			
			while(guess != number) {
				
				guesses += 1;
				
				if (guess < number) {
					System.out.println("太小了，再試一次");
				}
				else {
					System.out.println("太大了，再試一次");
				}
			guess = sc.nextInt();
			}
			System.out.println("你猜對了，答案是:" + number +"\n你總共猜了" + guesses +"次!");
			System.out.println("還要再玩一次嗎(y/n)?");
			sc.nextLine();
			playagain = sc.nextLine().toLowerCase();
		} while (playagain.equals("y"));
		
		System.out.println("感謝您的遊玩!");
		sc.close();
	}
}
