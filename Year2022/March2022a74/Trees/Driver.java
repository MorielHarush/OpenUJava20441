package Trees2022a74;



public class Driver {
    public static void  main (String[] args){
	 Node bt = new Node(36);

     bt._rightSon = new Node(5);
     bt._rightSon._rightSon = new Node(35);

     bt._leftSon = new Node(7);
     bt._leftSon._leftSon = new Node(6);
     bt._leftSon._leftSon._leftSon = new Node(25);
     
     bt._leftSon._rightSon = new Node(29);
     Node t = bt._leftSon._rightSon._rightSon = new Node(10);

     Node t1 = bt._leftSon._rightSon._leftSon = new Node(8);
     bt._leftSon._rightSon._leftSon._rightSon = new Node(70);
     
     System.out.println(Node.why(bt, t));
     System.out.println(Node.why(bt, t1));
     System.out.println(Node.what(bt,t));
     System.out.println(Node.what(bt,t1));
}
}
