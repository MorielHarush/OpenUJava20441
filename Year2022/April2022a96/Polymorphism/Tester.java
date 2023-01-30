public class Tester {

	public static void main(String [] args) {		
		System.out.println("Question 1: ");
		System.out.println("Expected : YES");
		if(y1.foo(y2) == (y2.foo(y1))){
			System.out.println("Received: YES");
		}else {
			System.out.println("Received: NO");
		}
		
		System.out.println("Question 2: ");
		System.out.println("Expected : NO");
		if(y1.foo(y3) == (y3.foo(y1))){
			System.out.println("Received: YES");
		}else {
			System.out.println("Received: NO");
		}
		
		System.out.println("Question 3: ");
		System.out.println("Expected : YES");
		if(y1.foo(z1) == (y1.foo(z2))){
			System.out.println("Received: YES");
		}else {
			System.out.println("Received: NO");
		}
		
		System.out.println("Question 4: ");
		System.out.println("Expected:");
		System.out.println("Bbfoo");
		System.out.println("False");
		System.out.println("**Received:");
		if((y2.foo(y3) == true)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println("Question 5: ");
		System.out.println("Expected:");
		System.out.println("Afoo");
		System.out.println("True");
		System.out.println("**Received:");
		if((y2.foo(z1) == false)) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		
		System.out.println("Question 6: ");
		System.out.println("Expected:");
		System.out.println("Bcfoo");
		System.out.println("False");
		System.out.println("**Received:");
		if((y2.foo(z2) == false)) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		
		System.out.println("Question 7: ");
		System.out.println("Expected:");
		System.out.println("Bcfoo");
		System.out.println("True");
		System.out.println("**Received:");
		if((y3.foo(z2) == false)) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		
		System.out.println("Question 8: ");
		System.out.println("Expected 3 TIMES !!!:");
		System.out.println("Cfoo");
		System.out.println("False");
		System.out.println("**Received:");
		if((z1.foo(y1) == false )) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		if((z1.foo(y2) == false )){
			System.out.println("False");
		}else {
			System.out.println("True");
		}
		if((z1.foo(y3) == false )){
			System.out.println("False");
		}else {
			System.out.println("True");
		}
	}
}
