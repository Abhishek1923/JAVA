class Static_Block{
	static int i;
	
	Static_Block(){
		System.out.println("a constructor called");
	}
	static { 
      //  i = 10; 
        System.out.println("static block called "); //it is executed only once whether we create more than 1 object
    } 
}
class Test{
	public static void main(String[] args) {
		Static_Block t = new Static_Block();
		System.out.println(Static_Block.i);
	}
}