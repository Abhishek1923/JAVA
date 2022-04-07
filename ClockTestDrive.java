class Clock {
String time;
void setTime(String t) {
	time = t;
}
String getTime() {		//compatible datatypes should return as void can't be converted to string
	return time;
}
}

class ClockTestDrive {
public static void main(String [] args) {
	Clock c = new Clock();
	c.setTime("1245");
	String tod = c.getTime();
	System.out.println("time: " + tod);
}
}
