package NodeTester;

// 2022a74
public class IntNodee {
	public static void main(String[] args) {
		IntNodee intNodee = new IntNodee();
		IntList intList = intNodee.new IntList();

		int[] arr = new int[]{-6,-3,-2,0,1,3,7,8,10};
		IntNode current = null;
		for(int i = arr.length - 1; i >= 0; i--){
			current = intNodee.new IntNode(arr[i], current);
		}
		intList._head = current;

		int x = 5;
		int count = intList.secret(x);
		System.out.println("Count: " + count);
	}

	public class IntNode {
		private int _value;
		private IntNode _next;
		public IntNode(int val, IntNode n) {
			_value = val;
			_next = n;
		}
		public IntNode getNext( ) {
			return _next;
		}
		public int getValue() {
			return _value;
		}
	}
	
	public class IntList
	{
		private IntNode _head;
		public IntList() {
			_head = null;
		}
		public int secret (int x)
		{
			int count=0;
			IntNode p = _head, q = _head.getNext();
			while (p!=null && q!=null)
			{
				if (p!=q && q.getValue()- p.getValue()== x)
				{
					System.out.println ("("+p.getValue()+","+q.getValue()+")");
					p = p.getNext();
					q = q.getNext();
					count++;
				}
				else if(q.getValue()- p.getValue()< x)
					q = q.getNext();
				else
					p = p.getNext();
			}
			return count;
		}
	} // end of class IntList
}