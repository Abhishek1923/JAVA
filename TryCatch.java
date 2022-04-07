public class TryCatch{
	public static void main(String[] args) {
		try{
// 			int data =2/0;
		}
		catch(Exception e){
			int data=2/0;
			System.out.println(e);
			System.out.println("Rest Code inside catch");
		}
		System.out.println("Rest Code outside catch");
	}
}