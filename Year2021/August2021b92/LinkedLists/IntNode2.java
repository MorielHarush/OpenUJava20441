package Lists2021b92;


// This IntNode2 is the fixed code . i dont know if that use a trap or it was a mistake.
public class IntNode2 {

	public int _value;
	public IntNode _next;
	
	public IntNode(int val, IntNode n) {
		_value = val;
		_next = n;
}
	public int getValue() {
		return _value;
	}
	
	public IntNode getNext() {
		return _next;
	}
	
	public void setValue(int v) {
		_value = v;
	}
	
	public void setNext(IntNode node) {
		_next = node;
	}

	public class IntList{
		
	public IntNode _head;
	
	public IntList(IntNode node) {
		_head = node;
	}

	public boolean what1(IntList list) {
		IntNode h1 = _head;
		IntNode h2 = list._head;
		while((h1 != null) && (h2 != null)) {
			if(h1.getValue() != h2.getValue())
				return false;
			h1 = h1.getNext();
			h2 = h2.getNext();
		}
		
	return true;
	}
	
	public boolean what2(IntList list) {
		IntNode h1 = _head;
		
		while(h1 != null) {
			boolean found = false;
			IntNode h2 = list._head;
			while((h2 != null) && (!found)) {
				if (h1.getValue() == h2.getValue())
					found = true;
				h2 = h2.getNext();
			}
			if(!found)
				return false;
			h1 = h1.getNext();
		}
		return true;
}
}
}
