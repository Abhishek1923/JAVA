class ObjectTypeCast{
	public static void main(String[] args) {
		Object o1=new String("I");
		Object o2=new StringBuffer("hi");
		//String s=(String)o2;/*it shows RTE because String and StringBuffer are not compatible*/
		StringBuffer s=(StringBuffer) o2;
		
		System.out.println(s);
	}
}