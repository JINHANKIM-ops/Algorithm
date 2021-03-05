package Basic2;

import java.util.Scanner;

public class DayOfYear {
	//그 해 경과 일 수 구하기
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //윤년: 4로 나누어 떨어지는 해
	};
	
	static int isLeap(int year) { //윤년: 1, 평년: 0
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1 : 0;
	}
	//y년 m월 d일의 그 해 경과 일 수를 구함 
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=1; i < m; i++)
			days += mdays[isLeap(y)][i - 1];
		
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.println("년: "); int year = scan.nextInt();
			System.out.println("월: "); int month = scan.nextInt();
			System.out.println("일: "); int day = scan.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			
			System.out.println("한 번 더 할까요? (1.예/0.아니오): ");
			retry = scan.nextInt();
		} while (retry == 1);

	}

}
