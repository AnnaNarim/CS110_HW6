package utils;

public class Math {
	
	public static int factorial(int a){
		if (a==0){
			return 1;
		}
		return factorial(a-1)*a;
	}
	
	public static int factorialLoop(int a){
		int n=1;
		for(int i=1;i<=a;i++){
		n= n*i;
		}
		return n;
	}
	
	 public static void main(String []args){
		 
		 System.out.println(Math.factorial(4));
		 System.out.println(Math.factorialLoop(5));
	 }
}
