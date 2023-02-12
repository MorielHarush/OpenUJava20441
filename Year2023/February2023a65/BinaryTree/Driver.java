package Trees2023;

public class Driver {
    public static void  main (String[] args){
    	
    	 Node bt = new Node(60);

         bt._rightSon = new Node(40);

         bt._leftSon = new Node(20);
         bt._leftSon._leftSon = new Node(10);
         bt._leftSon._leftSon._leftSon = new Node(15);
         
         bt._leftSon._rightSon = new Node(30);
         bt._leftSon._rightSon._rightSon = new Node(5);

         bt._leftSon._rightSon._leftSon = new Node(10);
         bt._leftSon._rightSon._leftSon._rightSon = new Node(30);
         
//        System.out.println(Node.what(bt));
    	System.out.println(Node.what1(bt));
    }

    	
}
