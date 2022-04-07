  abstract class Quadrilateral{  
    abstract void sides();  
  }  
  class Square extends Quadrilateral{  
  void sides(){
    System.out.println("I have 4 equal sides");
  }
  class Triangle extends Quadrilateral{
  void sides(){
    System.out.println("I have 3 sides");
  }
  
  }  
    public static void main(String args[]){  
    Quadrilateral obj = new Square();  
    Quadrilateral obj2 = new Triangle();
    obj.sides();  
    obj.sides();
    }  
  } 