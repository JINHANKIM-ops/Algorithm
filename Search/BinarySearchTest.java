package Search;

import java.util.Arrays;
import java.util.Scanner;
//Arrays.binarySearch�� ���� �˻�
public class BinarySearchTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ڼ�: ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.println("x[0]: ");
		x[0] = scan.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.println("x["+i+"]: ");
				x[i] = scan.nextInt();
			} while(x[i] < x[i-1]);	//�ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}
		
		System.out.println("�˻��� ��: ");
		int ky = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, ky); //key��� �˻�
		
		if(idx < 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");

	}

}
