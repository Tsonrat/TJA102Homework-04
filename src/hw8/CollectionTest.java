package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	
	public static void main (String[] args) {
		
		List<Object> list = new ArrayList<>();
		Object object = new Object();
		
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(object);
		list.add("snoopy");
		list.add(new BigInteger("1000"));
		
		
		System.out.println("=== Iterator ===");
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
			
		System.out.println("=== for-each ===");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== 移除非Number ===");
		Iterator<Object> remove = list.iterator();
		while (remove.hasNext()) {
			Object obj = remove.next();
			if(!(obj instanceof Number)) {
				System.out.println("移除 : " + obj);
				remove.remove();
			}
		}
		
		System.out.println("=== 移除後剩下 ===");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		
	}
}
