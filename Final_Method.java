//Final Methods
/*Methods which are declared as 'final' are called final methods.
Final methods cannot be override because they are not available to the sub classes. 
Therefore, only method overloading is performed with final methods.

benifits of using final: 
The performance Will be better.
When the programmer does not want others to override his method, he should declare his
method as 'final'.*/


class A{
	final void method1(){
		System.out.println("Hi");
	}
}

class B{
	void method2(){
		A a=new A() ;
		
		a.method1();//calling final method 	(inline operation)
	}
}

class Final_Method{
	public static void main(String[] args) {
		B b=new B();
		b.method2();

	}
}


/*NOTE:Neither the private methods nor the final methods can be overridden.
 So, private methods can be taken as final methods. */