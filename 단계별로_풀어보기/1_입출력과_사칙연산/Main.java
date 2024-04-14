package Beakjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Process process=new Process();
		int First=process.input();
		int Second=process.input();
		
		int SecondArray[]={Second%10,Second%100/10,Second/100};
		
		for(int i=0;i<3;i++) {
		System.out.println(First*SecondArray[i]);
		}
		System.out.println(First*Second);
	

}}

class Process{
	Scanner scanner=new Scanner(System.in);
	int input;
	
	Process(){}
	
	int input() {
		input=scanner.nextInt();
		if(input<100||input>999) {
			System.out.println("범위를 초과했습니다. 다시 입력해주세요.");
			return input();
		}
		return input;
	}
}