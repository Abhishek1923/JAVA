public class Laundry {
public void doLaundry() throws PantsException, LingerieException {
// code that could throw either exception
	System.out.println("Laundry done");
}
}

public class Foo {
	public void go() {
		Laundry laundry = new Laundry();
		try {
		laundry.doLaundry();
		} 
		catch(PantsException pex) {
		// recovery code
		System.out.println("PantsException");
		} 
		catch(LingerieException lex) {
		// recovery code
		System.out.println("LingerieException");
		}
	}
}