package Beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int A,B;
		while(true) {
			A=scanner.nextInt();
			if(A>0&&A<10)
				break;
		}
		while(true) {
			B=scanner.nextInt();
			if(B<10&&B>0)
				break;
		}
	
		System.out.printf("%.9f",((double)A/B));
		
		scanner.close();
	}
}
	