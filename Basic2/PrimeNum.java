package Basic2;

public class PrimeNum {
	//1000������ �Ҽ��� ����
	public static void main(String[] args) {
		int counter = 0; //������ Ƚ��
		int ptr = 0; //�R�� �Ҽ��� ����
		int[] prime = new int[500]; //�Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n+= 2) { //Ȧ����
			int i;
			for(i = 1; i < ptr; i++) { //�̹� ã�� �Ҽ��� ������ ��
				counter++;
				if(n % prime[i] == 0) //������ �������� �Ҽ��� �ƴ�
					break;
			}
			if(ptr == i) //���������� ������ �������� ������ 
				prime[ptr++] = n; //�迭�� ����
		}
		
		for(int i = 0; i < ptr; i++)
			System.out.println(prime[i]); //ã�� �Ҽ��� ������ ��Ÿ��
	
		System.out.println("�������� ������ Ƚ��: "+counter);
	}

}
