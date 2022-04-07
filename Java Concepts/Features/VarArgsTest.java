class A{
	void m1(int n){
		System.out.println("int - argt");
	}
	void m1(int... n){
		System.out.println("var - argt");
	}
}
class VarArgsTest{
	public static void main(String[] args){
		A a = new A();
		a.m1(); //var
		a.m1(11);//int
		a.m1(10,20);//var
		a.m1('A');//int 
	}
}