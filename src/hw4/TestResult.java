package hw4;

public class TestResult {
	
	public static void main(String[] args) {
		
		int[][] score= { 
						{10, 35, 40, 100, 90, 85, 75, 70},
						{37, 75, 77, 89, 64, 75, 70, 95},
						{100, 70, 79, 90, 75, 70, 79, 90},
						{77, 95, 70 ,89, 60, 75, 85, 89},
						{98, 70, 89, 90, 75, 90, 89, 90},
						{90, 80, 100, 75, 50, 20, 99 ,75}	
		};
		
		int test = score.length;
		int students = score[0].length;
		
		int[] topCount = new int[students];
		
		for (int i = 0; i < test; i++) {
			int maxscore = score[i][0];
			
			for (int j = 0; j < students; j++) {
				if (score[i][j] > maxscore) {
					maxscore = score[i][j];
				}
			}
				
			for (int j = 0; j < students; j++) {
				if (score[i][j] == maxscore) {
					topCount[j]++;
				}
			}
			
			
		}
		for (int i = 0; i < students; i++) {
			System.out.println("第" + (i+1) +"號同學在考試拿到最高分的次數:" + topCount[i]);
		}
		
	}

}
