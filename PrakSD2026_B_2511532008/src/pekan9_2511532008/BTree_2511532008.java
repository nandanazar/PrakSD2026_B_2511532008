package pekan9_2511532008;

public class BTree_2511532008 {
	private Node_2511532008 root_2008;
	private Node_2511532008 currentNode_2008;
	public BTree_2511532008 () {
		root_2008 = null;
	}
	
	public boolean search_2008 (int data_2008) {
		return search_2008 (root_2008, data_2008);
	}
	
	private boolean search_2008 (Node_2511532008 node_2008 , int data_2008) {
		if (node_2008.getData_2008() == data_2008)
			return true;
		if(node_2008.getLeft_2008() != null)
			if (search_2008(node_2008.getLeft_2008(), data_2008))
				return true;
		if(node_2008.getRight_2008() != null)
			if (search_2008(node_2008.getRight_2008(), data_2008))
				return true;
		return false;
	}
	
	public void printInorder_2008 () {
		root_2008.printInorder_2008(root_2008);
	}
	
	public void printPreorder_2008 () {
		root_2008.printPreorder_2008(root_2008);
	}
	
	public void printPostorder_2008 () {
		root_2008.printPostorder_2008(root_2008);
	}
	
	public Node_2511532008 getRoot_2008 () {
		return root_2008;
	}
	
	public boolean isEmpty_2008 () {
		return root_2008 == null;
	}
	
	public int countNodes_2008 () {
		return countNodes_2008 (root_2008);
	}
	
	private int countNodes_2008 (Node_2511532008 node_2008) {
		int count_2008 = 1;
		if (node_2008 == null){
			return 0;
		} else {
			count_2008 += countNodes_2008 (node_2008.getLeft_2008());
			count_2008 += countNodes_2008 (node_2008.getRight_2008());
			return count_2008;
		}
	}
	
	public void print_2008 () {
		root_2008.print_2008();
	}
	
	public Node_2511532008 getCurrent_2008 () {
		return currentNode_2008;
	}
	
	public Node_2511532008 setCurrent_2008 (Node_2511532008 node_2008) {
		return currentNode_2008 = node_2008;
	}
	
	public void setRoot_2008 (Node_2511532008 root_2008) {
		this.root_2008 = root_2008;
	}
}