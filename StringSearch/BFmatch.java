package StringSearch;

import java.util.Scanner;

public class BFmatch {
	
	// ���Ʈ-���������� ���ڿ��� �˻��ϴ� �޼���
		static int bfMatch(String txt, String pat) {
			int pt = 0;		// txt Ŀ��
			int pp = 0;		// pat Ŀ��

			while(pt != txt.length() && pp != pat.length()) {

				// ���� �� ������ ù ��° ���ڰ� �������
				if(txt.charAt(pt) == pat.charAt(pp)) {
					pt ++;
					pp ++;
				}
				else {
					pt = pt - pp + 1;	// ���� 1ĭ �ڷ� �ű�
					pp = 0;
				}
			}

			if(pp == pat.length())	// �˻� ����
				return pt - pp;
			return -1;				// �˻� ����
		}


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("�ؽ�Ʈ: ");
			String s1 = scan.next();	// �ؽ�Ʈ�� ���ڿ�
			
			System.out.print("����: ");
			String s2 = scan.next();	// ���Ͽ� ���ڿ�
			int idx = bfMatch(s1, s2);	// ���ڿ� s1���� ���ڿ� s2 �˻�
			
			if(idx == -1)
				System.out.println("�ؽ�Ʈ�� ������ �����ϴ�. �˻� ����");
			else {
				// ��ġ�ϴ� ���� �ٷ� �ձ����� ���̸� ���մϴ�.
				int len = 0;
				for(int i=0; i<idx; i++)
					len += s1.substring(i, i+1).getBytes().length;
				len += s2.length();
				
				System.out.println((idx+1) + "��° ���ں��� ��ġ�մϴ�.");
				System.out.println("�ؽ�Ʈ: " + s1);
				System.out.printf(String.format("����: %%%ds\n", len), s2);
			}
			scan.close();
		}
	

}
