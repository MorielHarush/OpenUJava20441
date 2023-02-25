package Lists2021b92;

public class Driver2 {

	public static void main(String[] args) {
	    IntNode node5 = new IntNode(5,null);
	    IntNode node4 = new IntNode(4, node5);
	    IntNode node3 = new IntNode(3, node4);
	    IntNode node2 = new IntNode(2, node3);
	    IntNode node1 = new IntNode(1, node2);
	    
	    // Create a list
	    IntNode.IntList testList = node1.new IntList(node1);
	    
//	    IntNode node10 = new IntNode(5,null);
	    IntNode node9 = new IntNode(3, null);
	    IntNode node8 = new IntNode(4, node9);
	    IntNode node7 = new IntNode(2, node8);
	    IntNode node6 = new IntNode(1, node7);
	    
	    // Create Second List
	    IntNode.IntList list = node6.new IntList(node6);
	    
	    // Check
	    boolean result = testList.what1(list);
	    System.out.println("First Result:" + result);
	    boolean result2 = testList.what2(list);
	    System.out.println("Second Result:" + result2);
	}
}
