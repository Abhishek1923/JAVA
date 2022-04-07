public class Variable{
	int count=0;              //output: 2  1
	//static int count=0;       //output: 3 3
	public void increment(){
		count++;
	}
	public static void main(String[] args) {
		Variable o1=new Variable();
		Variable o2=new Variable();
		o1.increment();
		o2.increment();
		o1.increment();
		System.out.println("result:"+o1.count);
		System.out.println("result:"+o2.count);
	}
}