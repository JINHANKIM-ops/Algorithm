package Subset;

public class InSet {
	private int max; //집합의 최대 개수
	private int num; //집합의 요소 개수
	private int[] set; //집합 본체
	
	//생성자
	public InSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		}
		catch (OutOfMemoryError e) { //집햅 배열 생성 실패시
			max = 0;
		}
	}
	
	//집합의 최대 개수를 반환
	public int capacity() {
		return max;
	}
	//집합의 현재 요소 개수 반환
	public int size() {
		return num;
	}
	
	//집합에서 n을 검색(index 반환)
	public int indexOf(int n) {
		for(int i=0; i<num; i++)
			if(set[i] == n)
				return i; //검색 성공
		return -1;
	}
	//집합에 n이 있는지 없는지 확인
	public boolean contains(int n) {
		return (indexOf(n) != -1)? true : false;
	}
	//집합에 n을 추가
	public boolean add(int n) {
		if(num >= max || contains(n) == true) //가득 찼거나 이미 n이 존재
			return false;
		else {
			set[num++] = n; //가장 마지막 자리에 추가
			return true;
		}
	}
	//집합에서 n을 삭제
	public boolean remove(int n) {
		int idx; //n이 저장된 index
		
		if(num <= 0 || (idx = indexOf(n)) == -1) //비어 있거나 n이 존재하지 않으면
			return false;
		else {
			set[idx] = set[--num]; //마지막 요소를 삭제한 곳으로 옮김
			return true;
		}
	}
	//집합 s에 복사
	public void copyTo(InSet s) { //s - 복사 대상
		int n = (s.max < num) ? s.max : num; //복사할 요소 개수
		for(int i=0; i<n; i++)
			s.set[i] = set[i];
		s.num = n;
	}
	//집합 s를 복사
	public void copyForm(InSet s) {
		int n = (max < s.num) ? max : s.num; //복사할 요소 개수
		for(int i=0; i<n; i++)
			set[i] = s.set[i];
		num =n;
	}
	//집합 s와 같은지 확인
	public boolean equalTo(InSet s) {
		if(num != s.num) //요소 개수가 같지 않으면
			return false; //집합도 같지 않다
		
		for(int i=0; i<num; i++) {
			int j=0;
			for(; j<s.num; j++)
				if(set[i] == s.set[j])
					break;
			if(j == s.num) //set[i]는 s에 포함되지 않는다
				return false;
		}
		return true;
	}
	//집합 s1, s2의 합집합 복사
	public void unionOf(InSet s1, InSet s2) {
		copyForm(s1); //집합 s1 복사
		for(int i=0; i<s2.num; i++) //집합 s2의 요소 추가
			add(s2.set[i]);
	}
	//'{a,b,c}'형식의 문자열로 변환
	public String toString() {
		StringBuffer temp = new StringBuffer("{");
		for(int i=0; i<num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}
}
