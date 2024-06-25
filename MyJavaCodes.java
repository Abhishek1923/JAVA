// Convert an ASCII Code to Char

public class Main {
    public static void main(String[] args) {

        int asciiValue = 1923; //ރ

        char convertedChar = (char)asciiValue;
        System.out.println(convertedChar);

    }
}


public class Main {
    public static void main(String[] args) {

        int asciiValue = 064770;  //octal representation of the integer value 27128, which is legal because it fits into an unsigned 16-bit integer
            String convertedChar = Character.toString(asciiValue);
            System.out.println(convertedChar);
    }
}


public class Main {
    public static void main(String[] args) {

        int asciiValue = 0xbeef; //is a hexadecimal representation of the integer value 48879, which fits into an unsigned 16-bit integer.
            String convertedChar = Character.toString((char)asciiValue);
            System.out.println(convertedChar);
    }
}


public class Main {
    public static void main(String[] args) {

        int asciiValue = '\uface'; //is a Unicode representation of a character.

        char[] convertedCharArray = Character.toChars(asciiValue);
        System.out.println(convertedCharArray);

    }
}


// COMPARING DIFFERENT TYPES OF STRING CREATIONS

    public class InternExample2 {  
        public static void main(String[] args) {          
            String s1 = "Javatpoint";  
            String s2 = s1.intern();  
            String s3 = new String("Javatpoint");  
            String s4 = s3.intern();          
            System.out.println(s1==s2); // True  
            System.out.println(s1==s3); // False  
            System.out.println(s1==s4); // True  
            System.out.println(s2==s3); // False
            System.out.println(s2==s4); // True   
            System.out.println(s3==s4); // False      
            System.out.println(s3.equals(s4)); // True      
        }  
    }  


Why Use a Default Method?
The purpose of the default method is to provide external functionality without breaking the existing implementations. 
The original motivation behind introducing the default method was to provide backward compatibility to the Collection Framework 
with the new lambda functions.

Interface With default Method vs Abstract Class

The abstract class can have a state, and its methods can access the implementation's state. Although default methods are allowed in 
an interface, they can't access the implementation's state.
Any logic we write in the default method should be with respect to other methods of the interface — 
those methods will be independent of the object's state.

Let's say that we've created an abstract class, CircleClass, which contains a String, color, to represent the state of the CircleClass object:

public abstract class CircleClass {

    private String color;
    private List<String> allowedColors = Arrays.asList("RED", "GREEN", "BLUE");

    public boolean isValid() {
        if (allowedColors.contains(getColor())) {
            return true;
        } else {
            return false;
        }
    }

    //standard getters and setters
}

In the above abstract class, we have a non-abstract method called isValid() to validate a CircleClass object based on its state. 
The isValid() method can access the state of a CircleClass object and validate the instance of CircleClass based on the allowed colors. 
Due to this behavior, we can write any logic in the abstract class method based on the object's state.

Let's create a simple implementation class of CircleClass:

public class ChildCircleClass extends CircleClass {
}

Now, let's create an instance and validate the color:

CircleClass redCircle = new ChildCircleClass();
redCircle.setColor("RED");
assertTrue(redCircle.isValid());

Here, we can see that when we put a valid color in the CircleClass object and call the isValid() method, internally, 
the isValid() method can access the state of the CircleClass object and check if the instance contains a valid color or not.

Let's try to do something similar using an interface with a default method:

public interface CircleInterface {
    List<String> allowedColors = Arrays.asList("RED", "GREEN", "BLUE");

    String getColor();
    
    public default boolean isValid() {
        if (allowedColors.contains(getColor())) {
            return true;
        } else {
            return false;
        }
    }
}


As we know, an interface can't have a state, and therefore, the default method can't access the state.

Here, we've defined the getColor() method to provide the state information. The child class will override the getColor() method 
to provide the state of the instance at runtime:

