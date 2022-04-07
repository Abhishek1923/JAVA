class Car{
	String model,color,year;
	void Start(){
		System.out.println("Start");
	}	
	void Stop(){
		System.out.println("Stop");
	}
	void Accelerate(){
		System.out.println("Accelerate");
	}
}
class Test extends Car{
	public static void main(String[] args) {
	//Car Ferrari,Mercedes,Ford;
	Car Ferrari=new Car();
	Car Mercedese=new Car();
	Car Ford=new Car();
	Ferrari.Start();
	Ferrari.Stop();
	Ferrari.Accelerate();
	}
}