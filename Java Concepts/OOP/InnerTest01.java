class Outer{
	int x=10;
	static class Inner{
		 int y=20;
		void m1(){
			System.out.println("m1 from inner "+new Outer().x);
		}//m1
	}//inner
	//Inner i = new Inner();
	void m2(){		
		System.out.println("m1 from inner "+new Inner().y);
	}
}
class InnerTest01{
	public static void main(String[] args){
		//Outer o = new Outer();
		//o.m2();
		Outer.Inner in = new Outer.Inner();
		in.m1();
	}
}