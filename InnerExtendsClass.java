//Anonymous inner class that extends a class

class InnerExtendsClass{
	public static void main(String[] args) {
		Thread t=new Thread(){
			public void run(){
				System.out.println("Child");
			}
		};
		t.start();
		System.out.println("Main");
	}
} 