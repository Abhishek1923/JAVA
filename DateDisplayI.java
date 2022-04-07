//MyDate interface reference is used. to object of Datelmpl class
import mypack.MyDate;
import mypack.DateImpl;

class DateDisplayI{
	public static void main(String[] args) {
		MyDate o1=new DateImpl();
		o1.showDate();
	}
}