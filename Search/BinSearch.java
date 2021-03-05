package Search;

import java.util.Scanner;
//이진 검색
public class BinSearch {
	//요소수가 n인 배열a에서 key와 같은 요소를 검색
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;	//검색범위의 첫 인덱스
		int pr = n - 1;	//검색범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) /2;	//중앙 요소의 인덱스
			if(a[pc] == key)
				return pc; //검색 성공
			else if(a[pc] < key)
				pl = pc + 1; //검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; //검색 범위를 앞쪽 절반으로 좁힘
		} while(pl <= pr);
		
		return -1; //검색 실패
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = scan.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = scan.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값: ");
		int ky = scan.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		
	}

}
