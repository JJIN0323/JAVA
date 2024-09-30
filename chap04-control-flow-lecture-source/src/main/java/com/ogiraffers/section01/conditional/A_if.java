package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    /* 필기.
     *   조건식  : true or false 가 나오(는 연사식을 조건식이라고 한다.
     *   if 문은 조건식의 결고 값이 참(true) 이면 {} 안에  */

    /* 목차. 1. 문제
    *   정수 한개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수 입니다"
    *   라고 출력하고, 짝수가 아니면 출력하지 않는 구문을 작성 할 것이다.
    *   단, 조건과 상관 없이 프로그램이 종료될 때, "프로그램을 종료합니다" 라고 출력하도록 해보자. */

    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나를 입력 하세요 : ");
        int num = sc.nextInt();

        /* 목차. 2. 조건 생각해보기. = 짝수는 어떠한 수를 2로 나누었을 때 나머지가 0이면 짝수다 */
        if (num % 2 == 0 ) {
            System.out.println("입력하신 숫자는 짝수 !");
        }
        else {
            System.out.println("입력하신 숫자는 홀수 !");
        }
        System.out.println("프로그램 종료.");
    }

    public void testNestedIfStatement() {

        Scanner sc = new Scanner(System.in);
        /* 목차. 3. 문제
        *   정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
        *   짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 를 출력하고,
        *   둘 중 하나라도 해당하지 안으면 아무 내용도 출력하지 않는구문을 작성해보자.
        *   단, 조건과 상과 없이 프로그램이 종료 될 때, 프로그램이 종료되었습니다. 출력하기 */

        System.out.print("숫자를 한 개 입력해주세요 : ");
        int num = sc.nextInt();

        if (num > 0 ){
            if (num % 2 == 0) {
                //  입력한 숫자가 양수 일 때.
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
            System.out.println("프로그램을 종료합니다.");
        }

    }

}