package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testWhileStatement() {
        /* 수업목표. while 문 단독 사용에 대한 흐름을 이해할 수 있다. */
        /* 필기.
        *   조건을 만족해야만 실행 !!!!
        *
        *   [while 문 표현식]
        *   초기식;
        *   while(조건식) {
        *       조건을 만족하는 경우 반복 할 구문;
        *       증감식;
        *   } */

        /* 목차. 1. 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 반복문 만들기. */

        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void whileExample1() {
        /* 목차. 2. Scanner 를 사용해서 문자열을 입력받아, 인덱스를 이용해 1글자 씩 출렧해보기. */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        /* 필기.
        *   charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환해주는 메서드다.
        *   length() : String 클래스에서 제공하는 메서드로, 문자열의 길이를 int 형으로 반환해준다. */

        System.out.println("---------------------- FOR 문 --------------------------");
        // 예) 안녕 -> 안 녕
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + "번째 = " + ch);
        }

        System.out.println("---------------------- WHILE 문 --------------------------");

        int i = 0; // 초기식
        while (i < str.length()) { // 조건식
            // 반복할 구문
            char ch = str.charAt(i);
            System.out.println(i + "번째 = " + ch);
            i++; // 증감식
        }
    }

    public void whileGugudan() {

        /* 필기.
        *   중첩 while 문을 사용해서 구구단을 출력하자. */

        // dan = 2~9
        // su = 1~9

        int dan = 2;

        while (dan < 10) {
            // 초기식
            int su = 1;
            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan *su));
                su++;
            }
            System.out.println(dan + " * " + su + " = " + (dan *su));
            dan++;
        }
    }

}
