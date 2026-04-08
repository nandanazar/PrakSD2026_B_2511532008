package pekan3_2511532008;

public class StackArrayDriver_2511532008 {

	public static void main(String[] args) {
		StackArray_2511532008 s = new StackArray_2511532008();
		s.push_2511532008(10);
		s.push_2511532008(20);
		s.push_2511532008(30);
		System.out.println(s.pop_2511532008()+" dikeluarkan dari stack");
		System.out.println("Elemen Teratas adalah : " + s.peek_2511532008());
		System.out.print("Elemen pada stack : ");
		s.print();
		
	}

}
