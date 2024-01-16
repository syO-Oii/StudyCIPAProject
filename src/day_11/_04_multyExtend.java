package day_11;

public class _04_multyExtend {
	public static void main(String[] args) {
		C c = new C();
	}
	
}

class A{
	public A() {
		System.out.println("생성자 A");
	}
}

class B extends A {
	public B() {
		super();		// super가 없어도 동일한 동작 실행
		System.out.println("생성자 B");
	}
}
class C extends B {
	public C() {
		// super(); 가 생략되어 있음, super가 없어도 동일한 동작 실행
		System.out.println("생성자 C");
	}
}
