class Duck{
	int size;
	/*public Duck(){
		System.out.println("Quack");
	}
	public void setSize(int newSize){
		size=newSize;
	}*/
	public Duck(int duckSize){
		System.out.println("Quack");
		size=duckSize;
		System.out.println("Size is "+size);
	}
}
public class useDuck{
	public static void main(String[] args) {
		/*Duck d=new Duck();
		error because Duck creation is a 2 part process:
		one to call the constructor and one to call the setter.
		d.setSize(20);*/

		Duck d =new Duck(20);
	}
}