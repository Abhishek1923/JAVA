class App01{
	void m1(int i1, float f1){
		System.out.println("int float method");
	} 
	void m1(float f2, int i2){
		System.out.println("float int method");
	} 
}

class OverLoadingTest{
	public static void main(String[] args){
		App01 a1 = new App01();
		a1.m1(11, 11);
		//System.out.println("Happy Learning !!!");
	}
}