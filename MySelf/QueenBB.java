package MySelf;

//�� ���� 1���� ���� ��ġ�ϴ� ������ ��������� ���� - �б� ������
public class QueenBB {
	static int[] pos = new int[8]; //�� ���� ���� ��ġ
	static boolean[] flag = new boolean[8]; //�� �࿡ ���� ��ġ���� Ȯ��
	
	static void print() { //���� ��ġ�� ���
		for(int i=0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) { //���� ���� ����
		for(int j=0; j < 8; j++) {
			if(flag[j] == false) { //j�࿡�� ���� ��ġ���� �ʾҴٸ�
				pos[i] = j; //���� j�࿡ ��ġ
				if(i == 7) //��� ���� ��ġ
					print();
				else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		
		set(0); //0���� ���� ��ġ

	}

}
