import java.util.*;
class StackTest{
	public static void main(String[] args){
		Stack st = new Stack();
		st.push(11);
		st.push(1);
		st.push(21);
		st.push(14);
		System.out.println(st);
		System.out.println("peek() "+st.peek());//returns top element
		System.out.println("pop() "+st.pop());//deletes top element
		System.out.println(st);
		System.out.println(st.search(11)); //return offset
		System.out.println(st.search(5));// -1
	}
}