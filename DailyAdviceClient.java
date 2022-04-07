/*This program makes a Socket, makes a BufferedReader (with the
help of other streams), and reads a single line from the server
application (whatever is running at port 4242).*/

import java.io.*;
import java.net.*;//class  Socket is in java.net
public class DailyAdviceClient {
public void go() {
try {             //a lot can go wrong here

/*make a socket connection to whahever is 
running on port 4242, on the same host
this code is running on.(The ‘localhost)*/ 

Socket s = new Socket(“127.0.0.1”, 4242);
InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
BufferedReader reader = new BufferedReader(streamReader);
/*chain a BufferedReader to an InputStreamReader to
the input stream from the Socket.*/

String advice = reader.readLine();
/*this readLin is EXACTLY the same as if you are using a 
BuffferReader chained to a FILE.
In other words ,by the time you call a BufferWriter method
the writer doesn't know or care where the characters came from.*/

System.out.println(“Today you should: “ + advice);

reader.close();
}
catch(IOException ex) {
ex.printStackTrace();
}
}
public static void main(String[] args) {
	DailyAdviceClient DailyAdviceClient = new DailyAdviceClient();
	client.go();
}