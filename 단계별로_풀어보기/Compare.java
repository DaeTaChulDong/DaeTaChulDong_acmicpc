import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {

		Process process = new Process();

		int A = process.input();
		int B = process.input();

		process.Compare(A, B);
	}

}

class Process {
	Scanner scanner = new Scanner(System.in);

	Process() {}

	int input() {
		int i = scanner.nextInt();
		if (i < -10000 || i > 10000) {
			System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
			return input();
		}
		return i;
	}

	void Compare(int A, int B) {
		if (A > B)
			System.out.println(">");
		else if (A < B)
			System.out.println("<");
		else
			System.out.println("==");
		return;
	}
}
