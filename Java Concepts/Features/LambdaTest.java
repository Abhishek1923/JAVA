@FunctionalInterface
interface Inter{
	void m1();
}
/*
class InterImple implements Inter{
	public void m1(){
		System.out.println("m1 impl");
	}
}*/
class LambdaTest{
	public static void main(String[] args){
		Inter i = ()->{System.out.println("m1 impl 1");
			System.out.println("m1 impl 2");};
		i.m1();
	}
}