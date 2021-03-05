package MySelf;

//�� ���� 1���� ���� ��ġ�ϴ� ������ ��������� ���� - �б� ������
public class EightQueen {
	static int[] pos = new int[8]; //�� ���� ���� ��ġ
	static boolean[] flag_a = new boolean[8]; //�� �࿡ ���� ��ġ���� Ȯ��
	static boolean[] flag_b = new boolean[15]; //'/'�� ���⿡ ���� ��ġ���� Ȯ��
	static boolean[] flag_c = new boolean[15]; // '\'�� ���⿡ ���� ��ġ���� Ȯ��
	
	static void print() { //���� ��ġ�� ���
		for(int i=0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) { //���� ���� ����
		for(int j=0; j < 8; j++) {
			if(flag_a[j] == false &&  //j�࿡�� ���� ��ġ���� �ʾҴٸ�
					flag_b[i +j] == false && //'/'�� ���� ��ġ���� �ʾҴٸ�
					flag_c[i- j + 7] == false) { // '\'�� ���� ��ġ ���� �ʾҴٸ�
				pos[i] = j; //���� j�࿡ ��ġ
				if(i == 7) //��� ���� ��ġ
					print();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		
		set(0); //0���� ���� ��ġ

	}

}
