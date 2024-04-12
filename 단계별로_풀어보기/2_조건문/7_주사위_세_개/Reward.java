import java.util.Scanner;

public class Reward {

	public static void main(String[] args) {

		Process process = new Process();
		int[] cube = process.Cube();
		process.Dupli(cube);

	}

}

class Process {

	Process() {
	}

	int[] Cube() {
		Scanner scanner = new Scanner(System.in);
		int[] Array = new int[3];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = scanner.nextInt();
			if (Array[i] < 1 || Array[i] > 6) {
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요. ");
				return Cube();
			}
		}
		return Array;
	}

	void Dupli(int[] Array) {
		int dup = 1;
		int number = 0;
		for (int i = 0; i < Array.length-1; i++) {
			if (Array[i] == Array[i + 1]) {
				dup++;
				number = i;
			}
		}

		if (dup == 3)
			System.out.println(10000 + Array[number] * 1000);
		else if (dup == 2)
			System.out.println(1000 + Array[number] * 100);
		else if(dup==1){
			int tmp = Array[0];
			for(int i=1;i<Array.length;i++) {
				if(tmp<Array[i])
					tmp=Array[i];
			}
			System.out.println(tmp * 100);
		}
		return;
	}

}
