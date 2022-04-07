//HAS-A relationship
class Author
{
  String authorName;
  int age;

  // Author class constructor
  Author(String name, int age)
  {
    this.authorName = name;
    this.age = age;
  }
}

class  Book
{
  String name;
  int price;
  // author details
  Author auther;
  Book(String n, int p, Author auther)
  {
    this.name = n;
    this.price = p;
    this.auther = auther;
  }
  public static void main(String[] args) {
    Author auther = new Author("John", 42);
    Book b = new Book("Java for Begginer", 800, auther);
    System.out.println("Book Name: "+b.name);
    System.out.println("Book Price: "+b.price);
    System.out.println("------------Auther Details----------");
    System.out.println("Auther Name: "+b.auther.authorName);
    System.out.println("Auther Age: "+b.auther.age);
  }
  
}
