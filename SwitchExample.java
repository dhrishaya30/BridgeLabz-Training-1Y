import java.util.Scanner;
class SwitchExample{
 public static void main(String[] args){
 Scanner ab = new Scanner (System.in);
 int a;
 System.out.print("Enter the number :");
 a = ab.nextInt();
 switch(a){
 case 1 : System.out.print("HELLO WORLD");
 break;
 case 2 : System.out.print("HELLO JAVA");
 break;
 default : System.out.print("Heeeeyyyyy");
 break;
 }
 
 ab.close();
 }
 }
 
 