//Class implementing an Interface
interface Cars{
	float Speed();
}

class Ford_Mustang implements Cars{
	public float Speed(){
		return 802;
	}
}

class PaganiHuayra implements Cars{
	public float Speed(){
		return 924;
	}
}

class InterfaceTest{
	public static void main(String[] args) {
		Cars c = new Ford_Mustang();
		System.out.println("Speed is "+c.Speed());
	}
}