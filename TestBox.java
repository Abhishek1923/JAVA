public class TestBox {
Integer i;
int j;
public static void main (String[] args) {
TestBox t = new TestBox();
t.go();
}
public void go() {
//j=i; because j is int so it can store 0,1,2... but not null
System.out.println(j);
System.out.println(i);
}
}