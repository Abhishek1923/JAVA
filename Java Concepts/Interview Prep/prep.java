//Write a code of prime numbers 1 to 100 and write sql query.

//SELECT * FROM table_name WHERE number_column >= 1 AND number_column <= 100 AND is_prime = true;

import java.util.*;

public class prep {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int c = 0;
        for (int i = 0; i <= num; i++)
            if (i % num == 0) c++;
        if (c == 2) System.out.println("Prime No.");
        else System.out.println("Not a Prime No.");
    }
}


//=================================================

// for iterating stream through lambda expression
myList.stream().forEach(element -> System.out.println(element));

//=================================================


Spring Boot application context is a container that manages the lifecycle of beans and provides dependency injection.

Spring Boot application context is responsible for creating and managing beans.

It provides dependency injection by wiring beans together.

It supports different types of scopes for beans such as singleton, prototype, etc.

It can be configured using annotations or XML configuration files.

Example: @ComponentScan scans the package for annotated components and registers them with the application context.

//===================================================
Difference between spring and springboot:

Spring Boot application context is a container that manages the lifecycle of beans and provides dependency injection.

Spring Boot application context is responsible for creating and managing beans.

It provides dependency injection by wiring beans together.

It supports different types of scopes for beans such as singleton, prototype, etc.

It can be configured using annotations or XML configuration files.

Example: @ComponentScan scans the package for annotated components and registers them with the application context.

//=================================================

Heap is used for dynamic memory allocation, while stack is used for static memory allocation.

Heap memory is used for storing objects and is managed by the JVM, while stack memory is used for storing method calls and local variables.

Heap memory is larger in size compared to stack memory.

Heap memory is accessed randomly, while stack memory is accessed in a LIFO (Last In First Out) manner.

Examples: Objects created using the 'new' keyword are stored in the heap, while method calls and local variables are stored in the stack.

//===================================================

Compile time polymorphism - (Static Polymrphism/ Method Overloading)
Run time polymorphism - (Dynamic method dispatch/ Method Overriding)

//===================================================

Abstract class	VS Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods.
Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.
Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.
Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.
The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.
An interface can extend another Java interface only.
7) An abstract class can be extended using keyword "extends".
An interface can be implemented using keyword "implements".
8) A Java abstract class can have class members like private, protected, etc.
Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
    public abstract void draw();
}	Example:
public interface Drawable{
    void draw();
}

Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).

//=============================================================
Encapsulation in Java - wrapping the data in a single unit
eg: using modifiers before variables and access them via getter and setter methods

//=============================================================
Difference between abstraction and encapsulation
Real-World Example 	In a car, the abstraction is the steering wheel and pedals;
you don’t need to know how the engine works.
The car’s engine encapsulates its internal workings;
you interact with it through the car’s controls without accessing the engine directly.

//============================================================

// Java program to illustrate the concept of Abstraction

abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have a constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() { return color; }
}
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)
    {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Circle color is " + super.color
                + " and area is : " + area();
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {

        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle color is " + super.color
                + " and area is : " + area();
    }
}

public class Test {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}

// Java program to demonstrate encapsulation

class Encapsulate {

    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // get method for age to access
    // private variable geekAge
    public int getAge() { return geekAge; }

    // get method for name to access
    // private variable geekName
    public String getName() { return geekName; }

    // get method for roll to access
    // private variable geekRoll
    public int getRoll() { return geekRoll; }

    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) { geekAge = newAge; }

    // set method for name to access
    // private variable geekName
    public void setName(String newName)
    {
        geekName = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) { geekRoll = newRoll; }
}

// Class to access variables
// of the class Encapsulate
public class TestEncapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println(&quot;Geek's roll: &quot; +
        // obj.geekName);
    }
}

//===================================================================
COPY CONSTRUCTOR

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person another) {
        this(another.name, another.age);
    }

    // Getters and setters for the instance variables
}


//===================================================================
Cookies using Servlet
---------------------
Class Cookie

java.lang.Object
  |
          +--javax.servlet.http.Cookie


public class Cookie
extends java.lang.Object
implements java.lang.Cloneable

//Creates a cookie (name,single value,optional attibutes such as a comment, path and domain qualifiers,
//a maximum age, and a version number),a small amount of information sent by a servlet to a Web browser,
//saved by the browser, and later sent back to the server.
//A cookie's value can uniquely identify a client, so cookies are commonly used for session management.

