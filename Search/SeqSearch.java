package Search;

import java.util.Scanner;

//선형검색
public class SeqSearch {
	
	static int seqSearch(int[] a, int n, int key) {
		
		int i = 0;
		
		a[n] = key; //보초를 추가
		
		while(true) {
			if(a[i]==key) //검색 성공 - 종료조건1
				break;
			i++;
		}
		return i == n ? -1 : i; //종료조건2
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]: ");
			x[i] = scan.nextInt();
		}
		
		System.out.println("검색할 값: "); //카 값을 입력
		int ky = scan.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");

	}

}
