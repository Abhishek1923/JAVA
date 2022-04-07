/*Method Overloading: Writing two or more methods in the same class in such a way that each method has same name but with different method signatures - is called method overloading.

Method Overriding: Writing two or more methods in super and sub classes such that the methods have same name and same signature - is called method overriding.*/

//METHOD OVERRIDING
class Base{
	void display(double x){
		System.out.println("Square of x: "+(x*x));
	}
}

class Child extends Base{
	void display(double x){
		System.out.println("Square root of x: "+Math.sqrt(x));
	}
}

class Method_Overriding{
	public static void main(String[] args) {
		Child c=new Child();
		c.display(16);

		Base b=new Child();//it also calls child class method
		b.display(16);
	}
}


//for calling the Base class method we use static keyword before methods	