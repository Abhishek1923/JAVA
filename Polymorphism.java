//Method Signature represents the method name along with methop parameters.
/*difference in the number of parameters passed to the methods.
difference in the data types of parameters.
difference in the sequence lorderliness) of the parameters.*/

//Dynamic Polymorphism

//METHOD OVERLOADING
class Sample{
	void add(int a,int b){
		System.out.println("Sum of a and b is: "+(a+b));
	}
	void add(int a,int b,int c){
		System.out.println("Sum of a,b and c is: "+(a+b+c));
	}
}

class Polymorphism{
	public static void main(String[] args) {
		Sample s = new Sample();

		s.add(1,2);
		s.add(1,2,3);
	}
}