package Beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int A, B;

		for (int i = 0; i < T; i++) {

			do {
				A = scanner.nextInt();
				B = scanner.nextInt();

			} while (A < 0 || A > 10 || B < 0 || B > 10);

			System.out.println(A + B);
		}
		scanner.close();
	}
}
