package StringSearch;

import java.util.Scanner;

public class IndexOfTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ: ");
		String s1 = scan.next();	// �ؽ�Ʈ�� ���ڿ�
		
		System.out.print("����: ");
		String s2 = scan.next();	// ���Ͽ� ���ڿ�
		
		int idx1 = s1.indexOf(s2);		// indexOf: ã���� �ϴ� ���ڿ��� ��ġ ��ȯ
		int idx2 = s1.lastIndexOf(s2);	// lastIndexOf: ã���� �ϴ� ���ڿ��� ������ ��ġ ��ȯ
		
		if(idx1 == -1)
			System.out.println("�ؽ�Ʈ �ȿ� ������ �����ϴ�. �˻�����");
		else {
			System.out.println("���� �տ� �ִ� �ε����� ����: " + idx1);
			System.out.println("���� �������� �ִ� �ε����� ����: " + idx2);
		}
		
		scan.close();


	}

}
