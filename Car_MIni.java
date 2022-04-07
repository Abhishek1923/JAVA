public class Car_Mini{
	public void Mini(){}
	public void Mini(String c){}
	public void Mini(int size){}
}
class Mini extends Car_Mini{
	Color color;
	public Mini(){
		this (Color.Red);
	}
	public Mini (Color c){
		super("Mini");
		color = c;
	}
	public Mini (int size){
	this(Color.Red);
	super(size);
	}
}
//in java getter and setter are 2 methods that are used for retreving & 
//updating the value of a variable 
//They are also known as succesor