
class Book{
	void Book(){
			System.out.println("I'm from Book");
	}	
}
class Reference{
	public static void main(String[] args) {
		Book b1=new Book();
		b1.Book();
		Book b2=new Book();
		b2.Book();
		Book b3=b2;
		b3.Book();
		b3=b1;
		b3.Book();
		b3=null;
		//b3.Book();
		/*Exception in thread "main" java.lang.NullPointerException at Reference.main(Reference.java:18)*/
	}
}