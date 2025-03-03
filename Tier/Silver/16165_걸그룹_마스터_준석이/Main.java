package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 0, M = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                M = scanner.nextInt();
                if (0 < N && N < 100 && 0 < M && M < 100) {
                    scanner.nextLine();
                    break;
                }
            }
            scanner.nextLine();
        }
        // 입력받을 걸그룹의 수N, 맞혀야 하는 문제의 수M 입력받기
        //버퍼 비우기

        List<Method> methods = new ArrayList<>();

        for (int m = 0; m < N; m++) {
            String name;
            while (true) {
                name = scanner.nextLine();
                if (0 < name.length() && name.length() <= 100 && name.chars().allMatch(Character::isLowerCase))
                    break;
            }
            // 팀명, 인원수 입력받기
            scanner.nextLine();// 버퍼 비우기

            // 팀명 → 멤버들 저장 (자동 정렬)
            Map<String, TreeSet<String>> groupToMembers = new HashMap<>();
            // 멤버명 → 팀명 저장 (빠른 검색)
            Map<String, String> memberToGroup = new HashMap<>();

            // N개의 걸그룹 정보 입력
            for (int i = 0; i < N; i++) {
                String groupName = scanner.nextLine(); // 팀명 입력
                int person = scanner.nextInt(); // 인원 수 입력
                scanner.nextLine(); // 개행 문자 처리

                TreeSet<String> members = new TreeSet<>();
                for (int j = 0; j < person; j++) {
                    String memberName = scanner.nextLine(); // 멤버명 입력
                    members.add(memberName);
                    memberToGroup.put(memberName, groupName); // 멤버 → 팀 저장
                }
                groupToMembers.put(groupName, members);
            }

            // M개의 문제 해결
            for (int i = 0; i < M; i++) {
                String query = scanner.nextLine(); // 퀴즈 대상 (팀명 or 멤버명)
                int queryType = scanner.nextInt(); // 문제 유형 (0: 팀의 멤버 출력, 1: 멤버의 팀 출력)
                scanner.nextLine(); // 개행 문자 처리

                if (queryType == 0) {
                    // 팀명으로 멤버 출력 (사전순)
                    TreeSet<String> members = groupToMembers.get(query);
                    for (String member : members) {
                        System.out.println(member);
                    }
                } else if (queryType == 1) {
                    // 멤버명으로 팀명 출력
                    System.out.println(memberToGroup.get(query));
                }
            }

        }
}}
