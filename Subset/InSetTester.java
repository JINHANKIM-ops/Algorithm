package Subset;
//InSet 사용예시
public class InSetTester {

	public static void main(String[] args) {
		InSet s1 = new InSet(20);
		InSet s2 = new InSet(20);
		InSet s3 = new InSet(20);
		
		s1.add(10);
		s1.add(15);
		s1.add(20);
		s1.add(25);
		
		s1.copyTo(s2);
		
		s2.add(12);
		s2.remove(25);
		
		s3.copyForm(s2);
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		System.out.println("집합 s1에 15는 " + (s1.contains(15) ? "포함" : "미포함"));
		System.out.println("집합 s2에 25는 " + (s2.contains(25) ? "포함" : "미포함"));
		System.out.println("집합 s1 과 s2는 " + (s1.equalTo(s3) ? "같다" : "다르다"));
		System.out.println("집합 s2 과 s3는 " + (s2.equalTo(s3) ? "같다" : "다르다"));
		
		s3.unionOf(s1, s2);
		
		System.out.println("집합 s1과 s2의 합집합은 " + s3 + "이다");
	}

}
