interface I1{
	void m1();
}
interface I2{
	void m1();
}
interface I3 extends I1,I2{
	
} 
class Impl implements I3{
	public void m1(){
		System.out.println("m1 method");
	}
	public void m2(){
		System.out.println("m2 method");
	}
}
class InterfaceTest{
	public static void main(String[] args){
		Impl i = new Impl();
		i.m1();
		i.m2();
	}
}