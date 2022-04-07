class Super{
	Super(){
		System.out.println("Super");
	}
}
class Sub extends Super{
	Sub(){
		System.out.println("Sub");
	}
}
class Test{
	public static void main(String[] args) {	
		Sub s=new Sub();
	}
}