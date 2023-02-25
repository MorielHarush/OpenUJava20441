package Polymorphism2021b92;

public class Driver {

	public static void main(String [] args) {
		A a;
		B b;
		C c;
		
//		System.out.println("Question1 : ");
//		System.out.println("Compilation Error.");
//		a = new A();
//		a.foo(2);
		
//		System.out.println("Question2: ");
//		a= new B();
//		b = new C();
//		b.foo(a);
//		System.out.println(a._x);
		
		
//		System.out.println("Question3: ");
//		a = new C();
//		b = new C();
//		((C)b).foo(a);
//		System.out.println(a._x);
		
//		System.out.println("Question4: ");
//		C c1 = new C();
//		b = new C();
//		b.foo(c1);
//		System.out.println(b._x);
		
		
//		System.out.println("Question5: ");
//		c = new C();
//		c.foo(c);
//		System.out.println(c._x);
		
//		System.out.println("Question6: ");
//		C c1 = new C(2);
//		a = new C(3);
//		c1.foo((B)a);
//		System.out.println(a._x);
		
		System.out.println("Question7: ");
		System.out.println("Compliation Error - No Override for Object at A/B/C");
//		b = new B(2);
//		Object o =b;
//		o.foo(4);
		
		System.out.println("Question8: ");
		C c1 = new C(2);
		a = new C(3);
		c1.foo(a);
		System.out.println(a._x);
	}
}
