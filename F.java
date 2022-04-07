/*String Class is final, mutable*/
class String F{
	public static void main(String[] args) {
		String s1="abhishek";
		String s2="abhishek";
		String s3=new String ("abhishek");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2=s3);
		System.out.println(s2.equals(s3));
	}
}