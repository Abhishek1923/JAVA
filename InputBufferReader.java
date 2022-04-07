// Taking input from the user
import java.io.*;
public class InputBufferReader{
	public static void main(String[] args) throws IOException{
		String name,age;
		int n;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your name: ");
		name = br.readLine();
		System.out.println("Enter your age :");
		age = br.readLine();

		n=Integer.parseInt(age);

		System.out.println("Your name is : "+name +" & Your age is : "+n);
	}
}