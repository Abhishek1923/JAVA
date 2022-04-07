//THREADS
//To find the current thread
class Current{
	public static void main(String[] args) {
		System.out.println("Let's find current running thread...");

		Thread t=Thread.currentThread();
		System.out.println("Current Thread : "+t);
		System.out.println("Its name is : "+t.getName());
	}
}