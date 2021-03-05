package Subset;
//InSet ��뿹��
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
		
		System.out.println("���� s1�� 15�� " + (s1.contains(15) ? "����" : "������"));
		System.out.println("���� s2�� 25�� " + (s2.contains(25) ? "����" : "������"));
		System.out.println("���� s1 �� s2�� " + (s1.equalTo(s3) ? "����" : "�ٸ���"));
		System.out.println("���� s2 �� s3�� " + (s2.equalTo(s3) ? "����" : "�ٸ���"));
		
		s3.unionOf(s1, s2);
		
		System.out.println("���� s1�� s2�� �������� " + s3 + "�̴�");
	}

}
