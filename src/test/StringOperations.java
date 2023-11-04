package test;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Shiva mounika insia amma nana";
		
		
		System.out.println("Total num of chars" +str1.length());
		
		String str2 ="I live in Ballymeena";
		System.out.println("My location"+str2.length());
		System.out.println("6th chara is " + str1.charAt(10));
		System.out.println("last char is "+str1.charAt(str1.length()-1)); 
		System.out.println("Upper case "+ str1.toUpperCase());

	}

}
