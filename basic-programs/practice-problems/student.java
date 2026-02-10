import java.util.scanner;
class student
{
	String name;
	int age;
	int id;
	 void displayDetail()
	{
String status = "active";
System.out.println("ID is "+id);
System.out.println("NAME is "+name);
System.out.println("AGE is "+age);
System.out.println("STATUS is "+status);

	}
	public static void main(String args[])
	{
		Student s1 = new scanner();
		Scanner sc = new Scanner (System.in());
		System.out.println("enter the id of the student");
		s1.id = sc.nextInt();
		System.out.println("enter the name of the student");
		s1.name = sc.nextInt();
		System.out.println("enter the age of the student");
		s1.age = sc.nextInt();
		s1.displayDetail();
	}
}


		