//Cookie creation
Cookie ck = new Cookie("user","sonoo jaiswal");//creating cookie object
response.addCookie(ck);//adding cookie in the response

//Deleting Cookie
Cookie ck = new Cookie("user","");//deleting value of cookie
ck.setMaxAge(0);//changing the maximum age to 0 seconds
response.addCookie(ck);//adding cookie in the response

//Get Cookie
Cookie ck[]=request.getCookies();
for(int i=0;i<ck.length;i++){
    out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie
    }

-----------------------------------------
//=======================================

//making a list as read only in java
//An ArrayList can be made read-only easily with the help of Collections.unmodifiableList() method.

Syntax:

readOnlyArrayList = Collections.unmodifiableList(ArrayList);

//==========================================================
Iterator vs ListIterator
//Iterator is a universal interface used to traverse any collection,
//while ListIterator is specific to lists and provides bidirectional iteration.
//Iterator supports only forward iteration with next().
//On the other hand, ListIterator supports both forward and backward iteration with next() and previous().

//==========================================================

DESIGN PATTERNS IN JAVA

A design pattern is a generic repeatable solution to a frequently occurring problem in software design
that is used in software engineering.

1. Creational Design Patterns in Java
    1.1 Factory Method
    1.2 Abstract Factory Method
    1.3 Builder Method
    1.4 Prototype Method
    1.5 Singleton Method

2. Structural Design Patterns in Java
    2.1 Adapter Method
    2.2 Bridge Method
    2.3 Composite Method
    2.4 Decorator Method
    2.5 Facade Method
    2.6 Proxy Method
    2.7 Flyweight Method

3. Behavioral Design Patterns in Java
    3.1 Command Method
    3.2 Iterator Method
    3.3 Mediator Method
    3.4 Memento Method
    3.5 Observer method
    3.6 State Method
    3.7 Strategy Method
    3.8 Template Method
    3.9 Visitor Method
    3.10 Null Object Method

//========================================
StringBuffer is synchronized. This means that multiple threads cannot call the methods of StringBuffer
simultaneously. StringBuilder is asynchronized.

//========================================
Methods for Performing Object Cloning in Java

1) Using Assignment Operator to create a copy of the reference variable
Test ob1 = new Test();

        System.out.println(ob1.x + " " + ob1.y);

// Creating a new reference variable ob2
// pointing to same address as ob1
Test ob2 = ob1;

2) Creating a copy using the clone() method
Shallow copy
// A Java program to demonstrate
// shallow copy using clone()
import java.util.ArrayList;

// An object reference of this class is
// contained by Test2
class Test {
    int x, y;
}

// Contains a reference of Test and
// implements clone with shallow copy.
class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

// Driver class
public class Main {
    public static void main(String args[])
            throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t2 = (Test2)t1.clone();

        // Creating a copy of object t1
        // and passing it to t2
        t2.a = 100;

        // Change in primitive type of t2 will
        // not be reflected in t1 field
        t2.c.x = 300;

        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x
                + " " + t2.c.y);
    }
}

3) Usage of clone() method – Deep Copy
// A Java program to demonstrate
// deep copy using clone()

// An object reference of this
// class is contained by Test2
class Test {
    int x, y;
}

// Contains a reference of Test and
// implements clone with deep copy.
class Test2 implements Cloneable {
    int a, b;

    Test c = new Test();

    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to
        // new reference variable t
        Test2 t = (Test2)super.clone();

        // Creating a deep copy for c
        t.c = new Test();
        t.c.x = c.x;
        t.c.y = c.y;

        // Create a new object for the field c
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }
}

public class Main {
    public static void main(String args[])
            throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t3 = (Test2)t1.clone();
        t3.a = 100;

        // Change in primitive type of t2 will
        // not be reflected in t1 field
        t3.c.x = 300;

        // Change in object type field of t2 will
        // not be reflected in t1(deep copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                + " " + t1.c.y);
        System.out.println(t3.a + " " + t3.b + " " + t3.c.x
                + " " + t3.c.y);
    }
}

//=============================================================
Object class methods in java

