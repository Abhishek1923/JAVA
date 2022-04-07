class SuperTest{
	int x=11;
	 void m1(){
		System.out.println("m1 from SuperTest");
	}
}
class SubTest extends SuperTest{
	int x=111;
	 void m1(){
		System.out.println("m1 from SubTest");
	}
}
class OverRidingTest{
	public static void main(String[] args){
		SuperTest a1 = new SubTest();
		//a1.m1();
		System.out.println("Happy Learning !!! "+a1.x);
	}
}