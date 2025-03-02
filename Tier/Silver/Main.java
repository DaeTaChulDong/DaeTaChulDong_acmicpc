package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Five=0, Two=0, n=0;  // 2원짜리, 5원짜리 거슬러줄 개수 저장할 변수

        while(true){
        n=scanner.nextInt();
        if(1<=n&&n<=100000)     break;}
        // 거스름돈 액수 n 입력받기

        Five=n/5;
        while(Five>=0){
            int remain=n-Five*5;
            if(remain%2==0){
                Two=remain/2;
                System.out.println(Five+Two);
                return;
            }
            Five--;
        }
        System.out.println("-1");
    }
}