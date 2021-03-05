package Sort;

import java.util.Scanner;

public class MergeSort {
	static int[] buff; //�۾��� �迭
	//a[left] ~ a[right]�� ��������� ���� ���� - ���� �۾� ����
	static void __mergeSort(int[] a, int left, int right) {
		if(left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			__mergeSort(a, left, center); //�迭�� �պκ��� ���� ����
			__mergeSort(a, center + 1, right); //�迭�� �޺κ��� ���� ����
			
			for(i = left; i <= center; i++) //�迭�� �պκ� buff�� ����
				buff[p++] = a[i];
			
			while(i <= right && j < p) //�迭�� �޺κ� buff�� ����
				a[k++] = (buff[j] <= a[i])? buff[j++] : a[i++];
				
			while(j < p) //buff�� �����ִ� ��� ����
				a[k++] = buff[j++];
		}
	}
	//���� ����
	static void mergeSort(int[] a, int n) {
		buff = new int[n]; //�۾��� �迭 ����
		
		__mergeSort(a, 0, n - 1); //�迭 ��ü ���� ����
		
		buff = null; //�۾��� �迭 ����
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ����");
		System.out.print("��ڼ�: ");
		int nx = scan.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = scan.nextInt();
		}
		
		mergeSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i=0; i<nx; i++)
			System.out.println("x[" + i +"]=" + x[i]);
		
	}

}
