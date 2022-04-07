class MyThread extends Thread{
	public void start(){
		System.out.println("start");
	}
	public void run(){
		System.out.println("run");
	}

}
class Test{
		public static void main(String[] args) {
			MyThread t=new MyThread();
			t.start();
			System.out.println("Main");
		}
	}