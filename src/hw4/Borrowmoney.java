package hw4;

import java.util.Scanner;

public class Borrowmoney {

	public static void main(String[] args) {
		
		//借錢問題
		
		int[][] data = {
				{25, 32, 8, 19, 27},
				{2500, 800, 500, 1000, 1200}
		};
		
		Scanner borrow = new Scanner(System.in);
		System.out.print("請輸入想借多少:");
		int amout = borrow.nextInt();
		
		int count_borrowable = 0;
		System.out.println("有誰錢夠借你:");
		
		for (int i = 0; i < data[0].length; i++) {
			if(data[1][i] >= amout) {
				System.out.println(data[0][i] + " ");
				count_borrowable++;
			}
		}
		
		System.out.println();
		System.out.println("一共有" + count_borrowable + "人可以借你錢");
		borrow.close();
	}

}
