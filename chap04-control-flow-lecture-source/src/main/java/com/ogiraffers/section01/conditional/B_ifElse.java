package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public static void main(String[] args) {

        /* 목차. 1. if-else,문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 필기.
         *   [,if-else 문 표현식]
         *   if(조건식) {
         *   조건이 true 일 때 실행 할 구문; }
         *   else {
         *   조건이 false 일 때 실행 할 구문; }
         *
         *   if 문은 조건식의 결과가 참(true) 이면, if{ } 내부의 코드 실행,
         *   else 문은 조건식의 결과가 거짓(false)이면 else {} 내부의 코드 실행 */

        /* 목차. 2. 문제
         *   정수 한 개를 입력 받아 그 수가 홀수 이면, "입력하신 숫자는 홀수입니다." 출력하고,
         *   홀수가 아니면, "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 만들ㅇ보자.
         *   단, 조건과 상관 없이 프로그램이 종료 될 때 "프로그램을 종료합니다" 라고 출력되도록 해보자. */
    }

     public void testIfElseStatement() {
         Scanner sc = new Scanner(System.in);

         System.out.print("숫자 하나를 입력 하세요 : ");
         int num = sc.nextInt();

         if (num % 2 != 0) {
             System.out.println("입력하신 숫자는 홀수입니다");
         } else {
             System.out.println("입력하신 숫자는 짝수입니다");
         }
         System.out.println("프로그램을 종료합니다");
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나를 입력 하세요 : ");
        int num = sc.nextInt();

        /* 목차. 3. 문제
        *   숫자 하나를 입력 받아 양수이면, 입력하신 숫자는 양수입니다. 를 출력하고
        * 음수이면 입력하신 숫자는 음수입ㄷ니다. 출력
        * 단, 0 입력하신 숫자는 0입니다. 출력
        * 조건과 상관없이 프로그램이 종료 될 때 프로그램을 종료합니다.를 출력하는 프로그램을 만들자. */

        if (num >0) {
            System.out.println("입력하신 숫자는 양수입니다");
        } else if (num < 0) {
            System.out.println("입력하신 숫자는 음수입니다");
        } else {
            System.out.println("입력하신 숫자는 0 입니다.");
        }
        System.out.println("프로그램을 종료합니다");
    }
}
