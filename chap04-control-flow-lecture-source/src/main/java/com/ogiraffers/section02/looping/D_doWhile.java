package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    public void testDoWhileStatement() {
        /* 수업목표. do-while 문 단독 사용에 대해 이해할 수 있다. */
        /* 필기.
        *   조건을 만족하지 않아도 최초 1번은 무조건 실행 !!!
        *
        *   [do-while 문 표현식]
        *   초기식;
        *   do {
        *       1회차에는 무조건 실행하고, 이후에는 조건식을 확인해서
        *       조건을 만족하는 경우에만 반복 할 구문;
        *       증감식;
        *   } while (조건식) */

        do {
            System.out.println("최초 한번은 무조건 동작.");
        } while (false); // -> while 조건이 true 이면 아래까지 못 가서 빨간 불 뜸.

        System.out.println("반복문 종료 확인.");
    }

    public void doWhileExample() {
        /* 수업목표. Scanner 로 문자열을 입력(도 반복) 받아 반복적으로 출력해보기.
        *              단, exit 가 입력되면 반복문을 종료한다. */

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("문자열을 입력해주세요 : ");
            str = sc.nextLine();
            System.out.println("입력값 = " + str);
            /* 필기.
            *   문자열은 == 비교가 불가능하다. Why? 주소가 달라서.
            *   그러면, 어떻게 비교할까?
            *   equals() : 문자열이 같은지를 비교해주는 메서드 */
        } while (!str.equals("exit")); // 반복문을 수행할 문장. exit != exit 를 같지 않냐고 물었을 때, false 이므로 종료됨.

        System.out.println("프로그램을 종료합니다.");
    }

}
