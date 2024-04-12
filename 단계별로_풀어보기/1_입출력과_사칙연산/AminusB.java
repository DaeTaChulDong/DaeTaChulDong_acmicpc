import java.util.Scanner;

public class AminusB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		AminusB2 process = new AminusB2();
		int output = process.Minus(A, B);
		System.out.println(output);
		
		scanner.close();

	}

}
class AminusB2 {
	int Minus(int A,int B) {
		int result=A-B;
		return result;
	}
}
