class FirstClass{
	synchronized void firstClassMethod(SecondClass sc){
		System.out.println("From firstClassMethod of FirstClass");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		sc.lastMethod();
	}
	//synchronized 
	void lastMethod(){
		System.out.println("From lastMethod of FirstClass");
	}
}
class SecondClass{
	synchronized void secondClassMethod(FirstClass fc){
		System.out.println("From secondClassMethod of SecondClass");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		fc.lastMethod();		
	}
	//synchronized 
	void lastMethod(){
		System.out.println("From lastMethod of SecondClass");
	}
}
class DeadLockTest implements Runnable{
	FirstClass fc = new FirstClass();
	SecondClass sc = new SecondClass();
	DeadLockTest(){
		Thread t = new Thread(this, "Racing Thread");
		t.start();
		fc.firstClassMethod(sc); //main thread locked fc object
		System.out.println("Back in main Thread");
	}
	public void run(){
		sc.secondClassMethod(fc);// racing thread locked sc object
		System.out.println("Back in other Thread");
	}
	
	public static void main(String[] args){
		new DeadLockTest();
	}
}