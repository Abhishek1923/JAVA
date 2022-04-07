//inner class using interface
interface Power { 
	int x = 720; 
	void getPower(); 
} 
class AnonymousInnerClass 
{ 
	public static void main(String[] args){ 
		Power p1=new Power(){
		@Override
		public void getPower() { 
			// printing the Power
			System.out.println("Power is "+x); 
		} 
	};
	p1.getPower();
	} 
}