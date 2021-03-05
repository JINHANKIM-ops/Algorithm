package Search;

import java.util.Arrays;
import java.util.Scanner;
//Arrays.binarySearch로 이진 검색
public class BinarySearchTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.println("x[0]: ");
		x[0] = scan.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.println("x["+i+"]: ");
				x[i] = scan.nextInt();
			} while(x[i] < x[i-1]);	//바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.println("검색할 값: ");
		int ky = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, ky); //key요소 검색
		
		if(idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");

	}

}