public class ChidlCircleInterfaceImpl implements CircleInterface {
    private String color;

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

Let's create an instance and validate the color:

ChidlCircleInterfaceImpl redCircleWithoutState = new ChidlCircleInterfaceImpl();
redCircleWithoutState.setColor("RED");
assertTrue(redCircleWithoutState.isValid());

As we can see here, we're overriding the getColor() method in the child class so that the default method validates the state at runtime.

CONSTRUCTORS

Abstract classes can have constructors, allowing us to initialize the state upon creation. Interfaces, of course, do not have constructors.

Additionally, there are few differences regarding syntax. An abstract class can override Object class methods, but an interface can't.

An abstract class can declare instance variables, with all possible access modifiers, and they can be accessed in child classes. 
An interface can only have public, static, and final variables and can't have any instance variables.

Additionally, an abstract class can declare instances and static blocks, whereas an interface can't have either of these.

Finally, an abstract class can't refer to a lambda expression, while the interface can have a single abstract method 
that can refer to a lambda expression.


-------------------------------------------------------------------------------------------------------------

class HelloWorld {
    public static void main(String[] args) {
        int x=23_42;
        System.out.println(x);
    }
}

OUTPUT: 2342

-------------------------------------------------------------------------------------------------------------

Int p = "Go Paw Patrol!".indexOf("p");What is the value of p? 
 
OUTPUT: -1

--------------------------------------------------------------------------------------------------------------

public class Demo1{
 public static void main(String args[]){
    int i[] = new int[10];
    System.out.println(i[10]);
    }
}

OUTPUT:  Out-of-bounds exception 
        if we have to print i[8] then it's output is 0

---------------------------------------------------------------------------------------------------------

public class testincr { 
    public static void main(String args[]) { 
        int c=1;       
        System.out.println (c=c++);
    }
}

OUTPUT: 1

--------------------------------------------------------------------------------------------------------
float: Range is from 3.4E-38 to 3.4E38 (positive or negative), with 7 significant digits of precision.

double: Range is from 1.7E-308 to 1.7E308 (positive or negative), with 15 significant digits of precision.

----------------------------------------------------------------------------------------------------------

    class output {

            public static void main(String args[]) 

            {

                double a, b,c;

                a = 3.0/0;

                b = 0/4.0;

                c=0/0.0;

     

            System.out.println(a);

                System.out.println(b);

                System.out.println(c/a);

            } 

        }

OUTPUT:
Infinity
0.0
NaN

-------------------------------------------------------------------------------------------------------

import java.math.BigDecimal;
    class output {

            public static void main(String args[]) 

