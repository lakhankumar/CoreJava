package JavaBasics;

public class PassByReference {
	public static void main(String[] args) {
		//new A();
		A a = new A();
		a.a = 10;
		//a.add(5,  6);
		incrementByOne(a);
		System.out.println(a.a);
	}

	private static int incrementByOne(A a) {
		return ++a.a;
	}
	
}

class A {
	int a;
	
	public A() {
		
	} 
	
//	public int add(int a, int b) {
//		return a + b;
//	}
}