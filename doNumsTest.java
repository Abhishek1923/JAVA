class Wrapper{
	public void doNums() {
		ArrayList listOfNumbers = new ArrayList();
		listOfNumbers.add(new Integer(3));
		Integer one = (Integer) listOfNumbers.get(0);
		int intOne = one.intValue();
	}
}
public class doNumsTest {
	public static void main(String[] args) {
		Wrapper d= new Wrapper();
		//System.out.println(d);
		d.doNums();
	}
}


/*public void doNumsNewWay() {
ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
listOfNumbers.add(3);
int num = listOfNumbers.get(0);
}
class doNumsTest{
	public static void main(String[] args) {
		//System.out.println();
	}
}*/