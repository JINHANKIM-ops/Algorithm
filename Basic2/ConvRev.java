package Basic2;

import java.util.Scanner;

public class ConvRev {
	//정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
	static int ConvR(int x, int r, char[] d) {
		int digits = 0; //변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //A=10~Z=35
		
		do {
			d[digits++] = dchar.charAt(x % r); //나머지를 문자로 가져와서 배열에 넣음
			x /= r;
		} while (x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int no, cd, dno, retry; //변환하는 정수, 기수, 변환 후의 자릿수
		char[] cno = new char[32]; //변환 후 각 가지리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수: ");
				no = scan.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("어떤 진수로 변환할까요? (2~36): ");
				cd = scan.nextInt();
			} while(cd < 2 || cd > 36);
			
			dno = ConvR(no, cd, cno); //변환 후의 자릿수
			
			System.out.print(cd + "진수로는 ");
			for(int i=dno -1; i>=0; i--) //윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
			System.out.println(" 입니다.");
			
			System.out.println("한 번 더 할까요? (1.예/0.아니오): ");
			retry = scan.nextInt();
			
		} while(retry == 1);
		
	}

}
