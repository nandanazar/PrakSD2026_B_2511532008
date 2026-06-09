package pekan9_2511532008;

public class BtreeDriver_2511532008 {
	public static void main (String [] args) {
		
		BTree_2511532008 tree_2008 = new BTree_2511532008 ();
		System.out.print("Jumlah Simpul Awal Pohon : ");
		System.out.println(tree_2008.countNodes_2008());
		
		//menambahkan simpul data 1
		Node_2511532008 root_2008 = new Node_2511532008 (1);
		
		//menjadikan simpul 1 sebagao root
		tree_2008.setRoot_2008(root_2008);
		System.out.print("Jumlah simpul jika hanya ada root :");
		System.out.println(tree_2008.countNodes_2008());
		Node_2511532008 node2_2008 = new Node_2511532008 (2);
		Node_2511532008 node3_2008 = new Node_2511532008 (3);
		Node_2511532008 node4_2008 = new Node_2511532008 (4);
		Node_2511532008 node5_2008 = new Node_2511532008 (5);
		Node_2511532008 node6_2008 = new Node_2511532008 (6);
		Node_2511532008 node7_2008 = new Node_2511532008 (7);
		Node_2511532008 node8_2008 = new Node_2511532008 (8);
		Node_2511532008 node9_2008 = new Node_2511532008 (9);
		
		root_2008.setLeft_2008(node2_2008);
		node2_2008.setLeft_2008(node4_2008);
		node2_2008.setRight_2008(node5_2008);
		node4_2008.setRight_2008(node8_2008);
		root_2008.setRight_2008(node3_2008);
		node3_2008.setLeft_2008(node6_2008);
		node3_2008.setRight_2008(node7_2008);
		node6_2008.setLeft_2008(node9_2008);
		
		
		tree_2008.setCurrent_2008(tree_2008.getRoot_2008());
		System.out.println("menampilkan simpul terakhir :");
		System.out.println(tree_2008.getCurrent_2008().getData_2008());
		System.out.println("Jumlah simpul ; setelah simpul 7 ditambahkan :");
		System.out.println(tree_2008.countNodes_2008());
		System.out.println("InOrder:");
		tree_2008.printInorder_2008();
		System.out.println("\nPreOrder:");
		tree_2008.printPreorder_2008();
		System.out.println("\nPostOrder:");
		tree_2008.printPostorder_2008();
		System.out.println("\nmenampilkan simpul dalam bentuk phon : ");
		tree_2008.print_2008();
	}
}