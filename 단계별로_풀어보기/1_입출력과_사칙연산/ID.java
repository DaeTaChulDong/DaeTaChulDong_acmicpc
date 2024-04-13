package Package1;

import java.util.Arrays;
import java.util.Scanner;

public class ID {

	public static void main(String[] args) {
		
		Process process = new Process();
		char[] inputArray = process.input();
		for(int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i]);
		}
		System.out.println("??!");

	}

}

class Process {
	Scanner scanner = new Scanner(System.in);

	Process() {
	}

	char[] input() {
		String input = scanner.next();
		char[] inputArray = input.toCharArray();
		if (inputArray.length > 50) {
			System.out.println("길이를 초과했습니다. 다시 입력해주세요.");
			return input();
		}
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < 'a' || inputArray[i] > 'z') {
				System.out.println("알파벳 소문자로만 다시 입력해주세요. ");
				return input();
			}
		}

		return inputArray;
	}

}