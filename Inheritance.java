class Inheritance{
	int id;
	String name;
	String address;

	Inheritance(int id, String name, String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void getDetails(){
		System.out.println("id: "+id+",name: "+name+",address: "+address);
	}
}

class TrialClass extends Inheritance{
	int marks1;

	TrialClass(int id, String name, String address, int marks){
		super(id,name,address);
		marks1=marks;
	}
	void getDetails(){
		System.out.println("id: "+id+",name: "+name+",address: "+address+",marks: "+marks1);

	}
}
class Test{
	public static void main(String[] args) {
		Inheritance i=new Inheritance(101,"AK","Berla");
		i.getDetails();

		TrialClass t=new TrialClass(102,"ak","berla",29);
		t.getDetails();
	}
}