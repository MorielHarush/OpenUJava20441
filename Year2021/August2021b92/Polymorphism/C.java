package Polymorphism2021b92;

public class C extends B{
	
	public C() {
		super();
	}
	
	public C(int val) {
		super(val);
	}
	
	public int foo(int x) {
		return _x - x;
	}
	
	public void foo(A a) {
		if (a instanceof C) {
			_x = _x - a._x;
//			System.out.println(a._x);
		}else {
			super.foo(a);
		}
	}
	
	public void foo(B b) {
		super.foo(b);
		_x++;
	}
	
	public void foo(C c) {
		_x = c._x -1;
	}

}
