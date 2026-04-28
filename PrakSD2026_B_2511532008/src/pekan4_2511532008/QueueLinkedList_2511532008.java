package pekan4_2511532008;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532008 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for (int i =0; i<6; i++) {
			q.add(i);}
		
		System.out.println ("Elemen Antrian " + q);
		int hapus_2008 = q.remove ();
		System.out.println ("Hapus elemen =  "+ hapus_2008);
		System.out.println (q);
		int depan_2008 = q.peek();
		System.out.println ("kepala antrian = " + depan_2008);
		
		int banyak_2008 = q.size();
		System.out.println ("Size Antrian = " + banyak_2008);
	}

}