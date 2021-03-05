package StackAndQue;

import java.util.Scanner;

//링 버퍼 활용 - 오래된 데이터 버리기
public class LastNEIements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int N = 10;
		int[] a = new int[N]; 
		int cnt = 0; //입력 받은 개수
		int retry; 
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수: ", cnt+1);
			a[cnt++ % N] = scan.nextInt();
			
			System.out.print("계속 할까요?(예.1/아니오.0: ");
			retry = scan.nextInt();
		} while (retry == 1);
		
		int i = cnt - N;
		if(i < 0) i = 0;
		
		for(; i < cnt; i++)
			System.out.printf("%2d번째의 정수=%d\n", i + 1, a[i % N]);

	}

}
