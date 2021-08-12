package JavaBasics;

public class PassByValue {
	public static void main(String[] a) {
		int a1 = 10;
		a1 = incrementByOne(a1);
		System.out.println(a1);
	}

	private static int incrementByOne(int a1) {
	//	return ++a1;
		//a1 = a1 + 1;
		a1  += 1;
		return a1;
	}
}
