import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {

		Process process = new Process();
		int input = process.Score();

		if (input >= 90)
			System.out.println("A");
		else if (input >= 80)
			System.out.println("B");
		else if (input >= 70)
			System.out.println("C");
		else if (input >= 60)
			System.out.println("D");
		else
			System.out.println("F");

	}

}

class Process {
	int Score() {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input < 0 || input > 100)
			return Score();
		return input;
	}
}
