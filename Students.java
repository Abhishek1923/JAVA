import java.io.*;
class Demo8
{
public static void main(String mycode[])
{
try
{
FileOutputStream fout = new FileOutputStream("f1.txt");
ObjectOutputStream oout = new ObjectOutputStream(fout);
oout.writeObject(new Students("Walter",12));
oout.writeObject(new Students("Jesse",10));
oout.writeObject(new Students("Skyler",11));
oout.close();
fout.close();
FileInputStream fin = new FileInputStream("f1.txt");
ObjectInputStream oin = new ObjectInputStream(fin);
Students fuc;
fuc=(Students)oin.readObject();
fuc.show();
fuc=(Students)oin.readObject();
fuc.show();
fuc=(Students)oin.readObject();
fuc.show();
oin.close();
fin.close();
}
catch(Exception ifany)
{
ifany.printStackTrace();
}
}
}
class Students implements Serializable
{
String name ;
int age;
Students(String name,int age)
{
this.name = name;
this.age = age;
}
void show()
{
System.out.println(name);
System.out.println(age);
}
}