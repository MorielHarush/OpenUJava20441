package Poly2;

public class Driver {

	public static void main(String [] args) {
		A y1 = new B(100);
		B y2 = new B(100);
		B y3 = new B(20);
		A z1 = new C();
		C z2 = new C();
		
		System.out.println("Question 1 : ");
//		System.out.println(y1.foo(y2));
//		System.out.println(y2.foo(y1));
		if(y1.foo(y2) == (y2.foo(y1))){
			System.out.println("***YES***");
		}else {
			System.out.println("***NO***");
		}
		System.out.println("Question 2 : ");
		if(y1.foo(y3) == (y3.foo(y1))){
			System.out.println("***YES***");				
		}else {
			System.out.println("***NO***");
		}
//		System.out.println("Question 2 : ");
//		System.out.println(y1.foo(y3));
//		System.out.println(y3.foo(y1));
//		
//		System.out.println("Question 3 : ");
//		System.out.println(y1.foo(z1));
//		System.out.println(y1.foo(z2));
//		
//		System.out.println("Question 4 : ");
//		System.out.println(y2.foo(y3));
//		
//		System.out.println("Question 5 : ");
//		System.out.println(y2.foo(z1));
//		
//		System.out.println("Question 6 : ");
//		System.out.println(y2.foo(z2));
//		
//		System.out.println("Question 7 : ");
//		System.out.println(y3.foo(z2));
//		
//		System.out.println("Question 8 : ");
//		System.out.println(z1.foo(y1));
//		System.out.println(z1.foo(y2));
//		System.out.println(z1.foo(y3));
	}
}
