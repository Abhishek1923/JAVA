abstract class Abc{
	Abc(){
		System.out.println("Abc constructor");
	}
	abstract void m1();
}
class AbcSub extends Abc{
	void m1(){
		System.out.println("M1 method");
	}
}
class AbstractTest{
	public static void main(String[] args){
		AbcSub a = new AbcSub();
		a.m1();
	}
}