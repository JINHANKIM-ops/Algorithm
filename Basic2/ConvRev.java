package Basic2;

import java.util.Scanner;

public class ConvRev {
	//������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ
	static int ConvR(int x, int r, char[] d) {
		int digits = 0; //��ȯ ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //A=10~Z=35
		
		do {
			d[digits++] = dchar.charAt(x % r); //�������� ���ڷ� �����ͼ� �迭�� ����
			x /= r;
		} while (x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int no, cd, dno, retry; //��ȯ�ϴ� ����, ���, ��ȯ ���� �ڸ���
		char[] cno = new char[32]; //��ȯ �� �� �������� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = scan.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��? (2~36): ");
				cd = scan.nextInt();
			} while(cd < 2 || cd > 36);
			
			dno = ConvR(no, cd, cno); //��ȯ ���� �ڸ���
			
			System.out.print(cd + "�����δ� ");
			for(int i=dno -1; i>=0; i--) //���ڸ����� ���ʷ� ��Ÿ��
				System.out.print(cno[i]);
			System.out.println(" �Դϴ�.");
			
			System.out.println("�� �� �� �ұ��? (1.��/0.�ƴϿ�): ");
			retry = scan.nextInt();
			
		} while(retry == 1);
		
	}

}
