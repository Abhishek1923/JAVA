class ObjectTypeCastingTest{
	public static void main(String[] args){
		Object o1 = new String("java");
		Object o2 = new StringBuffer("java");
		StringBuffer s = (StringBuffer)o1;
		System.out.println(s);
	}
}