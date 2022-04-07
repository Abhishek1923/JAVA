import java.io.*;
class Student implements Serializable{
	int rollno;
	String name;
	transient int age;
	Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class SerialAndDeSerialTest{
	static void serial()throws Exception{
		Student s = new Student(11,"Neelu",35);
		FileOutputStream fos = new FileOutputStream("stude.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Serialzation done !!!");	
	}
	static void deserial()throws Exception{
		FileInputStream fis = new FileInputStream("stude.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o=ois.readObject();
		Student s = (Student)o;
		System.out.println("Deatails: "+s.rollno+" "+s.name+" "+s.age);
	}
	public static void main(String[] args)throws Exception{
		serial();
		deserial();
	}
}