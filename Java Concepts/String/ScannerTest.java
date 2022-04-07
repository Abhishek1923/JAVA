import java.util.*;
class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur name:");
		String name = sc.nextLine();		
		System.out.println("Enter ur age:");
		int age = sc.nextInt();
		System.out.println("Enter ur salary:");
		double salary = sc.nextDouble();
		System.out.println("Ur Details : "+name+" "+age+" "+salary);
	}
}