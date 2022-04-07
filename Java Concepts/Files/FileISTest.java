import java.io.*;
class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class SerialAndDeSerialTest{
	public static void main(String[] args)throws Exception{
		Student s = new Student(11,"Neelu",35);
		FileOutputStream fos = new FileOutputStream("stude.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Serialzation done !!!");	
	}
}