toString() - String representation of an object
hashCode() - is an integer value that gets generated by the hashing algorithm
equals (Object obj) - compares two objects and returns whether they are equal or not
getClass() - is used to return the class object of this object
finalize() - Just before Java's garbage collector reclaims an object, the finalize() method is invoked,
ensuring a last chance for any necessary cleanup tasks when no references to the object remain
clone() - is used to create an exact copy of this object(deep copy)
wait() - instructs the current thread to release its lock and enter a sleeping state
notify() - is used to wake up only one single thread that is waiting on the object, and that thread starts the execution
notifyAll() - awakens all threads currently waiting on the object instance where it's invoked.
All threads get the notification but only one thread gets a lock.

//================================================================
JSP|Implicit Objects

The main property of JSP is that we can insert our java code inside our HTML page using JSP tag
JSP provide you Total 9 implicit objects which are as follows

request: This is the object of HttpServletRequest class associated with the request.
response: This is the object of HttpServletResponse class associated with the response to the client.
config: This is the object of ServletConfig class associated with the page.
application: This is the object of ServletContext class associated with the application context.
session: This is the object of HttpSession class associated with the request.
page context: This is the object of PageContext class that encapsulates the use of server-specific features. This object can be used to find, get or remove an attribute.
page object: The manner we use the keyword this for current object, page object is used to refer to the current translated servlet class.
exception: The exception object represents all errors and exceptions which is accessed by the respective jsp. The exception implicit object is of type java.lang.Throwable.
out: This is the PrintWriter object where methods like print and println help for displaying the content to the client.

//===============================================================
Creating a JDBC connection

// This code is for establishing connection with MySQL
// database and retrieving data
// from db Java Database connectivity

/*
 *1. import --->java.sql
 *2. load and register the driver ---> com.jdbc.
 *3. create connection
 *4. create a statement
 *5. execute the query
 *6. process the results
 *7. close
 */

import java.io.*;
        import java.sql.*;

class GFG {
    public static void main(String[] args) throws Exception
    {
        String url
                = "jdbc:mysql://localhost:3306/table_name"; // table details
        String username = "rootgfg"; // MySQL credentials
        String password = "gfg123";
        String query
                = "select *from students"; // query to be run
        Class.forName(
                "com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(
                url, username, password);
        System.out.println(
                "Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery(query); // Execute query
        rs.next();
        String name
                = rs.getString("name"); // Retrieve name from db

        System.out.println(name); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}

//========================================================

using Log4j in java
Log4j is a logging framework for Java applications created under the Apache Software Foundation.
It offers features such as log levels, filters, appenders, etc. Log4j has been used extensively in the Java
development community for many years and has become the de-facto option for logging in Java applications.

You must first install the corresponding dependencies by adding them to the pom.xml file:
 </dependency>
    <dependency>

      <groupId>org.apache.logging.log4j</groupId>

      <artifactId>log4j-api</artifactId>

      <version>2.20.0</version>

    </dependency>

    <dependency>

      <groupId>org.apache.logging.log4j</groupId>

      <artifactId>log4j-core</artifactId>

      <version>2.20.0</version>

    </dependency>

  </dependencies>

Understanding log levels

There are a few things we need to discuss from the previous example. First, notice the logging call:

        logger.info("Hello World!");

The info() method here is used to log an event at the INFO level. In software development, log levels serve as a way to categorize log messages based on their severity or importance. Log4j offers six log levels by default, and each level is associated with an integer value:

TRACE (600): this is the least severe log level, typically used to log fine-grained information about a program's execution such as entering or exiting functions, and variable values, and other low-level details that can help in understanding the internal workings of your code.
DEBUG (500): it is used for logging messages intended to be helpful during the development and testing process, which is usually program state information that can be helpful when ascertaining whether an operation is being performed correctly.
INFO (400): it is used for informational messages that record events that occur during the normal operation of your application, such as user authentication, API calls, or database access. These messages help you understand what's happening within your application.
WARN (300): events logged at this level indicate potential issues that might require your attention before they become significant problems.
ERROR (200): it is used to record unexpected errors that occur during the course of program execution.
FATAL (100): this is the most severe log level, and it indicates an urgent situation affecting your application's core component that should be addressed immediately.

//========================================================
Spring Bean

the objects that form the backbone of your application and that are managed by the Spring IoC(Inversion of Control
(IoC) is a process in which an object defines its dependencies without creating them)container are called beans.
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.


The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container.
The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object.
ApplicationContext is a sub-interface of BeanFactory. It adds:

Easier integration with Spring’s AOP features
Message resource handling (for use in internationalization)
Event publication
Application-layer specific contexts such as the WebApplicationContext for use in web applications.

//=======================================================

BEAN LIFECYCLE
Bean life cycle is managed by the spring container. When we run the program then, first of all,
the spring container gets started. After that, the container creates the instance of a bean as per the request,
and then dependencies are injected. And finally, the bean is destroyed when the spring container is closed.
Therefore, if we want to execute some code on the bean instantiation and just after closing the spring container,
then we can write that code inside the custom init() method and the destroy() method.

Ways to implement the life cycle of a bean
1. By XML: In this approach, in order to avail custom init() and destroy() methods for a bean we have to register
these two methods inside the Spring XML configuration file while defining a bean
// Java program to create a bean
// in the spring framework
package beans;

public class HelloWorld {

    // This method executes
    // automatically as the bean
    // is instantiated
    public void init() throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    // This method executes
    // when the spring container
    // is closed
    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}


<!DOCTYPE
beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "http://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>
	<bean id="hw" class="beans.HelloWorld"
init-method="init" destroy-method="destroy"/>

</beans>

// Java program to call the
// bean initialized above

        package test;

import beans.HelloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Driver class
public class Client {

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of
        // the bean as it loads into container

        ConfigurableApplicationContext cap
                = new ClassPathXmlApplicationContext(
                "resources/spring.xml");

        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        cap.close();
    }
}


2. By Programmatic Approach: To provide the facility to the created bean to invoke custom init() method
on the startup of a spring container and to invoke the custom destroy() method on closing the container,
we need to implement our bean with two interfaces namely InitializingBean, DisposableBean and will have to
override afterPropertiesSet() and destroy() method. afterPropertiesSet() method is invoked as the container
starts and the bean is instantiated whereas, the destroy() method is invoked just after the container is closed.

// Java program to create a bean
// in the spring framework
        package beans;

import org.springframework
        .beans.factory.DisposableBean;

import org.springframework
        .beans.factory.InitializingBean;

// HelloWorld class which implements the
// interfaces
public class HelloWorld
        implements InitializingBean,
        DisposableBean {

    @Override
    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    public void afterPropertiesSet()
            throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method");
    }

