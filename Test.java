class Test{
	public static void main(String[] args) {
		String s="2";
		String t="two";
		int x = Integer.parseInt(s);
		//int y = Integer.parseInt(t);//java.lang.NumberFormatException:
		double d = Double.parseDouble("420.24");
		boolean b = new Boolean("true").booleanValue();
		System.out.println(s);
		//System.out.println(t);
		System.out.println(d);
		System.out.println(b);


//using a static method in class double
		double e= 42.5;
		String doubleString1 = "" + e;
		double f= 42.5;
		String doubleString2 = Double.toString(f);

		System.out.println(doubleString1);
		System.out.println(doubleString2);

//String Formatting
		String s = String.format("%, d", 1000000000);
		System.out.println(s);
	}
}