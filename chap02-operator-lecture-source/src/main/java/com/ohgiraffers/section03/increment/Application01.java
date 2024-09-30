package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표.  증감연산자에 대해 이해할 수 있다. */

        /* 필기.
        *       증감연산자
        *       피연산자 앞 / 뒤에 사용이 가능하다.
        *       '++'은 1 증가
        *       '--'은 1감소 */

        /* 목차. 1. 증감연산자를 단항으로만 사용 */
        /* 필기.
        *       이항으로 사용될때는 1증가 1감소의 의미*/

        int num = 20;
        System.out.println(num); //20

        num++;
        System.out.println(num); //21 ( 아래보다 나중에 계산됨. )

        ++num;
        System.out.println(num); //22 ( 위에보다 얘가 먼저 계산됨. )

        num--;
        System.out.println(num); //21

        --num;
        System.out.println(num); //20

        /* 목차. 2. 증감연산자를 다른 연산자와 함께 사용할 때 */

        /* 필기.
        *       주의사항 !
        *       ++, -- 증감연산자는 다른 연산자와 함께 사용될 때 의미가 달라진다.
        *       다른 연산자와 함께 사용할 때 증감 연산자의 의미한다.
        *       '++num' 은 피연산자의 값을 먼저 1 증가시킨 후 다른 연산 진행한다.
        *       'num++' 은 다른 연산을 먼저 진행한 후 마지막에 피연산자 값을 1 증가시킨다. */

        int firstNum = 20;
        int result1 = firstNum++ * 3;

        System.out.println("결과" + result1); // 60 ( 곱하기 먼저 계산되므로 답은 60이다. )
        System.out.println("숫자" + firstNum); // 21 ( 위에 결과값에 1을 더해줌으로 21이다. )

        int secondNum = 20;
        int result2 = ++secondNum * 3;

        System.out.println("결과" + result2); // 63 ( 1을 더한 후, 곱하기가 되므로 63이다. )
        System.out.println("숫자" + secondNum); // 21 ( result2에서 1을 더해줌으로 21이다. )

    }
}
