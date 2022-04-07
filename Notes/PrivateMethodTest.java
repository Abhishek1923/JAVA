import java.lang.reflect.*;
class A{
	private void m1(){
		System.out.println("m1 from A ");
	}
}
class PrivateMethodTest{
	public static void main(String[] args)throws Exception{
		Class c = Class.forName("A");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("m1",null);//,new Class[]{int.class});
		m.setAccessible(true);
		m.invoke(o,null);//5
	}
}