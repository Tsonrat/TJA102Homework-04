package hw5;

public class RandAvg {
	
	public static void randAvg() {
		
		int randnum;
		int sum = 0;

		for (int i = 0; i < 11; i++) {
		randnum = (int)(Math.random() *101);
		System.out.print(randnum + " ");
		sum += randnum;			
		}
		
		int avg = sum / 10;
		System.out.println("\n亂數平均值為: \n" + avg);
	}
	
	public static void main(String[] args) {
		
		System.out.println("本次亂數結果:");
		randAvg();

	}
}


