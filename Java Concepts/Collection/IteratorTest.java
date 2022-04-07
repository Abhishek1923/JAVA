import java.util.*;
class MyTest implements Comparator{
	public int compare(Object o1, Object o2){
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}
}
class IteratorTest{
	public static void main(String[] args){
		MyTest mt = new MyTest();
		TreeSet ts= new TreeSet();
		ts.add(new StringBuffer("Paras"));
		ts.add(new StringBuffer("Bhavya"));
		ts.add(new StringBuffer("Ansh"));
		ts.add(new StringBuffer("Rohit"));
		ts.add(new StringBuffer("Pratham"));
		ts.add(new StringBuffer("Abhi"));
		System.out.println(ts);
	}
}