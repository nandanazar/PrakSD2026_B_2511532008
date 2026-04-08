package pekan3_2511532008;
import java.util.*;
public class LatihanStack_2511532008 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(42);
		s.push(-3);
		s.push(17);
		
		System.out.println("Nilai stack = " + s);
		System.out.println("Nilai pop = " + s.pop());
		System.out.println("Nilai setelah pop = " + s);
		System.out.println("Nilai peek =" + s.peek());
		System.out.println("Nilai setelah peek =" + s);
		
	}
}