            {
                       double a = 0.02;

       double b = 0.03;

       double c = b - a;

       System.out.println(c);

     

       BigDecimal _a = new BigDecimal("0.02");

       BigDecimal _b = new BigDecimal("0.03");

       BigDecimal _c = _b.subtract(_a);

       System.out.println(_c);
       
       System.out.print(0.03-0.02);

            } 

        }

OUTPUT:
0.009999999999999998
0.01
0.009999999999999998


------------------------------------------------------------------------------------------------------------------------

toString() of BigDecimal uses scientific notation to represent numbers known as canonical representation. 
We must use toPlainString() to avoid scientific notation.

----------------------------------------------------------------------------------------------------------------------------

int arr[] = new int [5];
System.out.print(arr);
   
OUTPUT: [I@5a07e868
 If we trying to print any reference variable internally, toString() will be called which is implemented to return the String in following form:
classname@hashcode in hexadecimal form

----------------------------------------------------------------------------------------------------------------------------


What is the type of variable ‘b’ and ‘d’ in the following Java snippet?

int a[], b;
int []c, d;

‘b’ is int variable; ‘d’ is int array
Explanation: If [] is declared after variable it is applicable only to one variable. 
If [] is declared before variable it is applicable to all the variables.

----------------------------------------------------------------------------------------------------------------------------
What will be the output of the following Java code?

    int arr[] = new int [5];

    System.out.print(arr);

GARBAGE VALUE: arr is an array variable, it is pointing to array of integers. 
Printing arr will print garbage value. It is not same as printing arr[0].

------------------------------------------------------------------------------------------------------------------------------

What will be the output of the following Java code snippet?

    Object[] names = new String[3];

    names[0] = new Integer(0);

ArrayIndexOutOfBoundsException comes when code tries to access an invalid index for a given array. 
ANS: ArrayStoreException comes when you have stored an element of type other than the type of array.

-------------------------------------------------------------------------------------------------------------------------------

        class Output 

        {

            public static void main(String args[]) 

            {    

                 int x , y = 1;

                 x = 10;

                 if (x != 10 && x / 0 == 0)

                     System.out.println(y);

                 else

                     System.out.println(++y);

            } 

        }

SOL: Operator short circuit and, &&, skips evaluating right hand operand if left hand operand is false 
thus division by zero in if condition does not give an error. Output is 2.

----------------------------------------------------------------------------------------------------------------------------

    class Output 

    {

            public static void main(String args[]) 

            {    

               final int a=10,b=20;

              while(a<b)

              {

     

              System.out.println("Hello");

              }

              System.out.println("World");

     

            } 

    }

CTE : Every final variable is compile time constant.

--------------------------------------------------------------------------------------------------------------------------

    class San

    {

         San()throws IOException

         {

     

         } 

     

    }

    class Foundry extends San

    {

         Foundry()

         {

     

         }

         public static void main(String[]args)

         {

     

         }

    }

CTE: If parent class constructor throws any checked exception, 
compulsory child class constructor should throw the same checked exception as its parent, otherwise code won’t compile.

----------------------------------------------------------------------------------------------------------------------

Which of these is the method which is executed first before execution of any other thing takes place in a program?
main method
finalize method
static method
private method


If a static method is present in the program then it will be executed first, then main will be executed.

----------------------------------------------------------------------------------------------------------------------

Which of these data types is used to store command line arguments?

String

----------------------------------------------------------------------------------------------------------------------

Can command line arguments be converted into int automatically if required?

No, All command Line arguments are passed as a string. We must convert numerical value to their internal forms manually.

----------------------------------------------------------------------------------------------------------------------

What will be the output of the following Java program, Command line execution is done as – “java Output command Line 10 A b 4 N”?

        class Output 

        {

            public static void main(String args[]) 

            {

                System.out.print((int)args[2] * 2);

            }

        }

Error, as string can't be converted as an int.

--------------------------------------------------------------------------------------------------------------------

Which of these is not a correct statement?
a) A recursive method must have a base case
b) Recursion always uses stack
c) Recursive methods are faster that programmers written loop to call the function repeatedly using a stack
d) Recursion is managed by Java Runtime environment


Recursion is always managed by operating system.

--------------------------------------------------------------------------------------------------------------------

At line number 2 in the following code, choose 3 valid data-type attributes/qualifiers among 
“final, static, native, public, private, abstract, protected”
    public interface Status

       {

            /* insert qualifier here */ int MY_VALUE = 10;

       }


Every interface variable is implicitly public static and final.

--------------------------------------------------------------------------------------------------------------------

Which of these method of Object class is used to obtain class of an object at run time?

Class getclass()

--------------------------------------------------------------------------------------------------------------------

       class A 

       {

        int i;

        int j;

            A() 

            {

                i = 1;

                j = 2;

            }

       }

       class Output 

       {

            public static void main(String args[])

            {

                 A obj1 = new A();

                 A obj2 = new A();

             System.out.print(obj1.equals(obj2));

            }

       }


obj1 and obj2 are two different objects. equals() is a method of Object class, 
Since Object class is superclass of every class it is available to every object.So false.

--------------------------------------------------------------------------------------------------------------------

        class A 

        {

            public int i;

            private int j;

        }    

        class B extends A 

        {

            void display() 

            {

                super.j = super.i + 1;

                System.out.println(super.i + " " + super.j);

            }

        }    

        class inheritance 

       {

            public static void main(String args[])

            {

                B obj = new B();

                obj.i=1;

                obj.j=2;   

                obj.display();     

            }

       }


Class contains a private member variable j, this cannot be inherited by subclass B and does not have access to it.
output:

$ javac inheritance.java
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    The field A.j is not visible


--------------------------------------------------------------------------------------------------------------------

Which class provides system independent server side implementation?

ServerSocket

--------------------------------------------------------------------------------------------------------------------

java.util - COLLECTION FRAMEWORK 
The Questions will be pasted here.
================================



























































