package Subset;

public class InSet {
	private int max; //������ �ִ� ����
	private int num; //������ ��� ����
	private int[] set; //���� ��ü
	
	//������
	public InSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		}
		catch (OutOfMemoryError e) { //���� �迭 ���� ���н�
			max = 0;
		}
	}
	
	//������ �ִ� ������ ��ȯ
	public int capacity() {
		return max;
	}
	//������ ���� ��� ���� ��ȯ
	public int size() {
		return num;
	}
	
	//���տ��� n�� �˻�(index ��ȯ)
	public int indexOf(int n) {
		for(int i=0; i<num; i++)
			if(set[i] == n)
				return i; //�˻� ����
		return -1;
	}
	//���տ� n�� �ִ��� ������ Ȯ��
	public boolean contains(int n) {
		return (indexOf(n) != -1)? true : false;
	}
	//���տ� n�� �߰�
	public boolean add(int n) {
		if(num >= max || contains(n) == true) //���� á�ų� �̹� n�� ����
			return false;
		else {
			set[num++] = n; //���� ������ �ڸ��� �߰�
			return true;
		}
	}
	//���տ��� n�� ����
	public boolean remove(int n) {
		int idx; //n�� ����� index
		
		if(num <= 0 || (idx = indexOf(n)) == -1) //��� �ְų� n�� �������� ������
			return false;
		else {
			set[idx] = set[--num]; //������ ��Ҹ� ������ ������ �ű�
			return true;
		}
	}
	//���� s�� ����
	public void copyTo(InSet s) { //s - ���� ���
		int n = (s.max < num) ? s.max : num; //������ ��� ����
		for(int i=0; i<n; i++)
			s.set[i] = set[i];
		s.num = n;
	}
	//���� s�� ����
	public void copyForm(InSet s) {
		int n = (max < s.num) ? max : s.num; //������ ��� ����
		for(int i=0; i<n; i++)
			set[i] = s.set[i];
		num =n;
	}
	//���� s�� ������ Ȯ��
	public boolean equalTo(InSet s) {
		if(num != s.num) //��� ������ ���� ������
			return false; //���յ� ���� �ʴ�
		
		for(int i=0; i<num; i++) {
			int j=0;
			for(; j<s.num; j++)
				if(set[i] == s.set[j])
					break;
			if(j == s.num) //set[i]�� s�� ���Ե��� �ʴ´�
				return false;
		}
		return true;
	}
	//���� s1, s2�� ������ ����
	public void unionOf(InSet s1, InSet s2) {
		copyForm(s1); //���� s1 ����
		for(int i=0; i<s2.num; i++) //���� s2�� ��� �߰�
			add(s2.set[i]);
	}
	//'{a,b,c}'������ ���ڿ��� ��ȯ
	public String toString() {
		StringBuffer temp = new StringBuffer("{");
		for(int i=0; i<num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}
}
