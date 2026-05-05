package pekan5_2511532008;

public class HapusSLL_2511532008 {
    
    public static NodeSLL_2511532008 deleteHead_2008(NodeSLL_2511532008 head_2008) {
            if (head_2008 == null)
            return null;
        head_2008 = head_2008.next_2008;
                return head_2008;
    }
    public static NodeSLL_2511532008 removeLastNode_2008(NodeSLL_2511532008 head_2008) {
        
        if (head_2008 == null) {
            return null;
        }
        if (head_2008.next_2008 == null) {
            return null;
        }
        NodeSLL_2511532008 secondLast_2008 = head_2008;
        while (secondLast_2008.next_2008.next_2008 != null) {
            secondLast_2008 = secondLast_2008.next_2008;
        }
        secondLast_2008.next_2008 = null;
        return head_2008;
        
    }

    public static NodeSLL_2511532008 deleteNode_2008(NodeSLL_2511532008 head_2008, int position_2008) {
        NodeSLL_2511532008 temp_2008 = head_2008;
        NodeSLL_2511532008 prev_2008 = null;
        
        if (temp_2008 == null)
            return head_2008;
   
        if (position_2008 == 1) {
            head_2008 = temp_2008.next_2008;
            return head_2008;
        }
     
        for (int i_2008 = 1; temp_2008 != null && i_2008 < position_2008; i_2008++) {
            prev_2008 = temp_2008;
            temp_2008 = temp_2008.next_2008;
        }
      
        if (temp_2008 != null) {
            prev_2008.next_2008 = temp_2008.next_2008;
        } else {
            System.out.println("Data tidak ada");
        }
        return head_2008;
    }   
    public static void printList_2008(NodeSLL_2511532008 head_2008) {
        NodeSLL_2511532008 curr_2008 = head_2008;
        while (curr_2008.next_2008 != null) {
            System.out.print(curr_2008.data_2008 + "-->");
            curr_2008 = curr_2008.next_2008;
        }
        if (curr_2008.next_2008 == null) {
            System.out.print(curr_2008.data_2008);
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
     
        NodeSLL_2511532008 head_2008 = new NodeSLL_2511532008(1);
        head_2008.next_2008 = new NodeSLL_2511532008(2);
        head_2008.next_2008.next_2008 = new NodeSLL_2511532008(3);
        head_2008.next_2008.next_2008.next_2008 = new NodeSLL_2511532008(4);
        head_2008.next_2008.next_2008.next_2008.next_2008 = new NodeSLL_2511532008(5);
        head_2008.next_2008.next_2008.next_2008.next_2008.next_2008 = new NodeSLL_2511532008(6);

    
        System.out.println("list awal: ");
        printList_2008(head_2008);

     
        head_2008 = deleteHead_2008(head_2008);
        System.out.println("List setelah head dihapus: ");
        printList_2008(head_2008);

        head_2008 = removeLastNode_2008(head_2008);
        System.out.println("List setelah simpul terakhir di hapus: ");
        printList_2008(head_2008);

        int position_2008 = 2;
        head_2008 = deleteNode_2008(head_2008, position_2008);

    
        System.out.println("List setelah posisi 2 dihapus: ");
        printList_2008(head_2008);
    }
}
		
	

