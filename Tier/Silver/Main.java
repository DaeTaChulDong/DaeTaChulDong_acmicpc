package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=0;
        do{
            N=scanner.nextInt();
        }while(N<1||N>1000);
        // 입력 첫번째 줄: 오늘 팔린 책의 개수N 입력받기
        scanner.nextLine(); // 버퍼 비우기

        HashMap<String, Integer> book=new HashMap<>();
        // 책의 제목 저장할 HashMap<String, Integer> book 생성

        String input;
        for(int i=0;i<N;i++){
            while(true) {
                input = scanner.nextLine();

                if(!input.isEmpty() &&input.length()<=50&&input.chars().allMatch(Character::isLowerCase)){
                    break;}
            }
            book.put(input,book.getOrDefault(input,0)+1);

        }
        // 책의 제목(Key)과 팔린 수(Value) 입력 받기(book:key-value)

        List<String> bestSeller=new ArrayList<>();
        // 가장 많이 팔린 책 목록 List<String> bestSeller 생성

        int tmp=Collections.max(book.values());
        // 가장 많이 팔린 책의 수 tmp에 저장

        for(String key:book.keySet()){
            if(book.get(key)==tmp){
                bestSeller.add(key);
            }
        }

        Collections.sort(bestSeller);
        System.out.println(bestSeller.get(0));

        // value==tmp인 keySet를 BestSeller에 저장
        // BestSeller를 사전 순으로 정렬하여 출력

        scanner.close();
        return;
    }
}