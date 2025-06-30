package hw5;

public class InkBrush extends Pen{
	
	public InkBrush(String brand, int price) {
		super(brand, price);
	}

	public void write() {
		System.out.println(getbrand() + "毛筆書寫，\n售價為:" + getprice());
	}
	
	public int getprice() {
		return (int)(super.getprice() * 0.9);
	}

}
