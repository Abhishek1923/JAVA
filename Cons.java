class Cons{
	Cons(){
		System.out.println("Cons");
	}
}
class Test{
	public static void main(String[] args) {
		Cons c=new Cons();
		System.out.println(c);
	}
}