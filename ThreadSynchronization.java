//Thread Synchronization
/*When a thread is 'already acting on an object, preventing any other thread from acting on the same object is called ·'Thread synchronization' or 'Thread safe' The object on which the threads are synchronized is called 'synchronfzed object'. Thread synchronization is recommended when multipie threads are u.s ed·on the same object (in multithreading),*/
/*Synchronized block is useful to synchronize a block of statements. Synchronized keyword is useful to synchronize an entire method.*/

class Reserve implements Runnable{
	int available =1,wanted;

	Reserve (int i){
		wanted=i;
	}

	public void run(){
		synchronized(this){
			System.out.println("Available Births: "+available);
			if(available>=wanted){
				String name=Thread.currentThread().getName();
				System.out.println(wanted+" Berth reserved for "+name);
				try{
					Thread.sleep(1500);
					available=available-wanted;
				}catch(InterruptedException ie){}
			}
			else{
				System.out.println("Sorry!! No Births available.");
			}
		}
	}
}

class ThreadSynchronization{
	public static void main(String[] args) {
		Reserve r1=new Reserve(1);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);

		t1.setName("First Person");
		t2.setName("Second Person");

		t1.start();
		t2.start();
	}
}