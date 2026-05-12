package pekan6_2511532008;

public class InsertDLL_2511532008 {
   
    	static NodeDLL_2511532008 insertBegin_2008(NodeDLL_2511532008 head_2008, int data_2008) {
        NodeDLL_2511532008 new_node_2008 = new NodeDLL_2511532008(data_2008);   
           new_node_2008.next_2008 = head_2008;
           if (head_2008 != null) {
            head_2008.prev_2008 = new_node_2008;
        }
        return new_node_2008; 
    }
       public static NodeDLL_2511532008 insertEnd_2008(NodeDLL_2511532008 head_2008, int newData_2008) {   
        NodeDLL_2511532008 newNode_2008 = new NodeDLL_2511532008(newData_2008);
     
        if (head_2008 == null) {
            head_2008 = newNode_2008;
        }
        else {
            NodeDLL_2511532008 curr_2008 = head_2008;
            while (curr_2008.next_2008 != null) {
                curr_2008 = curr_2008.next_2008;
            }
            curr_2008.next_2008 = newNode_2008;
            newNode_2008.prev_2008 = curr_2008;
        }
        return head_2008;
    }	   
       public static NodeDLL_2511532008 insertAtPosition_2008(NodeDLL_2511532008 head_2008, int pos_2008, int new_data_2008) {
                  NodeDLL_2511532008 new_node_2008 = new NodeDLL_2511532008(new_data_2008);
                  if (pos_2008 == 1) {
               new_node_2008.next_2008 = head_2008;
               if (head_2008 != null) {
                   head_2008.prev_2008 = new_node_2008;
               }
               head_2008 = new_node_2008;
               return head_2008;
           }
           NodeDLL_2511532008 curr_2008 = head_2008;
                  for (int i_2008 = 1; i_2008 < pos_2008 - 1 && curr_2008 != null; ++i_2008) {
               curr_2008 = curr_2008.next_2008;
           }
                  if (curr_2008 == null) {
                	  System.out.println("Posisi tidak ada");
                	  return head_2008;
           }
           new_node_2008.prev_2008 = curr_2008; 
           new_node_2008.next_2008 = curr_2008.next_2008;
           curr_2008.next_2008 = new_node_2008;

           if (new_node_2008.next_2008 != null) {
               new_node_2008.next_2008.prev_2008 = new_node_2008;
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
       
       public static void main(String[] args_2008) {
    	    NodeDLL_2511532008 head_2008 = new NodeDLL_2511532008(2);
    	    head_2008.next_2008 = new NodeDLL_2511532008(3);
    	    head_2008.next_2008.prev_2008 = head_2008;
    	    head_2008.next_2008.next_2008 = new NodeDLL_2511532008(5);
    	    head_2008.next_2008.next_2008.prev_2008 = head_2008.next_2008;

    	    System.out.print("DLL Awal: ");
    	    printList_2008(head_2008);

    	    head_2008 = insertBegin_2008(head_2008, 1);
    	    System.out.print("simpul 1 ditambah di awal: ");
    	    printList_2008(head_2008);

    	    System.out.print("simpul 6 ditambah di akhir: ");
    	    int data_2008 = 6;
    	    head_2008 = insertEnd_2008(head_2008, data_2008);
    	    printList_2008(head_2008);


    	    System.out.print("tambah node 4 di posisi 4: ");
    	    int data2_2008 = 4;
    	    int pos_2008 = 4;
    	    head_2008 = insertAtPosition_2008(head_2008, pos_2008, data2_2008);
    	    printList_2008(head_2008);
    	}
       
       
           
}
