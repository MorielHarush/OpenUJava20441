package Tree2021b92;

public class Node {
    public int _number;
    public Node _leftSon, _rightSon;


    public Node (int number){
        _number = number;
        _leftSon = null;
        _rightSon = null;
    }

    public int getNumber(){return _number;}
    public  Node getLeftSon(){return _leftSon;}
    public  Node getRightSon(){return _rightSon;}
    
    public static int find(Node root, int num) {
    	if (root== null)
    		return -1;
    	if (root.getNumber() == num)
    		return num;
    	else if(root.getNumber() < num) {
    		int k = find(root.getRightSon(),num);
    		if(k== -1)
    			return root.getNumber();
    		else
    			return k;

    	}
    	else if(root.getNumber() > num)
    		return find(root.getLeftSon(), num);
    	return -1;
    }
    
    
}
