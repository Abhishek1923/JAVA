class Test{
	int x=11;
	static void m1(float f){
		System.out.println("Hello...float Test");
	}
}
class TestChild1 extends Test{
	int x=111;
	static void m1(float f){
		System.out.println("Hello...float TestChild 1");
	}	
}
class TestChild2 extends TestChild1{
	int x=1111;
	static void m1(float f){
		System.out.println("Hello...float TestChild 2");
	}	
}
class BlockTest{
	 static public void main(String[] a){	
		//Object o = new String("java");
		//StringBuffer s = (StringBuffer)o;
		int x =5;
		int y= x++ + ++x;
		System.out.println(x);
		System.out.println(y);
		
	}
}