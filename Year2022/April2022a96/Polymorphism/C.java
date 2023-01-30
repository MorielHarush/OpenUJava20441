package Poly2;
public class C extends A {
	
	private int _num2;
	public C() {
		super(20);
		_num2 =20;
	}
	
	public boolean foo(A a) {
		System.out.println("Cfoo");
		if(!(a instanceof C))
			return false;
		C c =(C)a;
		return _num2 == c._num2;
	}
}

