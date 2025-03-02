package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n; //물건 값
        while(true){
            n=scanner.nextInt();
            if(1<=n&&n<1000)    break;
        }
        // 물건 값 입력받음

        int money=1000-n;
        // money==잔돈

        int result=0;
        int[] coin={500,100,50,10,5,1};

        for(int i=0;i<coin.length;i++){
            result+=money/coin[i];
            money-=money/coin[i]*coin[i];
        }

        System.out.println(result);
    }
}