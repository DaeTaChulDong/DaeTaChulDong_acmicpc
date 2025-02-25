package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        while(true){
            K=scanner.nextInt();
            if(1<=K&&K<=1000000)
                break;
        }
        // K값 입력받기

        int size = 0;
        while ((1 << size) < K) {
            size++;
        }
        // 사야 하는 가장 작은 초콜릿의 크기 size 구하기

        // K의 가장 작은 1이 있는 위치 찾기
        int lowestBit = Integer.lowestOneBit(K);
        int tmp = Integer.numberOfTrailingZeros(lowestBit);

        int n=size-tmp;
        // size-n==tmp인 n 구하기

        System.out.println((1 << size)+" "+n);
    }
}