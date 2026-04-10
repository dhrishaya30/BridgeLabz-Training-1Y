public class WrapperAutoExample {
public static void main(String[] args){
//Autoboxing 
int a=10;
Integer i= a; ///Manual Approch
//Integer i= Integer.valueOf(a); //Complier will run internally
System.out.println("Value: "+i);

System.out.println("----------------------");


Integer b=120;
int m=b; //Manual approach
//int m=b.intValue(); //complier side
System.out.println("Unboxing: "+m);


} 
} 