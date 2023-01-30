package Poly2;
public class B extends A {
	
	public B(int num) {
		super(num);
	}
	
	public boolean foo(B b) {
		System.out.println("BBfoo");
		return getNum() == b.getNum();
	}
	
	public boolean foo(C c) {
		System.out.println("BCfoo");
		return getNum() == c.getNum();
	}
}

