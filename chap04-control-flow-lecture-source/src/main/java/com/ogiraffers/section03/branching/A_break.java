package com.ogiraffers.section03.branching;

public class A_break {

    public void testBreakStatement() {

        /* 수업목표. break 에 대해 이해할 수 있다. */
        /* 필기.
        *   break 는 반복문 내에서 사용하게 된다.
        *   break 는 반복문을 빠져 나올 때 사용하게 되며,
        *   반복문의 조건문 판단 결과와 상관 없이 반복문을 탈출하기 위해 사용된다.
        *   일반적으로 if (조건식) { break; } 처럼 사용이 된다.
        *   단, switch 문은 반복문이 아니지만 예외적으로 사용이 된다. */

     /* 목차. 1부터 100까지의 합계를 구할건데, 조건절을 무한루프로 만들어보자. */

    int sum = 0;

    int i = 1;
    // 조건절에 true 를 넣어 반복문이 무한하게 돌게 만들었다.
    while (true) {
         sum += i;
         if (i == 100) { // i 가 100이되는 순간 멈춤.
             break; // 를 만나는순간 while 에서 빠져 나온다.
         }
         i++;
    }
        System.out.println("1부터 100까지의 합은 : " + sum + "입니다.");
    }

    public void breakGugudan() {
        /* 목차. 구구단 2~9단까지 출력
        *        단, 각 단의 수가 5보다 큰 경우에는 출력을 생략한다.
        *       예) 2*1 ~ 2*5 끝! */

        for (int dan = 2; dan < 10; dan++) {
            /* 필기.
            *   break 문은 모든 반복문을 종료시키는게 아닌,
            *   자신에게 가장 인접한 반복문을 종료시킨다. */
            for (int su = 1; su < 10; su++) {

                if (su > 5) {
                    break; // 가장 근접한 반복문 1개만 탈출가능.
                }

                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
}
