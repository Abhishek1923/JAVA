import java.lang.reflect.*;
class A{
A(){}
public A(int a){}
A(String s, float f){}
}
class ConstructorExample01{	
	public static void main(String[] args){
		Class cls = A.class;		
		Constructor[] ctr = cls.getDeclaredConstructors();
		for(Constructor c: ctr){
			System.out.println("Name "+c.getName());
			int i = c.getModifiers();
			System.out.println("Modifiers "+Modifier.toString(i));
			Class[] cls1 = c.getParameterTypes();
			for(Class c1: cls1){
				System.out.println("Param "+c1.getName());
			}
		}
		
	}
}