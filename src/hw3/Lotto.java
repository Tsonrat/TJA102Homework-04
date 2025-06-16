package hw3;


import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		boolean[] avanum = getNumbers(sc);
		int count = printNumbers(avanum);
		
		if (count < 6) {
			System.out.println("可選號碼少於6個!");
		}
		else {
			int[] result = getLottoNumbers(avanum);
			
			System.out.println("本次隨機選出的六個號碼為:");
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
				
		}
		
		sc.close();
	}
	
	public static boolean[] getNumbers(Scanner sc) {
		
		boolean[] avanum = new boolean[50];
		Arrays.fill(avanum, true);
		
		while (true) {
			System.out.print("請輸入你討厭哪個數字(1~49)/(輸入0結束):");
			int input = sc.nextInt();
			
			if (input == 0) 
				break;
			
			if (input < 1 || input > 49) {
				System.out.println("請輸入正確的號碼(1~49)!");
			}
			else if (avanum[input] == false) {
				System.out.println("這個號碼已經被排除了!");
			}
			else {
				avanum[input] = false;
			}
		}
		return avanum;
	}
	
	
	public static int printNumbers(boolean[] avanum) {
		System.out.println("你可以選擇的號碼有:");
		int count = 0;
		
		for (int i = 1; i <= 49; i++) {
			if (avanum[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n總共還有:" + count + "個號碼可以選");
		return count;
	}
	
	
	
	public static int[] getLottoNumbers(boolean[] avanum) {
		
		int[] result = new int[6];
		int selected = 0;
		
			
		while (selected < 6) {
			int r = (int)(Math.random() *49 ) + 1;
			
			if (avanum[r]) {
				boolean alredychoose = false;
				for (int i = 0; i < selected; i++) {
					if (result[i] == r) {
						alredychoose = true;
						break;
					}
				}
				if (alredychoose == false) {
					result[selected] = r;
					selected++;
				}
			}
		}
		
		Arrays.sort(result);
		return result;
	}
}
	