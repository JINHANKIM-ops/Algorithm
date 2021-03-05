package Sort;

import java.util.Arrays;
import java.util.Scanner;
//배열 - 퀵 정렬
public class QuickArraysSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = scan.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		
	}

}
