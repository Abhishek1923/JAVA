class A{
	//int a,b;
	//synchronized 
	 void m1(int x, int y){
		int a,b;  //these r local variables which r thread safe so we won't get inconsistent result
		a = x;
		b = y;
		try{
			Thread.sleep(1000);				
		}catch(InterruptedException ie){}
		int c = a+b;
		System.out.println("Sum = "+c+" Thread ="+Thread.currentThread().getName());
	}
}

class Thread1 extends Thread{
	A a;
	Thread1(A a){
		this.a = a;
	}
	public void run(){
		a.m1(11, 22);
	}
}

class Thread2 extends Thread{
	A a;
	Thread2(A a){
		this.a = a;
	}
	public void run(){
		a.m1(111, 222);
	}
}

class Synchro2{
	public static void main(String s[]){
		A a = new A();
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		
		t1.start();
		t2.start();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
	}
}