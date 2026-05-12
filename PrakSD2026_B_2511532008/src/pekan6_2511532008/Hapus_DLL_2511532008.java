package pekan6_2511532008;

public class Hapus_DLL_2511532008 {

    public static NodeDLL_2511532008 delHead_2008(NodeDLL_2511532008 head_2008) {
        if (head_2008 == null) {
            return null;
        }
       
        head_2008 = head_2008.next_2008;
   
        if (head_2008 != null) {
            head_2008.prev_2008 = null;
        }
        return head_2008;
    }
    public static NodeDLL_2511532008 delLast_2008(NodeDLL_2511532008 head_2008) {
        if (head_2008 == null) {
            return null;
        }
        if (head_2008.next_2008 == null) {
            return null;
        }
        NodeDLL_2511532008 curr_2008 = head_2008;
        while (curr_2008.next_2008 != null) {
            curr_2008 = curr_2008.next_2008;
        }
        if (curr_2008.prev_2008 != null) {
            curr_2008.prev_2008.next_2008 = null;
        }
        return head_2008;
    }
    public static NodeDLL_2511532008 delPos_2008(NodeDLL_2511532008 head_2008, int pos_2008) {
    	if (head_2008 == null) {
    		return head_2008; }
    	NodeDLL_2511532008 curr_2008 = head_2008;
    	
    	for (int i = 1; curr_2008 != null && i < pos_2008; ++i) {
    		curr_2008 = curr_2008.next_2008;
    	}
    	if (curr_2008 == null) {
    		return head_2008;
    	}
    	if (curr_2008.prev_2008 != null) {
    		curr_2008.prev_2008.next_2008 = curr_2008.next_2008;
    	}
    	if (curr_2008.next_2008 != null) {
    		curr_2008.next_2008.prev_2008 = curr_2008.prev_2008;
    	}
    	if (head_2008 == curr_2008) {
    		head_2008 = curr_2008.next_2008;
    	}  	
    	return head_2008;
    	
    }
    
    public static void printList_2008(NodeDLL_2511532008 head_2008) {
    	NodeDLL_2511532008 curr_2008 = head_2008;
    	while (curr_2008 != null) {
    		System.out.print(curr_2008.data_2008 + " <-> ");
    		curr_2008 = curr_2008.next_2008;
    	}
    	System.out.println();
    }
    public static void main(String[] args ) {

        NodeDLL_2511532008 head_2008 = new NodeDLL_2511532008(1);
        head_2008.next_2008 = new NodeDLL_2511532008(2);
        head_2008.next_2008.prev_2008 = head_2008;
        head_2008.next_2008.next_2008 = new NodeDLL_2511532008(3);
        head_2008.next_2008.next_2008.prev_2008 = head_2008.next_2008;
        head_2008.next_2008.next_2008.next_2008 = new NodeDLL_2511532008(4);
        head_2008.next_2008.next_2008.next_2008.prev_2008 = head_2008.next_2008.next_2008;
        head_2008.next_2008.next_2008.next_2008.next_2008 = new NodeDLL_2511532008(5);
        head_2008.next_2008.next_2008.next_2008.next_2008.prev_2008 = head_2008.next_2008.next_2008.next_2008;

        System.out.print("DLL Awal: ");
        printList_2008(head_2008);

        System.out.print("Setelah head dihapus: ");
        head_2008 = delHead_2008(head_2008);
        printList_2008(head_2008);

        System.out.print("Setelah node terakhir dihapus: ");
        head_2008 = delLast_2008(head_2008);
        printList_2008(head_2008);

        System.out.print("menghapus node ke 2: ");
        head_2008 = delPos_2008(head_2008, 2);
        printList_2008(head_2008);
    }
    
}































