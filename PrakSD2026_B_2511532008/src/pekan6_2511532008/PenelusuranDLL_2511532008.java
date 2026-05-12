package pekan6_2511532008;


public class PenelusuranDLL_2511532008 {
	static void forwardTransversal_2008 (NodeDLL_2511532008 head_2008) {
	NodeDLL_2511532008 curr_2008 = head_2008;
	
	while (curr_2008 != null){
		System.out.print (curr_2008.data_2008 + " <-> ");
		curr_2008 = curr_2008.next_2008;
	}
	System.out.println();
}
	static void backwardTransversal_2010 (NodeDLL_2511532008 tail_2008) {
	NodeDLL_2511532008 curr_2008 = tail_2008;
	while (curr_2008!= null) {
		System.out.print (curr_2008.data_2008 + " <-> ");
		curr_2008 = curr_2008.prev_2008;
	}
	System.out.println();	
	}

	public static void main (String[] args) {
		NodeDLL_2511532008 head_2008 = new NodeDLL_2511532008(1);
		NodeDLL_2511532008 second_2008 = new NodeDLL_2511532008(2);
		NodeDLL_2511532008 third_2008 = new NodeDLL_2511532008(3);
		
		head_2008.next_2008 = second_2008;
		second_2008.prev_2008 = head_2008;
		second_2008.next_2008 = third_2008;
		third_2008.prev_2008 = second_2008;
		
		System.out.println("Penelusuran Maju (Forward):");
	    forwardTransversal_2008(head_2008); 
	    
	    System.out.println("Penelusuran Mundur (Backward):");
	    backwardTransversal_2010(third_2008);
	}

}