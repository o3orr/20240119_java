package ex01;

class A{
	void funcA() {
		System.out.println("funA");
	}
}

class B extends A{
	void funB() {
		System.out.println("funB");
	}
}

class C extends B {
	void funC() {
		System.out.println("funC");
	}
}

public class Exam01 {
	
	static void testFunc(A a) {
		if(a instanceof C) {
			((C) a).funC();
		} else if (a instanceof B) {
			((B) a).funB();
		} else {
			a.funcA();
		}
	}

	public static void main(String[] args) {
		
		testFunc(new A());
		testFunc(new B());
		testFunc(new C());

	}

}
