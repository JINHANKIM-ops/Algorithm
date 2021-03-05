package MySelf;

import java.util.Scanner;

public class ExcluidGCD {
	
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ���.: ");
		int x = scan.nextInt();
		System.out.print("������ �Է��ϼ���.: ");
		int y = scan.nextInt();
		
		System.out.println("�ִ������� "+ gcd(x,y) + "�Դϴ�.");
		
	}

}
