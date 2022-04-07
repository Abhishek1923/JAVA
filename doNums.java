import.java.util.*;
class Wrapper{
	public void doNums() {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(3);
		int num = listOfNumbers.get(0);
	}
}
class doNumsTest {
	public static void main(String[] args) {
		Wrapper d= new Wrapper();
		d.doNums();
	}
}
