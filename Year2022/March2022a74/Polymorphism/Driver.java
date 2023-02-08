package Poly2022a74;

public class Driver {
	public static void main (String [] args)
	{
		AAA a = new AAA(5);
		BBB b = new BBB();
//		System.out.println("Question 0:");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("Question 1 :");
//		a = b;
//		System.out.println (a.equals(b));
		
//		System.out.println("Question 2 :");
//		System.out.println (b.equals(a));
		
//		AAA a2 = new BBB();
//		BBB b2 = new BBB("bbb", 2);
//		BBB b3 = new BBB();
		
//		System.out.println("Question 3:");
//		System.out.println (a2.equals(b3));
//		System.out.println (b3.equals(a2));
//		System.out.println (b2.equals(b3));
//		System.out.println (b3.equals(b));
		
		
		
		AAA a11 = new AAA(2);
		AAA a22 = new AAA(2);
		Object a33 = a11;
		
//		System.out.println (a11.equals(null));
		System.out.println (a11.equals(a22));
		System.out.println (a33.equals(a33));
		System.out.println (a22.eq(a22));
//		System.out.println (a11.eq(a33));
	}

}
