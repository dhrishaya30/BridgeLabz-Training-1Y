import java.util.Scanner;
class Array{
public static void main (){
Scanner sc=new Scanner(System.in);
int marks[] = {12,14,16,18,20};
for(int i= 0;i<marks.length;i++){
System.out.println(marks[i]);
}
System.out.println("Enter your element: ");
int m=sc.nextInt();
for(int i=0;i<marks.length;i++){
if(marks[i]==m){
System.out.println("Number found at idx: "+i);
}
}
}
}








