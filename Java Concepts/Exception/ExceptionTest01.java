class ExceptionTest01{
	static int m1(){
	try{
				System.out.println("Outer try ");
				try{
					System.out.println("Inner  try ");
					int i=10/0;
				}catch(NullPointerException e){
					System.out.println("Inner  catch ");
				}
		}catch(NumberFormatException e){
			System.out.println("Outer catch ");
		}		
		finally{
			System.out.println("finally block ");
			return 10;
		}
		
		//return 10;
	}	
	public static void main(String[] args){
		int n=m1();
		System.out.println("main method  "+n);
	}
}