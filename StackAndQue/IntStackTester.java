package StackAndQue;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InStack s = new InStack(64);
		
		while(true) {
			System.out.println("현재 데이터의 수: "+s.size()+"/"+s.capacity());
			System.out.print("(1)Push (2)Pop (3)Peek (4)Dump (0)Exit");
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:
					System.out.println("데이터: ");
					x = scan.nextInt();
					try {
						s.push(x);
					} catch (InStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
					
				case 2:
					try {
						x = s.pop();
						System.out.println("Pop한 데이터는 "+x+"입니다.");
					} catch (InStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				case 3:
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 "+x+"입니다.");
					} catch (InStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				
				case 4:
					s.dump();
					break;
					
			}
		}

	}
}
