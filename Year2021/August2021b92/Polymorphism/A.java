package Polymorphism2021b92;

public abstract class A {

	protected int _x;
	
	public A() {
		_x=1;
	}
	
	public abstract int foo(int x);
	
	public void foo(A a) {
		_x = a._x;
	}
	
	
}
