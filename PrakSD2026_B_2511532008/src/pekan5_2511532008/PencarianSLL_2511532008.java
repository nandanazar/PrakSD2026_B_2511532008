package pekan5_2511532008;

public class PencarianSLL_2511532008 {
	
	static boolean searchKey_2008 (NodeSLL_2511532008 head_2008, int key_2008) {
		NodeSLL_2511532008 curr_2008 = head_2008;
		while (curr_2008 != null) {
			if ( curr_2008.data_2008 == key_2008)
				return true;
			curr_2008 = curr_2008.next_2008;}
		return false;
	}
	
	public static void traversal_2008 (NodeSLL_2511532008 head_2008) {
		
		NodeSLL_2511532008 curr_2008 = head_2008;
		
		while (curr_2008 != null) {
			System.out.print(" " + curr_2008.data_2008);
			curr_2008 = curr_2008.next_2008;
		}
		System.out.println();
	}
	
	public static void main (String [] args) {
		NodeSLL_2511532008 head_2008 = new NodeSLL_2511532008(14);
		head_2008.next_2008 = new NodeSLL_2511532008(21);
		head_2008.next_2008.next_2008 = new NodeSLL_2511532008(13);
		head_2008.next_2008.next_2008.next_2008 = new NodeSLL_2511532008(30);
		head_2008.next_2008.next_2008.next_2008.next_2008 = new NodeSLL_2511532008(10);
		System.out.print("Penelusuran : ");
		traversal_2008 (head_2008);
		
		int key_2008 = 30;
		System.out.print("Cari data " + key_2008 + " = ");
		if (searchKey_2008(head_2008, key_2008))
			System.out.println("Ketemu");
		else 
			System.out.println(" Tidak ada ");
	}

}
