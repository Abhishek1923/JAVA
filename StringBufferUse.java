class StringBufferUse{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Example");//assign a value

		String s=new String(sb);//for a given sb, creating a new string
		System.out.println(s+" "+sb);

		sb.append("moh");//concatenation
		System.out.println(sb);

		sb.delete(1,2);//begin index to end indexjava
		System.out.println(sb);

		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());//current capacity of StringBuffer
	}
}