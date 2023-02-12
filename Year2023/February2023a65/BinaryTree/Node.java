package Trees2023;

public class Node {
	private int _number;
	public Node _leftSon, _rightSon;
	public Node (int number)
	{
	_number = number;
	_leftSon = null;
	_rightSon = null;
	}
	public int getNumber() {return _number; }
	public Node getLeftSon() {return _leftSon; }
	public Node getRightSon() {return _rightSon; }
	public void setNumber(int num) { _number = num; }
	public void setLeftSon(Node node) { _leftSon = node; }
	public void setRightSon(Node node) { _rightSon = node; }
	
	
	public static int what(Node root)
	{
	return what(root, 1);
	}
	
	private static int what(Node root, int op){
	if (root == null)
		if (op == 0)
		return Integer.MIN_VALUE;
		else
		return Integer.MAX_VALUE;
	if (root.getLeftSon() == null && root.getRightSon() == null)
		return root.getNumber();
	if (op == 1)
	return Math.max(what(root.getLeftSon(), 0),what(root.getRightSon(), 0));
	else
	return Math.min(what(root.getLeftSon(), 1),what(root.getRightSon(), 1));
	}
	
	public static int what1(Node root)
	{
	return what1(root, 1);
	}
	private static int what1(Node root, int op){
	if (root == null)
		if (op == 0)
			return Integer.MAX_VALUE;
		else
			return Integer.MIN_VALUE; 
	if (root.getLeftSon() == null && root.getRightSon() == null)
		return root.getNumber();
	if (op == 1) {
		return Math.min(what1(root.getLeftSon(), 0),what1(root.getRightSon(), 0));
	}
	else {
		return Math.max(what1(root.getLeftSon(), 1),what1(root.getRightSon(), 1));
		}
	}
	
	}


