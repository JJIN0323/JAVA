package com.ogiraffers.section03.branching;

public class B_continue {

    public void testContinueStatement() {
        /* 수업목표. continue 문 사용에 대한 흐름을 이해할 수 있다. */
        /* 필기.
        *   continue 문도 break 와 마찬가지로 반복문 내에서 사용한다.
        *   break 는 반복문을 종료시키지만, continue 는 중간에 멈추고 (일시정지) 다시 증감식으로 넘어가게 된다.
        *   일반적으로 if (조건식) { continue; } 처럼 사용된다.
        *   보통 반복문 내에서 특정 조건에 대한 예외를 처리 할 때 사용된다. */

        /* 목차. 1부터 100까지 사이의 '3의 배수'이면서, '4의 배수'인 값 출력. */

        for (int i =1; i < 101; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("3과 4의 공배수 : " + i);
            } else {
                continue;
            }
        }
    }

    public void testContinueExample() {
        /* 목차. 2단에서 9단까지의 구구단을 출력하는데,
        *         단, 수가 5인 경우는 출력하지 않는다. */

        for (int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                if (su == 5) {
                    continue;
                }
            }
            System.out.println();
        }
    }

    public void testExample() {
        /* 목차. 구구단 2~9단까지 출력하고,
        *          단, 각 단의 수가 짝수인 경우 생략한다. */

        for (int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        System.out.println();
        }
    }
}
