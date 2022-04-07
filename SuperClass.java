//super class
//by default sub class members are accessible
class Parent{
	int i=29;
	void show(){
		System.out.println("parent class method i="+i);
	}
}

class Child extends Parent{
	int i=77;
	void show(){
		System.out.println("child class method i="+i);

		super.show();//calling super class method by using super keyword
		System.out.println("super i="+super.i);//super class value is printed
	}
}

class Super{
	public static void main(String[] args) {
		Child c=new Child ();
		c.show();
	}
}

/*if we create default constructors then sub class have access to parent class constructors ,
there is no need of using super keyword
But in case of parameterised constructors we can use super keyword to access the super class 
parameterized constructors 

*/