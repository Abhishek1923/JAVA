interface MyInterface{
	int x=11;
	void m1();
}
class Test implements MyInterface{
	public void m1(){
		System.out.println("Hello m1 of MyInterface");
	}
}
class ArrayTest{
	public static void main(String[] a){
		MyInterface t = new Test();
		t.m1();
		System.out.println("Hello Array...");
	}
}