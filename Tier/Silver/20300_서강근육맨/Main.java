package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            n = scanner.nextInt();
            if (1 <= n && n <= 10000) break;
        }
        scanner.nextLine();
        long value=0;
        List<Long> t = new ArrayList<>();
        int test = 0;
        while (test < n) {
            String[] input = scanner.nextLine().split(" ");
            for (String s : input) {
                value = Long.parseLong(s);
                if (0 <= value && value <= Math.pow(10, 18)) {  // 범위 체크
                    t.add(value);
                    test++;
                    if (test == n) break;
                    }
                }}


        // 운동기구의 개수N, 각 운동기구당 코스트 t[n] 입력받기

        Collections.sort(t);

        long result = 0;
        if (n % 2 == 1) {
            long bigCost = t.remove(n - 1);
            n--;

            for (int i = 0; i < n / 2; i++) {
                result = Math.max(result, t.get(i) + t.get(n - i - 1));
            }
            result = Math.max(result, bigCost);
        } else {
            for (int i = 0; i < n / 2; i++) {
                result = Math.max(result, t.get(i) + t.get(n - 1 - i));
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
