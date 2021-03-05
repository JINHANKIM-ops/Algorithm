package Subset;
//toString 메서드의 오버라이드 차이점 확인
class A {
	
}

class B {
	int x;
	//생성자
	B(int x) { this.x = x; }
	//toString를 오버라이드
	public String toString() {
		return "B[" + x + "]";
	}
}

public class ToStringTester{
	public static void main(String[] args) {
		ToStringTester a1 = new ToStringTester();
		ToStringTester a2 = new ToStringTester();
		B b1 = new B(18);
		B b2 = new B(55);
		
		System.out.println("a1 = " + a1.toString());
		System.out.println("a2 = " + a2);
		System.out.println("b1 = " + b1.toString());
		System.out.println("b2 = " + b2);
	}
}
