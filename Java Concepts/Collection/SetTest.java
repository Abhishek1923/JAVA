import java.util.*;
class SetTest{
	public static void main(String[] args){
		//LinkedHashSet s = new LinkedHashSet();
		//HashSet s = new HashSet();
		TreeSet s = new TreeSet();
		s.add(11);
		s.add(12);
		s.add(null);

		System.out.println(s);
	}
}