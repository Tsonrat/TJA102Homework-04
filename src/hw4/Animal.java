package hw4;

public class Animal {
	
	 int age;
	 float weight;
	
	public Animal (int animalage, float animalweight) {
		
		age = animalage;
		weight = animalweight;
		
	}
	
	public void speak() {
		
		System.out.println("年紀:" + age);
		System.out.println("體重:" + weight);
		
	}
	
	public void setAge(int age) {
		this.age = age;	
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public float getWeight() {
		return weight;
	}


}
