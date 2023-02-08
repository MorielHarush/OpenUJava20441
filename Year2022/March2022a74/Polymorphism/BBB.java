package Poly2022a74;

public class BBB extends AAA{
	
	private String _st;
	public BBB() {
	_st = "bbb";
	}
	public BBB(String st, int val) {
	super(val);
	_st = st;
	}
	public String getSt() {
	return _st;
	}
	
	public String toString(){
	return "_val= " + getVal()+ " _st= "+_st;
	}
	
	public boolean equals (BBB other){
	System.out.println("BBB equals");
	return getVal() == other.getVal() &&
	_st.equals(other.getSt());
	}
} //end of class BBB
