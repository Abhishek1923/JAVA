class A{
	A(){
		System.out.println("A Object ");
	}
}
class B{
	B(){
		System.out.println("B Object ");
	}
}
class C{
	C(){
		System.out.println("C Object ");
	}
}
class DynamicObjectCreation{
	public static void main(String[] args)throws Exception{
		Class.forName(args[0]).newInstance();
	}
}