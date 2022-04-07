class MyThread1 extends Thread{	

	public void run(){   
		for(int i=0;i<7;i++){
			Thread t = Thread.currentThread();
			t.setPriority(-7);
			System.out.println("run method "+t);		
		}
	}
	
}
class ThreadTest01{
	public static void main(String[] args){
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		}
}