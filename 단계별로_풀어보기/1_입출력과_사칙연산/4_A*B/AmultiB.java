import java.util.Scanner;

public class AmultiB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		Process process = new Process();
		int output = process.Multi(A, B);
		System.out.println(output);
		
		scanner.close();

	}

}
class Process {
	int Multi(int A,int B) {
		int result=A*B;
		return result;
	}
}
