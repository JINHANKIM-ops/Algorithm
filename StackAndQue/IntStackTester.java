package StackAndQue;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InStack s = new InStack(64);
		
		while(true) {
			System.out.println("���� �������� ��: "+s.size()+"/"+s.capacity());
			System.out.print("(1)Push (2)Pop (3)Peek (4)Dump (0)Exit");
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:
					System.out.println("������: ");
					x = scan.nextInt();
					try {
						s.push(x);
					} catch (InStack.OverflowIntStackException e) {
						System.out.println("������ ���� á���ϴ�.");
					}
					break;
					
				case 2:
					try {
						x = s.pop();
						System.out.println("Pop�� �����ʹ� "+x+"�Դϴ�.");
					} catch (InStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
					
				case 3:
					try {
						x = s.peek();
						System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�.");
					} catch (InStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
				
				case 4:
					s.dump();
					break;
					
			}
		}

	}
}
