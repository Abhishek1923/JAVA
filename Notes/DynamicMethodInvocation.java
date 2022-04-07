import java.lang.reflect.*;
class A{
	void m1(){
		System.out.println("from m1 ");
	}
	void m2(){
		System.out.println("from m2 ");
	}
}
	
class DynamicMethodInvocation{
	public static void main(String[] args)throws Exception{
		Class c = Class.forName("A");
		Object o = c.newInstance();
		A a = (A)o;
		Method m = c.getDeclaredMethod(args[0],null);//,new Class[]{int.class});
		//m.setAccessible(true);
		System.out.println("method name  "+m.getName());
		m.invoke(a,null);//5
	}
}