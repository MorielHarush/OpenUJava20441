package Polymorphism2021b92;

public class B extends A{

	public B() {
		super();
	}
		public B(int val){
			_x = val;
		}
		
		public B(A val) {
			_x = foo(val._x);
		}
		
		public int foo(int x) {
			return _x + x;
		}
		
		public void foo(B b) {
			_x = _x * b._x;
		}
		
	}

