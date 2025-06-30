package hw5;

import java.util.Random;

public class GenAuthCode {
	
	public static String genAuthCode() {
		
		String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] chars = new char[8];
		Random rand = new Random();
		
		for(int i = 0; i < 8; i++) {
			chars[i] = pool.charAt(rand.nextInt(pool.length()));
		}
		
		String code = new String(chars);
		return code;
		
	}
	
	public static void main(String[] args) {
		String code = genAuthCode();
		System.out.println("本次隨機產生的驗證碼為:" + code);
		
	}

}
