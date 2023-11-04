package test;

public class LoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		while(num1<=5) {
		 System.out.println(num1);
		 num1=num1+1;
		
	}
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		int num2=5;
		while(num2>=1) {
		System.out.println(num2);
		num2=num2-1;			
		}
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			
		}
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		for(int j=2;j<=50;j=(j+2)){
			System.out.println(j);
			
		}
		
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		for(int m=1;m<=50;m=(m+2)) {
			System.out.println(m);
		}
		
		System.out.println("-------------------for each loop---------------");
		int arr[]= {50,54,58,65,25};
		int sum=0;
		for(int i:arr) {
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println("The total is:" +sum);
	}

}
