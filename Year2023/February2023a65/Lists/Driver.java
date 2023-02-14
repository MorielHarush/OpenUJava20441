package Lists;

public class Driver {

	public static void main(String[] args) {
//	    IntNode node6 = new IntNode(6);
//	    IntNode node5 = new IntNode(5, node6);
//	    IntNode node4 = new IntNode(4, node5);
//	    IntNode node3 = new IntNode(3, node4);
//	    IntNode node2 = new IntNode(2, node3);
//	    IntNode node1 = new IntNode(1, node2);
//	    
	    IntNode node4 = new IntNode(1);
	    IntNode node3 = new IntNode(2, node4);
	    IntNode node2 = new IntNode(1, node3);
	    IntNode node1 = new IntNode(2, node2);
	    IntNode.IntList list = node1.new IntList(node1);
	    IntNode first = list._head;
	    while (first != null) {
	        System.out.print(first.getValue() + " ");
	        first = first.getNext();
	    }
	    
	    System.out.println("");
	    IntNode.IntList secretList = list.secret();
	    
	    IntNode current = secretList._head;
	    while (current != null) {
	        System.out.print(current.getValue() + " ");
	        current = current.getNext();
	    }
	}
		
}
