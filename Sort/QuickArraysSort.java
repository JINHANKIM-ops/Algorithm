package Sort;

import java.util.Arrays;
import java.util.Scanner;
//�迭 - �� ����
public class QuickArraysSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = scan.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i=0; i<num; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		
	}

}
