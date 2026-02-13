class ConstructorExample{
int id;
String name; 
int age; 

public ConstructorExample(){
	System.out.println("Construct program");
}

public ConstructorExample(int id,String name ,int age){
	
	this.id = id;
	this.name = name;
	this.age = age;
}

void display(){
	System.out.println("ID:" + id);
	System.out.println("Name:" + name);
	System.out.println("Age:" + age);
	
}
public static void main(String[]args){
ConstructorExample c = new ConstructorExample(1,"Drishya",19);
System.out.println(c);
c.display();


 }
}