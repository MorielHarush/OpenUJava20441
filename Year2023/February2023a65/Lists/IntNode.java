package Lists;

public class IntNode
{
	public int _value;
	public IntNode _next;
	public IntNode(int val, IntNode n) {
	_value = val;
	_next = n;
	}
	public IntNode(int val) {
	_value = val;
	_next = null;
	}
	public IntNode getNext( ) { return _next; }
	public void setNext(IntNode node) { _next = node; }
	public int getValue() { return _value; }
	public void setValue(int v) { _value = v; }
	
	public class IntList
	{
	public IntNode _head;
	public IntList(IntNode node) {
	_head = node;
	}
	
	public IntList secret(){
	IntNode p;
	IntNode temp, pTemp;
	IntNode i, j, k, l, ptr=null;
	
	temp = _head.getNext();
	pTemp = _head;
	
	while (temp != null){
		IntNode x = temp.getNext();
		if (temp.getValue() %2 != 0){
		pTemp.setNext(x);
		temp.setNext(_head);
		_head = temp;
	}
	else
		pTemp = temp;
		temp = x;
	}
	
	temp = _head.getNext();
	pTemp = _head;
	while (temp != null && temp.getValue() % 2 != 0)
	{
	pTemp = temp;
	temp = temp.getNext();
	}
	p = temp;
	pTemp.setNext(null);
	i = _head;
	j = p;
	while (j != null && i != null)
	{
	k = i.getNext();
	l = j.getNext();
	i.setNext(j);
	j.setNext(k);
	ptr = j;
	i = k;
	j = l;
	}
	if (i == null)
	ptr.setNext(j);
	
	return new IntList(_head);
	}
	
	
	}
}
