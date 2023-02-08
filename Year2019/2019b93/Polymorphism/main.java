package Poly2019b93;

public class main {

	public static void main(String[] args)
	{
		
		B b1 = new A();
		B b2 = new C();
		A a1 = (C) b2;
//		D d1 = new C();
		B b3 = new B();
//		D d2 = new A();
//		D d3 = new B();
		E e1 = new E();
//		D e2 = new E();
		B e3 = new E();
		C c1 = new C();
		
		B var1 = new A();
		C var2 = new C();
		B var3 = new E();
		B var4 = new C();
		Object var5 = new A();
		
		System.out.println("1:");
		var1.aaa();
		System.out.println("2:");
		var1.ccc();
		System.out.println("3:");
		var2.aaa();
		System.out.println("4:");
		var2.bbb();
		System.out.println("5:");
		var3.aaa();
		System.out.println("6:");
		System.out.println("Compilation Error");
//		var3.bbb();
		System.out.println("7:");
		var4.aaa();
		System.out.println("8:");
		System.out.println("Compilation Error");
//		var5.aaa();
		System.out.println("9:");
		System.out.println("Runtime Error.");
//		((C)var5).aaa();
		System.out.println("10:");
		((E)var3).bbb();
	}
}
