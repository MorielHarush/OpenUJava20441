package Tree2021b92;


public class Driver {
    public static void  main (String[] args){
    	
    Node bt = new Node(60);

    bt._rightSon = new Node(70);
    
    bt._leftSon = new Node(40);
    bt._leftSon._leftSon = new Node(30);
    bt._leftSon._leftSon._leftSon = new Node(20);

    bt._leftSon._rightSon = new Node(50);
    bt._leftSon._rightSon._rightSon = new Node(55);

    bt._leftSon._rightSon._leftSon = new Node(47);
    bt._leftSon._rightSon._leftSon._leftSon = new Node(43);
    
    System.out.println(Node.find(bt, 43));
    System.out.println(Node.find(bt, 59));
    System.out.println(Node.find(bt, 15));
    
}
}