    @Override
    // This method is invoked
    // just after the container
    // is closed
    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}


<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "http://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>
	<bean id="hw" class="beans.HelloWorld"/>

</beans>


// Java program to call the
// bean initialized above

        package test;

import org.springframework
        .context
        .ConfigurableApplicationContext;

import org.springframework
        .context.support
        .ClassPathXmlApplicationContext;

import beans.HelloWorld;

// Driver class
public class Client {

    public static void main(String[] args)
            throws Exception
    {

        // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of the bean
        // as it loads into container
        ConfigurableApplicationContext cap
                = new ClassPathXmlApplicationContext(
                "resources/spring.xml");

        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        cap.close();
    }
}


3. Using Annotation:

To provide the facility to the created bean to invoke custom init() method on the startup of
a spring container and to invoke the custom destroy() method on closing the container,
we need to annotate init() method by @PostConstruct annotation and destroy() method by @PreDestroy annotation.
// Java program to create a bean
// in the spring framework
package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// HelloWorld class
public class HelloWorld {

    // Annotate this method to execute it
    // automatically as the bean is
    // instantiated
    @PostConstruct
    public void init() throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method");
    }

    // Annotate this method to execute it
    // when Spring container is closed
    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}


<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "http://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

	<!-- activate the @PostConstruct and
@PreDestroy annotation -->

	<bean class="org.springframework
        .context.annotation
        .CommonAnnotationBeanPostProcessor"/>

	<!-- configure the bean -->
	<bean class="beans.HelloWorld"/>

</beans>


// Java program to call the
// bean initialized above

        package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.HelloWorld;

// Driver class
public class Client {

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        // Loading the Spring XML configuration
        // file into Spring container and
        // it will create the instance of the
        // bean as it loads into container
        ConfigurableApplicationContext cap
                = new ClassPathXmlApplicationContext(
                "resources/spring.xml");

        // It will close the Spring container
        // and as a result invokes the
        // destroy() method
        cap.close();
    }
}


//===========================================================
























