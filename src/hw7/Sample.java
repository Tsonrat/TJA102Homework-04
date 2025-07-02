package hw7;

import java.io.*;


public class Sample {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Workspace_LUNA_TJA102\\Homework-04\\src\\hw7\\Sample.txt";
		
		int linecount = 0;
		int charcount = 0;
		int bytecount = 0;
		
		try {
			File readedfile = new File(filePath);
			bytecount = (int) readedfile.length();
			
			BufferedReader read = new BufferedReader(new FileReader(readedfile));
			String line;
			
			while((line = read.readLine()) != null) {
				linecount++;
				charcount += line.length();
			}
			read.close();
			
			System.out.println("Sample.txt 檔案共有\n" + bytecount + " 個位元組\n"
								+ charcount + " 個字元\n" 
								+ linecount + " 列資料");
			
		}catch (IOException e) {
			System.out.println("讀取錯誤: " + e.getMessage());
		}
	}

}
