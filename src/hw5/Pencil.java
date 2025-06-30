package hw5;

public class Pencil extends Pen{

	public Pencil(String brand, int price) {
		super(brand, price);
	}

	public void write() {
		System.out.println(getbrand() + "鉛筆書寫，\n售價為:" + getprice());
	}
	
	public int getprice() {
		return (int)(super.getprice() * 0.8);
	}
}
