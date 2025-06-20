package hw4;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal a = new Animal(3, 8);
		Elephant b = new Elephant(8, 1200,"大象");
		
		a.speak();
		System.out.println("==============");
		b.speak();
		
	}

}
