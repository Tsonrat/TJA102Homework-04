package hw7;

import java.io.FileWriter;
import java.io.IOException;

public class AppendData {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Workspace_LUNA_TJA102\\Homework-04\\src\\hw7\\Data.txt";
		
		try {
			
			FileWriter write = new FileWriter(filePath, true);
			System.out.print("寫入的亂數為: ");
			for(int i = 0; i < 10; i++) {
				
				int randnum = (int)(Math.random() * 1000) + 1;
				write.write(randnum + " ");
				System.out.print(randnum + " ");
			}
			
			write.write("\n");
			write.close();
			System.out.println("\n成功寫入10個亂數到Data.txt!");
			
		}catch (IOException e) {
			System.out.println("寫入錯誤 : " + e.getMessage());
		}
	}

}
