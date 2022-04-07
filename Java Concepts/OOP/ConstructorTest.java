class SuperApp{	
	SuperApp(int i){
		System.out.println("SuperApp int param Constructor");
	}
}
class SubApp extends SuperApp{	
	SubApp(int i){
	super(11);		
		System.out.println("int param");
	}
}
class ConstructorTest{
	public static void main(String[] args){
		SubApp a1 = new SubApp(11);
		//System.out.println("Hello ");
	}
}