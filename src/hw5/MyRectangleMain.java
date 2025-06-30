package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		
		//使用無參數建構子
		MyRectangle r1 = new MyRectangle();
		
		r1.setWidth(10);
		r1.setDepth(20);
		
		System.out.println("無參數建構子的長方形的面積為:" + r1.getArea());
		
		//使用有參數建構子
		MyRectangle r2 = new MyRectangle(10,20);
		
		System.out.println("有參數建構子的長方形面積為:" + r2.getArea());
		
	}
	
}
