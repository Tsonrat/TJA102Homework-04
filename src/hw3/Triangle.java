package hw3;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸出三角形三邊長:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Math.max(a, Math.max(b, c));
		int sum = a*a + b*b + c*c - max*max ;
		
		if(a + b > c && a + c > b && b + c > a) {
			if(a == b && b == c) {
				System.out.println("此三角形為正三角形");
			}
			else if (a == b || b == c || a == c) {
				System.out.println("此三角形為等腰三角形");
			}
			else if (max*max == sum) {
				System.out.println("此三角形為直角三角形");
			}
			else {
				System.out.println("此三角形為其他三角形");
			}
		}
		else {
			System.out.println("不是三角形");
		}
		sc.close();
	}

}
