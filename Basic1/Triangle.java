package Basic1;

import java.util.Scanner;

public class Triangle {
	/*
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	
	static void triangleLU(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int k=i; k<=n-1; k++) {
				System.out.print(" ");
				}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	
	static void triangleRU(int n) {
		for(int i=n; i>=1; i--) {
			for(int k=i; k<=n-1; k++) {
				System.out.print(" ");
				}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	*/
	static void spira(int n) {
		for(int i=0; i< n; i++) {
			for(int j=n; j > i; j--) {
				System.out.print(" ");
				}
			for(int j=0; j < (i*2+1); j++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("몇 단 삼각형입니까?");
			n = scan.nextInt();
		}while(n <= 0);
		
		//triangleLB(n);
		//System.out.println();
		//triangleLU(n);
		//System.out.println();
		//triangleRB(n);
		//System.out.println();
		//triangleRU(n);
		//System.out.println();
		spira(n);
			
		}
	}


