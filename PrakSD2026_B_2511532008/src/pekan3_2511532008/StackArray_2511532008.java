package pekan3_2511532008;

public class StackArray_2511532008 {
	
	
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	boolean isEmpty() {
		return (top<0);
	}
	StackArray_2511532008(){
		top = -1;
	}
	boolean push_2511532008 (int x) {
		if (top >= (MAX - 1)) {
			System.out.println("STACK Overflow");
			return false; 
			}
		else {
			a [++top] = x;
			System.out.println(x + " Dimasukan dalam stack");
			return true;
		}
	}
	int pop_2511532008() {
		if (top < 0) {
			System.out.println("STACK underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek_2511532008() {
		if (top < 0) {
			System.out.println("STACK Underflow : ");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print () {
		for (int i = top; i>-1; i--) {
			System.out.println(" " + a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
