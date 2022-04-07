import java.lang.reflect.*;
class A{
	public void am1(){}
}
class Test extends A{
	public void m1(){}
	
    private void m2(){}
	
	void m3(){}
}

class MethodExample{
	public static void main(String [] args){
		Class c = Test.class;
		Method[] m1 = c.getMethods();
		for(Method m : m1){
			System.out.println("public Method name "+m.getName());
		}
		
		System.out.println("--------------------------------");
		
		Method[] m2 = c.getDeclaredMethods();
		for(Method m : m2){
			System.out.println("Method name "+m.getName());
		}
		
	}
}