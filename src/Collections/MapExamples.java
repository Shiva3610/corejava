package Collections;

import java.util.HashMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("Nokia", 5000);
		map1.put("Iphone", 100000);
		map1.put("samsung", 76000);
		map1.put("sony", 5000);
		
		System.out.println(map1);
		
		map1.put("Iphone", 120000);
		System.out.println(map1);
		
		map1.remove("Nokia");
		System.out.println(map1);
		
		System.out.println("price of Iphone "+map1.get("Iphone"));
		
		 for (int value:map1.values()) {
			 System.out.println("value is " + value);
		 }

	}

}
