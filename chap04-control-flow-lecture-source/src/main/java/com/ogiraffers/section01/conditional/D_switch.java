package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {


    /* 필기.
     *   [표현식]
     *   switch(비교 할 변수)
     *       case 비교값 1 : 비교값 1과 일치하는 경우 실행구문: break;
     *       case 비교값 2 : 비교값 2과 일치하는 경우 실행구문: break;
     *       default : case 에 모두 해당하지 않는 경우 실행구문:  break; */

    /*  필기.
     *   여러개의 비교 값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
     *   if-else-if 구문과 유사하다.
     *   하지만 switch 문으로 비교가 가능한 값은 정수, 문자, 문자열 형태의 값이다.
     *   실수와 논리는 비교할 수 없다. ★중요★
     *   또한, 정확하게 일치하는 경우만 비교할 수 있으며
     *   대소비교를 할 수 없다는게 차이점이다.
     *   case 절에는 변수를 사용 할 수 없다. (즉, 값만 비교 가능하다.) */

    /* 목차. 1. 문제
     *   정수 두개와 연산 기호 문자를 입력 받아
     *   두 숫자의 연산 결과를 출력해보는 계산기 만들어보기. */

    public void testSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 점수를 입력해 주세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 점수를 입력해 주세요 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력 ( + - */ %) : ");

        // 문자열을 charAt(인덱스)로 문자로 만들기
        char op = sc.next().charAt(0);
        // 입력한 연산 기호 문자에 따라서 연산 결과를 다르게 만들어보기.

        int result = 0;

        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }
    }

    public void testSwitchVendingMachine() {
        System.out.println("음료 자판기");
        System.out.println("s m n c h k");
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("음료 골라 : ");

        String selectDrink = sc.nextLine();

        int price = 0; // 투입 가격을 위한 변수

//        switch (selectDrink) {
//            case "s":
//                // 사이다
//                System.out.println("사이다 골랐");
//                price = 500;
//            case "m":
//                //  맥콜
//                System.out.println("맥콜 골랐");
//                price = 500;
//            case "n":
//                // 솔의눈
//                System.out.println("솔의눈 골랐");
//                price = 500;
//            case "c":
//                // 콜라
//                System.out.println("콜라 골랐");
//                price = 500;
//            case "h":
//                // 환타
//                System.out.println("환타 골랐");
//                price = 500;
//            case "k":
//                // 밀키스
//                System.out.println("밀키스 골랐");
//                price = 500;
//        }
//        System.out.println(price + "원을 투입해주세여 ~");

        System.out.println("------------------------------");
        System.out.println("자판기 개선해야겠다");
        System.out.println("------------------------------");

        String orderMenu = "";

        switch (selectDrink) {
            case "s":
                // 사이다
                orderMenu = "사이다";
                price = 500;
            case "m":
                //  맥콜
                orderMenu = "맥콜";
                price = 500;
                break;
            case "n":
                // 솔의눈
                orderMenu = "솔의눈";
                price = 500;
                break;
            case "c":
                // 콜라
                orderMenu = "콜라";
                price = 500;
                break;
            case "h":
                // 환타
                orderMenu = "환타";
                price = 500;
                break;
            case "k":
                // 밀키스
                orderMenu = "밀키스";
                price = 500;
                break;
            default:
                System.out.println("아무것도 선택되지 않았습니다.");
                break;
        }

        System.out.println(orderMenu + "를 고르셨고, 가격은 " + price + "입니다");
    }
}

