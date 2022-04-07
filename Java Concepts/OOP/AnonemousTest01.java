interface I1{
	void m1();
}
class AnonemousTest01{
	public static void main(String[] args){
		I1 i = new I1(){
			public void m1(){
				System.out.println("m1 implementation");
			}
		};
		i.m1();
	}
}