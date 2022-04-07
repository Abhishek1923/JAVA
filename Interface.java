/*INTERFACE: a class that contains only abstract methods and there are no concrete methods.
Abstract methods are not complete so it is not possible to create an object to an interface
So a separate class(implementation class) is created which implements all the methods of an interface.

All ihe methods of the interface are public and abstract.
Interface methods are public since they should be available to third party vendors to provide
implementation. They are abstract because their implementation is left for third party vendors.

*/

interface A{
	void connect();//by default it is abstract and public
	void disconnect();
}

class B implements A{
	public void connect(){
		System.out.println("Connecting to B...");
	}
	public void disconnect(){
		System.out.println("Disconnecting to B...");
	}
}

class Interface{
	public static void main(String[] args) {
		B b=new B();
		b.connect();
		b.disconnect();
	}
}