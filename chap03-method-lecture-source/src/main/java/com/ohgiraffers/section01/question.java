package com.ohgiraffers.section01;

public class question {
    public static void main(String[] args) {

        /*  A 여행사의 패키지는 8인 이상이 모여야 출발 확정 상태가 되고, 모이지 않으면 출발 보류 상태를 보여줍니다.
            B 여행사의 패키지는 4인 이상이 모여야 출발 확정 상태가 되고, 모이지 않으면 출발 보류 상태를 보여줍니다.
            하지만 두 여행사 패키지가 같은 날짜, 같은 장소로 가는 패키지라면
            여행사끼리 협의하여 A 패키지에 B 패키지 인원이 합쳐져서 가기도 합니다.
            8월 1일에는 두 패키지 모두 지원 인원이 0명이었으나,
            8월 10일에 A 패키지에 5인이 지원을 하였고, 8월 20일에 B 패키지에 3인이 지원을 했습니다.

            8월 18일과 8월 20일 각각, A 패키지와 B 패키지에서의 '지원 인원 / 최소 출발 인원'과 함께 '일정 확정 여부'를 출력해 주세요.
            그리고 보여지는 인원은 미달이더라도 A 패키지 인원과 B 패키지 인원의 합이 A 패키지 최소 인원 이상이라면 양쪽 모두 일정 확정으로 나오도록 출력해 주세요. */

        int A1 = 0;
        int B1 = 0;
        int sum1 = A1 + B1;

        System.out.println("8/18=====================================");

        if (A1 >= 8) {
            System.out.println("A패키지 : " + A1 + "　최소 출발 인원 8명" + "　출발 : " + "확정");
        }
        if (A1 <= 8) {
            System.out.println("A패키지 : " + A1 + "　최소 출발 인원 8명" + "　출발 : " + "보류");
        }
        if (B1 >= 4) {
            System.out.println("B패키지 : " + B1 + "　최소 출발 인원 4명" + "　출발 : " + "확정");
        }
        if (B1 <= 4) {
            System.out.println("B패키지 : " + B1 + "　최소 출발 인원 4명" + "　출발 : " + "보류");
        }

        int A10 = 5;
        int B20 = 3;

        System.out.println("8/20=====================================");

        if (A10 + B20 >= 8) {
            System.out.println("A패키지 : " + A10 + "　최소 출발 인원 8명" + "　출발 : " + "확정");
        }
        if (A10 + B20 < 8) {
            System.out.println("A패키지 : " + A10 + "　최소 출발 인원 8명" + "　출발 : " + "보류");
        }
        if (A10 + B20 >= 4) {
            System.out.println("B패키지 : " + B20 + "　최소 출발 인원 4명" + "　출발 : " + "확정");
        }
        if (A10 + B20 < 4) {
            System.out.println("B패키지 : " + B20 + "　최소 출발 인원 4명" + "　출발 : " + "보류");
        }

        /* 1000kg 수용 가능한 엘리베이터에 76kg인 사람 몇 명이 탈 수 있는가?
        같은 엘리베이터에 13명이 탄다면 평균 몸무게는? (실수로 출력) */

        int kg = 1000;
        int person = 76;

        System.out.println(kg / person + "명"); // 13명
        System.out.println((double) kg / 13 + "kg"); // 76.92~~~~~~~~


        System.out.println("----------------------------------------");

        double weight = 55.5;
        int tall = 160;

         System.out.println("정현님의 BMI는" + (weight / (tall * tall)*10000) + "입니다.");

        System.out.println("----------------------------------------");

        int sau = 6;
        int std = 67;

        System.out.println("현재 소세지 소비량 = " + sau * std);
        System.out.println("다음학생 번호는 = " + ++std);
    }
}