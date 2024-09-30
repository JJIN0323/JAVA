package com.ohgiraffers.section02.assginment;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 대입연산자와 산술 복합 대입 연산자를 이해할 수 있다. */

        /* 필기.
        *       = : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입한다.
        *       += : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에게 대입한다.
        *       -= , *= , /= , %=
        *        */

        int num = 12;

        System.out.println(num += 3);
        System.out.println(num -= 3);
        System.out.println(num *= 3);
        System.out.println(num /= 3);
        System.out.println(num %= 3);

        // 주의사항 : 작성 순서가 바뀌게 되면 -5 숫자를 NUM 공간에 대입한다.
        num =- 5;

        System.out.println(num);

    }
}
