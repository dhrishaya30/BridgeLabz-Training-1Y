public class GenericsPractice{

    public static<T> void swap (T a, T b){
	 system.out.println("Before swapping: "+a+" "+b);
	 T temp = a;
	 a = b;
	 b = temp;
	 System.out.println("After swapping: "+a+" "+b);
	 }
	 public static void main(String[] args){
	 swap( 11,22);
	 swap( "aa", "bb");
	 }
	}