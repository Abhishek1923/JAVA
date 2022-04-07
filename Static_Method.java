//Polymorphism with Static Methods
/*A static method is a method whose single copy in memory is shared by all the objects of the class.
It belong to the class rather than to the objects. So they are also called class methods.
When static methods are overloaded or overridden, since they do not depend on the objects,
the Java compiler need not wait till the objects are created to understand which method is called .*/

class Base{
	static void display(double x){
		System.out.println("Square of x: "+(x*x));
	}
}

class Child extends Base{
	static void display(double x){
		System.out.println("Square root of x: "+Math.sqrt(x));
	}
}

class Static_Method{
	public static void main(String[] args) {
		Child c=new Child();
		c.display(16);

		Base b=new Child();//now the base class method is called
		b.display(16);
	}
}


//NOTE: Private methods are not available in the sub classes, so they cannot be overridden.
