package hw5;

public abstract class Pen {
	
	private String brand;
	private int price;
	
	public Pen() {
		
	}

	public Pen(String brand, int price) {
		setbrand(brand);
		setprice(price);
	}
	
	public void setbrand(String brand) {
		this.brand = brand;
		
	}
	
	public void setprice(int price) {
		if(price > 0)
			this.price = price;
		else
			System.out.println("請確認售價設定");
	}
	
	public String getbrand() {
		return brand;
	}
	
	public int getprice() {
		return price;
	}
	
	public abstract void write();
}
