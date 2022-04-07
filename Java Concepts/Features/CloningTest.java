class CloningTest implements Cloneable{
	void m1(){
		System.out.println("Hello m1 ");
	}
	public static void main(String[] args)throws CloneNotSupportedException{
		CloningTest a = new CloningTest();
		Object o = a.clone();
		CloningTest a2 = (CloningTest)o;
		a2.m1();
		System.out.println("Cloning Done ");		
	}
}