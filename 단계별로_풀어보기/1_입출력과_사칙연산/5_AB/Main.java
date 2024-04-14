package Beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int A,B;
		while(true) {
			A=scanner.nextInt();
			if(A>0&&A<10)
				break;
		}
		while(true) {
			B=scanner.nextInt();
			if(B<10&&B>0)
				break;
		}
	
		System.out.printf("%.9f",((double)A/B));
		// float로 할 시 소수점9번째 자리까지 정확하게 표현할 수 없으므로 double을 사용해야 한다
		scanner.close();
	}
}
	
