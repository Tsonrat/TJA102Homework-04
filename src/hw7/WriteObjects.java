package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat("Kitty");
		Dog dog = new Dog("Doggy");
		
		File folder = new File("C:\\data");
		if (!folder.exists()) {
			if (folder.mkdirs()) {
				System.out.println("資料夾已建立 :" + folder.getPath());	
			}
			else {
				System.out.println("無法建立資料夾!");
				return;
			}
		}
		
		try {
			FileOutputStream output = new FileOutputStream("C:\\\\data\\Object.ser");
			ObjectOutputStream write = new ObjectOutputStream(output);
			
			write.writeObject(cat);
			write.writeObject(dog);
			
			System.out.println("物件已成功寫入!");
			
			write.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
