package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"innu","shiva","monik"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Eastham");
		list1.add("Barking");
		list1.add("Ballymeena");
		
		System.out.println(list1);
		
		list1.remove(1);
		System.out.println(list1);
		
		list1.add("NI");
		System.out.println("My current location is " + list1.get(list1.size()-1));
		
		
		System.out.println(list1.get(2));
		
		//itreate through loops
		
		for(int i=0;i<list1.size();i++) {
	    if (list1.get(i).equals("NI")) {
	    	System.out.println("The index of NI in list1 is "+i);
	    	
	    	Collections.sort(list1);
	    	System.out.println(list1);
	    	Collections.sort(list1,Collections.reverseOrder());
	    	System.out.println(list1);
	    }
		}

		

	}

}
