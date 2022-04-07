class MilkyWay{  
  void size(){
  	System.out.println("52,850 light years");
  }  
}  

class SolarSystem extends MilkyWay{  
	void size(){
  		System.out.println("1.50 light years");
}  
  
public static void main(String args[]){  
  SolarSystem obj = new SolarSystem(); 
  obj.size();
  }  
}  