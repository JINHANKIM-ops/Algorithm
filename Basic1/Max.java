package Basic1;

import java.util.Scanner;

public class Max {
	
	static int max3(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	static int mid3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		
		System.out.println("�ִ밪�� " + max3(3,5,1,6) + "�Դϴ�.");
		System.out.println("�߾Ӱ��� " + mid3(3,6,1) + "�Դϴ�." );
		
	}

}
