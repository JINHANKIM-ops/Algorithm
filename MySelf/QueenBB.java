package MySelf;

//각 열에 1개의 퀸을 배치하는 조합을 재귀적으론 나열 - 분기 한정법
public class QueenBB {
	static int[] pos = new int[8]; //각 열의 퀸의 위치
	static boolean[] flag = new boolean[8]; //각 행에 퀸의 배치유무 확인
	
	static void print() { //퀸을 위치를 출력
		for(int i=0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) { //열에 퀸을 놓기
		for(int j=0; j < 8; j++) {
			if(flag[j] == false) { //j행에는 퀸을 배치하지 않았다면
				pos[i] = j; //퀸을 j행에 배치
				if(i == 7) //모든 열에 배치
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
		
		set(0); //0열에 퀸을 배치

	}

}
