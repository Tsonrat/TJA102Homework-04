package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	
	public static void main(String[] args) {
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		try {
			
			FileInputStream input = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream read = new ObjectInputStream(input);
			
			while (true) {
				
				try {
				Object obj = read.readObject();
					if (obj instanceof Pet) {
						pets.add((Pet) obj);
					}
				} catch (EOFException e) {
					break;
				}
			}
			
			read.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		for (Pet pet : pets) {
			System.out.print("第" + (++count) + "筆:");
			pet.speak();
		}
	}
}