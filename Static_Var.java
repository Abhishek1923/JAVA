class Static_Var{
	static int i;
	public static final int MY_VAR=27;//we have to initialize the static final
	public static void main(String[] args) {
		Static_Var s=new Static_Var();
		System.out.println(i);//0
		System.out.println(s.i);//0
		System.out.println(s.i=45);//45
		System.out.println(i);//45
		System.out.println(i+1);//46
		System.out.println(i+1);//46 --because variable is static
		System.out.println(MY_VAR);
	}
}