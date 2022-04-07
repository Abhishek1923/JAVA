public class Foo {
int x=12;

public void go() {
	System.out.println(x);
	}
}
class FooTest{
	public static void main(String[] args) {
		Foo f = new Foo();
		f.go();
	}
}
