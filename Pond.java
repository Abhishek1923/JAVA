import java.io.*;
public class Pond implements Serializable {
private Duck duck = new Duck();/*Duck is not serializable!
								It doesn’t implement Serializable
								so when you try to serialize a ,
								Pond object, it fails because
								Pond’s Duck instance variable t
								So we have to transient this*/
public static void main (String[] args) {
Pond myPond = new Pond();
try {
FileOutputStream fs = new FileOutputStream("Pond.ser");
ObjectOutputStream os = new ObjectOutputStream(fs);
os.writeObject(myPond);
os.close();
} catch(Exception ex) {
ex.printStackTrace();
}
}
}
public class Duck {
// duck code here
}