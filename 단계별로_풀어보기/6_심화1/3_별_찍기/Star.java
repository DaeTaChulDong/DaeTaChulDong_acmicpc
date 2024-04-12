import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		while (true) {
			input = scanner.nextInt();

			if (1 <= input && input <= 100)
				break;
			System.out.println("범위를 벗어났습니다. 다시 입력해주세요. ");
		}

		for (int i = 0; i < input; i++) {
			for (int a = 1; a < input - i; a++) 
				System.out.print(" ");
			for (int b = 0; b < 2 * i + 1; b++) 
				System.out.print("*");
			System.out.println();
		}

		for (int i = 0; i < input - 1; i++) {
			for (int a = input; a > input - i - 1; a--) 
				System.out.print(" ");
			for (int b = 0; b < (2 * input - 3 - 2 * i); b++) 
				System.out.print("*");

			System.out.println();
		}
		scanner.close();
	}
}
