package MySelf;

//각 열에 1개의 퀸을 배치하는 조합을 재귀적으론 나열 - 분기 한정법
public class EightQueen {
	static int[] pos = new int[8]; //각 열의 퀸의 위치
	static boolean[] flag_a = new boolean[8]; //각 행에 퀸의 배치유무 확인
	static boolean[] flag_b = new boolean[15]; //'/'선 방향에 퀸의 배치유무 확인
	static boolean[] flag_c = new boolean[15]; // '\'선 방향에 퀸의 배치유무 확인
	
	static void print() { //퀸을 위치를 출력
		for(int i=0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) { //열에 퀸을 놓기
		for(int j=0; j < 8; j++) {
			if(flag_a[j] == false &&  //j행에는 퀸을 배치하지 않았다면
					flag_b[i +j] == false && //'/'에 퀸을 배치하지 않았다면
					flag_c[i- j + 7] == false) { // '\'에 퀸을 배치 하지 않았다면
				pos[i] = j; //퀸을 j행에 배치
				if(i == 7) //모든 열에 배치
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
		
		set(0); //0열에 퀸을 배치

	}

}
