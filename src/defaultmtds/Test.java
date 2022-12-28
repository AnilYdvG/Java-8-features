package defaultmtds;

interface Interf {
	void m1();

	void m2();

	default public void m3() {
		System.out.println("Default method");
	}

	public static void m4() {
		System.out.println("Hello Interface");
	}
}

public class Test implements Interf {

	public static void main(String[] args) {

		Test t = new Test();
		t.m1();
		t.m2();
		Interf.m4();
	}

	@Override

	public void m3() {
		System.out.println("Implemented default mtd");
	}

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}
}
