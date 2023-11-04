package test;

public class ReverseAStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I am feeling lucky";
		String reverse="";
		
		// rev the string and show in the output
		for(int i=str1.length()-1;i>=0;i--) {
			reverse=reverse+str1.charAt(i);
		}
		System.out.println(reverse);
		
		int num1 = 10282023;
		
		// find the sum of all the digits in num2
		// find out the rev num of num1
		// do not convert this num into string
	}

}
