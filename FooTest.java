public class Foo {
static int x;

public void go() {
	System.out.println(x);
	}
}

class FooTest{
	public static void main(String[] args) {
		Foo f = new Foo();
	}
}