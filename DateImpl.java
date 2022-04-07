package mypack;
import mypack.MyDate;
import java.util.*;

public class DateImpl implements MyDate{
	public void showDate(){
		Date d = new Date();
		System.out.println(d);
	}
}