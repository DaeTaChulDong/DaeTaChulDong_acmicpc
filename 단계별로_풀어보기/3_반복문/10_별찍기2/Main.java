package Beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N;
		do {
			N=scanner.nextInt();
		}while(N<1||N>100);
		
		for(int i=0;i<N;i++) {
			for(int k=0;k<N-1-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		
		scanner.close();
	}
}
