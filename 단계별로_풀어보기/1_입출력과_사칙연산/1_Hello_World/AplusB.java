import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        Process process = new Process();
        
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int output = process.Add(A, B);
		System.out.println(output);
		
		scanner.close();
	}}
	class Process {
	int Add(int A,int B) {
		int result=A+B;
		return result;
	}
}

