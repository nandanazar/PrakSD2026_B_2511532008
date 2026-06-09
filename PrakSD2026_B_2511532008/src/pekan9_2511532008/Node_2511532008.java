package pekan9_2511532008;

public class Node_2511532008 {
	int data_2008;
	Node_2511532008 left_2008;
	Node_2511532008 right_2008;
	
	public Node_2511532008 (int data_2008) {
		this.data_2008 = data_2008;
		left_2008 = null;
		right_2008 = null;
	}
	public void setLeft_2008 (Node_2511532008 node_2008) {
		if (left_2008 == null)
			left_2008 = node_2008;
	}
	public void setRight_2008 (Node_2511532008 node_2008) {
		if (right_2008 == null)
			right_2008 = node_2008;
	}
	public Node_2511532008 getLeft_2008 () {
		return left_2008;
	}
	public Node_2511532008 getRight_2008 () {
		return right_2008;
	}
	public int getData_2008 () { 
		return data_2008;
	}
	
	public void setData_2008 (int data_2008) {
		this.data_2008 = data_2008;
	}
	
	void printPreorder_2008 (Node_2511532008 node_2008) {
		if (node_2008 == null)
			return;
		System.out.print(node_2008.data_2008 + " ");
		printPreorder_2008 (node_2008.left_2008);
		printPreorder_2008 (node_2008.right_2008);
	}
	
	void printPostorder_2008 (Node_2511532008 node_2008) {
		if (node_2008 == null)
			return;
		printPostorder_2008 (node_2008.left_2008);
		printPostorder_2008 (node_2008.right_2008);
		System.out.print(node_2008.data_2008 + " ");
	}
	
	void printInorder_2008 (Node_2511532008 node_2008) {
		if (node_2008 == null)
			return;
		printInorder_2008 (node_2008.left_2008);
		System.out.print(node_2008.data_2008 + " ");
		printInorder_2008 (node_2008.right_2008);
	}
	
	public String print_2008() {
		return this.print_2008("", true, "");
	}
	
	public String print_2008(String prefix_2008, boolean isTail_2008, String sb_2008) {
		if (right_2008 != null) {
			right_2008.print_2008(prefix_2008 + (isTail_2008 ? "|   " : "   "), false, sb_2008);
		}
		System.out.println(prefix_2008 + (isTail_2008 ? "\\--" : "/--") + data_2008);
		if (left_2008 != null) {
			left_2008.print_2008(prefix_2008 + (isTail_2008 ? "   " : "|   "), true, sb_2008);
		}
		return sb_2008;

	}
	
}