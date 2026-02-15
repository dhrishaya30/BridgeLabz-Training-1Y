import java.util.Scanner;
class MethodExample{
	
	static int addition(int a,int b){
		
		return a+b;
		
	}
	
	int Subtraction(int a , int b ){
		
		
		return a-b;
	}
	
	
	public static void main(String[]args){
		
		MethodExample sc = new MethodExample();
		
		Scanner nm = new Scanner(System.in);
		
		
		int a = nm.nextInt();
		int b = nm.nextInt();
		
		int sum = addition(a,b);
		
		int sub = sc.Subtraction(a,b);
		
		System.out.println("sum"+sum);
		System.out.println("sub" + sub);
		
		
		
		
		
		
		
		
		
		
	}
}