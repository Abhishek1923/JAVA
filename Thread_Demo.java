//creating and running a thread
/*Create a.class that extends Thread class or implements Runnable interface. Both the Threads class and Runnable interlace are found in java .lang package.
Now in this class write a run() method.
By default, this rtm () method is recognized and executed by a thread.
Create an object to Myclass, so that the run () method is available for execution.
Now create a thread and attach the thread to the object.
Run the thread. For this purpose, we should use start () method of Thread class.*/

import java.io.*;

class MyThread extends Thread {

	boolean stop=false;

	public void run(){
		for (int i=1;i<=10;i++){
			System.out.println(i);
				
			if(stop) return;
		}
	}
}

class Thread_Demo{
	public static void main(String[] args) {
		MyThread m=new MyThread();
		Thread t=new Thread(m);

		t.start();

		System.in.read(); // wait till enter key is pressed
		m.stop=true;
	}
}

/*NOTE : to force stop a thread --First of all, we should create a boolean type variable which store.s 'false'. 
When the user wants. to stop the .thread, we should store 'true' into.the variable. 
The status of the variable is checked and the run() method act if it is true, the thread executes 'return' statement and then stops.*/