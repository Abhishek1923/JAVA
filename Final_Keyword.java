//For static variables

public class Final_Keyword{
	
	//public static final int FINAL=73;
	public static final int FINAL;/*Final_Keyword.java:3: error: variable FINAL not initialized in the default constructor
*/
	/*static{
		FINAL=73;
		//FINAL=(int)Math.random();
	}*/
	public static void main(String[] args) {
			System.out.println(FINAL);
		}	
}


//For non-static variables

class Foof {
final int size = 3;
final int whuffie;
Foof() {
whuffie = 42;
}
void doStuff(final int x) {
// you can’t change x
}
void doMore() {
final int z = 7;
// you can’t change z
}
}