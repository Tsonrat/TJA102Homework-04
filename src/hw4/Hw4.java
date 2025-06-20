package hw4;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		
		//第一題:陣列平均值和大於平均的索引
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length ;
		System.out.println("陣列平均值為: " + avg);
		
		System.out.print("大於平均值的索引有: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				System.out.print(arr[i] +" ");
			}
		}
		
		//第二題建立反向字串
		Scanner sc = new Scanner(System.in);
		System.out.println("\n請輸入想反向的字串: ");
		String input = sc.nextLine();
		
		char[] reverse_arr = input.toCharArray();
		System.out.println("反轉後的結果: ");
		for (int i = reverse_arr.length - 1; i >= 0; i--) {
			System.out.print(reverse_arr[i]);
		}
		sc.close();
		
		//找出陣列裡，索引的特定元素
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		
		for (int i = 0; i < planets.length; i++) {
			String planets_char = planets[i];
			for (int j = 0; j < planets_char.length(); j++) {
				char ch = planets_char.charAt(j);
				if(ch == 'a' || ch =='e' || ch == 'i' || ch =='o' || ch =='u') {
					count++;
				}
			}
		}
		System.out.println("\n母音的總數為: " + count);

	}
}
