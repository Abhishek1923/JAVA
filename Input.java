import java.util.Scanner;
class Input{
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter an Integer:");
		int a=obj.nextInt();
		System.out.println(a);
		
		System.out.println("Enter a String:");
		String a=obj.nextLine();
		System.out.println(a);
	}
}