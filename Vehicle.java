//use of this and super keyword

class Vehicle{
    int a;
    Vehicle(int a){
        this.a=a;
    }
    Vehicle(){
        this(0);
    }
    public void fun(){
        System.out.println("Value of a:"+a);
    }
}
class FourWheeler extends Vehicle{
    FourWheeler(int a){
        super(a);
    }
    FourWheeler(){
        super();
    }
}

class ThisAndSuper{
    public static void main(String[] args){
        Vehicle p=new Vehicle(5);
        p.fun();
        FourWheeler c=new FourWheeler();
        c.fun();
    }
}