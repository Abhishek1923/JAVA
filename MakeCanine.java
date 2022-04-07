abstract public class Animal{
	public void roam() { 
		System.out.println("Roam in jungle");
	}
}

class Canine extends Animal{}

class MakeCanine{
	public static void main(String[] args) {
	Canine c = new Canine();
	c.roam();
	}
}