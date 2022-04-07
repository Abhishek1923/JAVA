import java.util.*;
class ArrayListTest{
	public static void main(String[] args){
	Vector al = new Vector();
	al.add(11);
	al.add(1);
	al.add(21);
	al.add(null); //null allowed
	al.add(14);
	al.add(12);
	al.add(14);
	System.out.println(al);
	System.out.println("Size "+al.size());
	System.out.println("is empty "+al.isEmpty());
	System.out.println("contains 1 "+al.contains(1));
	System.out.println("index of  14 "+al.indexOf(14));
	System.out.println("last index of 14 "+al.lastIndexOf(14));
	System.out.println("get(2)  "+al.get(2));
	al.set(1,111);
	System.out.println("al set(1,111) "+al);
	al.remove(2);//index
	System.out.println("remove(2) "+al);
	System.out.println("al "+al);
	al.clear();
	System.out.println("after al clear() "+al);
	System.out.println("is empty "+al.isEmpty());
	}
}