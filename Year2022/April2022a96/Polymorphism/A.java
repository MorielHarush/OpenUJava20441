package Poly2;

public class A {

	private int _num;
	
	public A(int num) {
		_num = num;
	}
	
	public int getNum() {
		return _num;
	}
	
	public boolean foo(A a) {
//		System.out.println("Afoo");
		return _num>=2*a._num;
	}
}

