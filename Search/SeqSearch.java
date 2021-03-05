package Search;

import java.util.Scanner;

//�����˻�
public class SeqSearch {
	
	static int seqSearch(int[] a, int n, int key) {
		
		int i = 0;
		
		a[n] = key; //���ʸ� �߰�
		
		while(true) {
			if(a[i]==key) //�˻� ���� - ��������1
				break;
			i++;
		}
		return i == n ? -1 : i; //��������2
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ڼ�: ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]: ");
			x[i] = scan.nextInt();
		}
		
		System.out.println("�˻��� ��: "); //ī ���� �Է�
		int ky = scan.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");

	}

}
