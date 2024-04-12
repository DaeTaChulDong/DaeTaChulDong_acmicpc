import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Process process = new Process();
		String originInput = scanner.next();
		char[] input=originInput.toCharArray();
		process.check(input);

		scanner.close();
	}

	}

class Process {
	Process(){}
	
void check(char[] input) {
	for(int i=0;i<input.length/2;i++) {
		if(input[i]!=input[input.length-1-i]) {
			System.out.println("0");
		return;
	}}
	System.out.println("1");
	return;
	}
}

