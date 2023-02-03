package Poly3;

public class Driver {

	public static void main(String [] args) {
		System.out.println("Question 1:");
		A a = (A) new B();
//		System.out.println(a);
		
		System.out.println("Question 2:");
		A aa = new A();
//		System.out.println(aa);
		
		System.out.println("Question 3:");
		A ab = new B();
//		System.out.println(ab);
		
		System.out.println("Question 4:");
//		B ba = new A();
//		System.out.println("Comp Error");
		
		System.out.println("Question 5:");
		B bb = new B();
		System.out.println(bb);
		
//		System.out.println("Question 6:");
//		aa.yosef();
//		
//		System.out.println("Question 7:");
//		ab.yosef();
//		
//		System.out.println("Question 8:");
//		bb.yosef();
//		
//		System.out.println("Question 9:");
//		((A)aa).yosef();
		
		System.out.println("Question 10:");
		((A)bb).yosef();
		
		System.out.println("Question 11:");
//		((A)bb).superYosef();
		System.out.println("Comp Error");
		
		System.out.println("Question 12:");
		System.out.println("Runtime Error");
//		((B)aa).yosef();
		
		System.out.println("Question 13:");
		System.out.println("Runtime Error");
//		((B)aa).superYosef();
		
		System.out.println("Question 14:");
		((B)ab).superYosef();
		
		System.out.println("Question 15:");
		((B)bb).superYosef();
		
	}
}
