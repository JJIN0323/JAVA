package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        // 수업 목표. 문자열 합치기 결과를 예측해서 사용할 수 있다.

        // 세 개의 문자열 합치기
        System.out.println("============ 세 개의 문자열 합치기 ============");

        // 조건 : 정수 9, 정수 9, 문자열"9"를 가지고
        // 문제 1. 189를 만들기
        // 문제 2. 999를 만들기
        // 문제 3. 918를 만들기

        // 문제 1
        System.out.println(9+9+"9");
        // 문제 2
        System.out.println("9"+9+9);
        // 문제 3
        System.out.println("9"+(9+9));
        // 중괄호와 대괄호는 사용 불가.

        // 10과 20의 사칙연산 결과
        System.out.println("============ 보기 안좋은 10과 20의 연산 결과 ============");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("============ 보기 좋은 10과 20의 연산 결과 ============");
        System.out.println("10과 20의 합 결과 : " + (10 + 20));
        System.out.println("10과 20의 차 결과 : " + (10 - 20));
        System.out.println("10과 20의 곱 결과 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 결과 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 결과 : " + (10 % 20));


    }
}
