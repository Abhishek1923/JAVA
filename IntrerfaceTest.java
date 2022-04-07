//Class implementing an Interface
interface Cars{
	float Speed();
}

class Ford_Mustang implements Car{
	public float Speed(){
		return 802;
	}
}

class PaganiHuayra implements Car{
	public float Speed(){
		return 924;
	}
}

class InterfaceTest{
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Speed is "+c.Speed());
	}
}