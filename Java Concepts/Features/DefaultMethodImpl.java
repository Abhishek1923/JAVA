interface DefaultMethod{
	void m1();
	default void m2(){
		System.out.println("Hi from Default Method");
	}
}
class DefaultMethodImpl implements DefaultMethod{
	public void m1(){
		System.out.println("m1 method");
	}
	public static void main(String[] args){
		DefaultMethod dm = new DefaultMethodImpl();
		dm.m1();
		dm.m2();
	}
}