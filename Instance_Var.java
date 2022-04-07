class Instance_Var{
	int i=10;//instance variable
	public static void main(String[] args) {
		Instance_Var t=new Instance_Var();
		System.out.println(t.i);//non-static variable i cannot be referenced from a static context
	/*Instance variable can only be accessed by Object of the class only as above.*/
	}
}