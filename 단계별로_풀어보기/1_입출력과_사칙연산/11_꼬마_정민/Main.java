package Beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Process process = new Process();
		long A, B, C;
		A = process.input();
		B = process.input();
		C = process.input();
		System.out.println(A + B + C);

		scanner.close();
	}
}

class Process {
	
	long A;
	Process() {}

	Scanner scanner = new Scanner(System.in);

	long input() {
		while (true) {
			A = scanner.nextLong();
			if (A >= 1 && A <= 1.0e12)
				break;
		}
		return A;
	}

}
