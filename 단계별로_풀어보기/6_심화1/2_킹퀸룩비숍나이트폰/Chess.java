import java.util.Arrays;
import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] Array = new int[6];
		for (int i = 0; i < 6; i++) {
			Array[i] = scanner.nextInt();
		}
		Process process = new Process();
		process.check(Array);
		
		scanner.close();
	}

}

class Process {

	Process() {
	}

	void check(int[] Array) {
		Array[0] = 1 - Array[0];
		Array[1] = 1 - Array[1];
		Array[2] = 2 - Array[2];
		Array[3] = 2 - Array[3];
		Array[4] = 2 - Array[4];
		Array[5] = 8 - Array[5];
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		return;
	}

}
