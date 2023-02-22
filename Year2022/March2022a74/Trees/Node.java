package Trees2022a74;

public class Node {

		public int _number;
		public Node _leftSon, _rightSon;
		public Node (int number) {
		_number = number;
		_leftSon = null;
		_rightSon = null;
		}
		public int getNumber() {return _number; }
		public Node getLeftSon() {return _leftSon; }
		public Node getRightSon() {return _rightSon; }

	public static Node why(Node root, Node t){
	if (root==null || root.getLeftSon()==t || root.getRightSon()==t)
		return root;
	Node temp = why(root.getLeftSon(),t);
	if (temp==null)
		return why(root.getRightSon(),t);
	return temp;
	}
	
	public static int what(Node root, Node t)
	{
	if (root == null)
	return 0;
	if(root == why(root,t))
	return 1;
	return 1+ what(root, why(root,t));
	}
	
}
