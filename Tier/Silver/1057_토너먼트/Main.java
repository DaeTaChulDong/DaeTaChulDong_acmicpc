package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Method method=new Method();
        int N,A,B;
        while(true){
            N=scanner.nextInt();
            A=scanner.nextInt();
            B=scanner.nextInt();
        if(N>=2&&N<=100000&&A<=N&&B<=N&&A>0&&B>0&&A!=B)
            break;
        }
        // N,A,B입력받기
        int result=1;
        int tmpresult;
        // N참가자의 수,A김지민의 번호, B임한수의 번호,result대결하는라운드번호

        while(result<=Math.log(N)/Math.log(2)){
        tmpresult=method.Check1(A,B,result);
        if(result==tmpresult){
            System.out.println(result);
            System.exit(0);
        }
        else {
            if(A%2==0) A=A/2;
            else A=A/2+1;
            if(B%2==0) B=B/2;
            else B=B/2+1;
        }
        result=tmpresult;}
        System.out.println("-1");
        // Check1 했는데 result값이 바뀌지 않았으면 프로그램 종료
    }
}