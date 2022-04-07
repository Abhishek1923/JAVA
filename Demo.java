class Demo{
	public static void main(String[] args) {
		String s="a";
		String t="b";
		System.out.println("ab".hashCode());//3105
		System.out.println(s.hashCode());//97
		System.out.println("a".hashCode());//97
		System.out.println("b".hashCode());//98
		System.out.println(s.hashCode()+"b".hashCode());//195
		System.out.println((s+"b").hashCode());//3105
		System.out.println("ab".hashCode()==(s+"b").hashCode());
		System.out.println(s+"b");
		System.out.println(s+t);
		System.out.println("ab"==s.concat(t));	
		System.out.println(Boolean.valueOf("ab")==Boolean.valueOf(s+("b")));
		System.out.println("ab".equals(s+"b"));	
	}
	/*We can use == operators for reference comparison (address comparison) and
	 .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
	
	  Reference website: https://www.geeksforgeeks.org/difference-equals-method-java/
	*/
}