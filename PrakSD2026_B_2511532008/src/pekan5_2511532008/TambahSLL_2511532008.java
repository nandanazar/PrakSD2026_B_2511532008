package pekan5_2511532008;

public class TambahSLL_2511532008 {
	
	public static NodeSLL_2511532008 insertAtFront(NodeSLL_2511532008 head_2008, int value_2008) {
		NodeSLL_2511532008 new_node_2008 = new NodeSLL_2511532008(value_2008);
		new_node_2008.next_2008 = head_2008;
		return new_node_2008;
	}
	public static NodeSLL_2511532008 insertAtEnd(NodeSLL_2511532008 head_2008, int value_2008) {
		NodeSLL_2511532008 newNode_2008 = new NodeSLL_2511532008(value_2008);
		if (head_2008 == null) {
			return newNode_2008;
		}
		NodeSLL_2511532008 last_2008 = head_2008;
		while (last_2008.next_2008 != null) {
			last_2008 = last_2008.next_2008;
		}
		last_2008.next_2008 = newNode_2008;
			return head_2008;
	}
	static NodeSLL_2511532008 GetNode_2008 (int data_2008) {
		return new NodeSLL_2511532008(data_2008);
	}
	
	static NodeSLL_2511532008 insertPos_2008(NodeSLL_2511532008 headNode_2008, int position_2008, int value_2008) {
	    NodeSLL_2511532008 head_2008 = headNode_2008;
	    if (position_2008 < 1)
	        System.out.print("Invalid position");
	    if (position_2008 == 1) {
	        NodeSLL_2511532008 new_node_2008 = new NodeSLL_2511532008(value_2008);
	        new_node_2008.next_2008 = head_2008;
	        return new_node_2008;
	    } else {
	        while (position_2008 -- != 0) {
	            if (position_2008 == 1) {
	                NodeSLL_2511532008 newNode_2008 = GetNode_2008(value_2008);
	                newNode_2008.next_2008 = headNode_2008.next_2008;
	                headNode_2008.next_2008 = newNode_2008;
	                break;
	            }
	            headNode_2008 = headNode_2008.next_2008;
	        }
	    }
	    if (position_2008 != 1)
	        System.out.print("Posisi di luar jangkauan");
	    return head_2008;
	}
	public static void printList_2008(NodeSLL_2511532008 head_2008) {
	    NodeSLL_2511532008 curr_2008 = head_2008;
	    while (curr_2008.next_2008 != null) {
	        System.out.print(curr_2008.data_2008+" --> ");
	        curr_2008 = curr_2008.next_2008;
	    }
	    if (curr_2008.next_2008==null) {
	        System.out.print(curr_2008.data_2008);
	    }
	    System.out.println();
	}
	public static void main(String[] args) {
	    NodeSLL_2511532008 head_2008 = new NodeSLL_2511532008(2);
	    head_2008.next_2008 = new NodeSLL_2511532008(3);
	    head_2008.next_2008.next_2008 = new NodeSLL_2511532008(5);
	    head_2008.next_2008.next_2008.next_2008 = new NodeSLL_2511532008(6);
	    
	    System.out.print("Senarai berantai awal: ");
	    printList_2008(head_2008);

	  
	    System.out.print("tambah 1 simpul di depan: ");
	    int data_2008 = 1;
	    head_2008 = insertAtFront(head_2008, data_2008);

	   
	    printList_2008(head_2008);
	    System.out.print("tambah 1 simpul di belakang: ");
	    int data2_2008 = 7;
	    head_2008 = insertAtEnd(head_2008, data2_2008);

	    printList_2008(head_2008);
	    
	    System.out.print("Tambah 1 simpul data ke 4 : ");
	    int data3_2008 = 4;
	    int pos_2008 = 4;
	    head_2008 = insertPos_2008 (head_2008, pos_2008, data3_2008);
	    printList_2008(head_2008);
	}
}
