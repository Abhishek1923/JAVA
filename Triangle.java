class Triangle{
	public:
		float Area();
		int Perimeter();
}
class Right_Triangle extends Triangle{
	float Area(int a ,int b){
		Area = .5*a*b;
		System.out.println(Area);
	}
	int Perimeter(int c){
		Perimeter=a+b+c;
		System.out.println(Perimeter);
	}	
} 
class Iso_Triangle extends Triangle{
	float Area(int b,int h){
		Area = .5*b*h;
		System.out.println(Area);
	}
	int Perimeter(int a){
		Perimeter=2*a+b;
		System.out.println(Perimeter);
	}
}
class Equi_Triangle extends Triangle{
	float Area(int a){
		Area=(((3)^2)/4)*a*a;
		System.out.println(Area);
	}
	int Perimeter(int a){
		Perimeter=3*a;
		System.out.println(Perimeter);
	}
}

class Test{
	public static void main(String[] args) {
		Triangle t1= new Right_Triangle();
		t1.Area(12,3);
		t1.Perimeter(4);
	}
}