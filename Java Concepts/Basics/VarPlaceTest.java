class VarPlaceTest{

	void m1(){
		System.out.println("Hello m1 y "+y);
	}
	public static void main(String[] args){
		System.out.println("Hello "+x);
		VarPlaceTest v = new VarPlaceTest();
		v.m1();
	}
	static int x=11;
	int y=22;
}