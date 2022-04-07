  abstract class Quadrilateral{  
    abstract void sides();  
  }  
  class Square extends Quadrilateral{  
  void sides(){
    System.out.println("I have 4 equal sides");}  
    public static void main(String args[]){  
    Quadrilateral obj = new Square();  
    obj.sides();  
    }  
  }  