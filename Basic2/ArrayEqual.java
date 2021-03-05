package Basic2;

import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		for(int i=0; i<a.length; i++)
			if(a[i] != b[i])
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�迭a�� ��Ҽ�: ");
		int na = scan.nextInt();
		
		int[] a = new int[na];
		
		for(int i=0; i<na; i++) {
			System.out.println("a["+i+"]: ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("�迭b�� ��Ҽ�: ");
		int nb = scan.nextInt();
		
		int[] b = new int[na];
		
		for(int i=0; i<na; i++) {
			System.out.println("b["+i+"]: ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("�迭 a��b�� "+(equals(a,b)?"�����ϴ�.":"���� �ʽ��ϴ�."));
	
	}
}
