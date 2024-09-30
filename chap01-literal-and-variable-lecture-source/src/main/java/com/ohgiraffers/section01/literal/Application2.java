package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {
        //2024.08.23
        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */

        // 값의 형태에 따라서 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.

        // 1. 숫자와 숫자의 연산
        //  1-1. 정수와 정수의 연산
        //       수학적으로 사용하는 사칙연산에 추가적으로 나머지를 구하는 연산(mod(%))을 사용할 수 있다.
                 System.out.println("============ 정수와 정수 연산 ============");
                 System.out.println(123 + 10);   // 덧셈
                 System.out.println(123 - 10);   // 뺄셈
                 System.out.println(123 * 10);   // 곱셈
                 System.out.println(123 / 10);   // 나눈 값의 몫
                 System.out.println(123 % 10);   // 나눈 값의 나머지
        //  1-2. 실수와 실수의 연산
        //       수학적으로 사용하는 사칙연산에 추가적으로 나머지를 구하는 연산(mod(%))을 사용할 수 있다.
                 System.out.println("============ 실수와 실수 연산 ============");
                 System.out.println(1.23 + 0.2);   // 덧셈
                 System.out.println(1.23 - 0.2);   // 뺄셈
                 System.out.println(1.23 * 0.2);   // 곱셈
                 System.out.println(1.23 / 0.2);   // 나눈 값의 몫
                 System.out.println(1.23 % 0.2);   // 나눈 값의 나머지

        // 2. 문자의 연산
        //  2-1. 문자와 문자의 연산
        //       문자는 내부적으로 숫자로 변환되어 계산이 된다.
                 System.out.println("============ 문자와 문자 연산 ============");
                 System.out.println('a' + 'b');   // 덧셈
                 System.out.println('a' - 'b');   // 뺄셈
                 System.out.println('a' * 'b');   // 곱셈
                 System.out.println('a' / 'b');   // 나눈 값의 몫
                 System.out.println('a' % 'b');   // 나눈 값의 나머지
        //  2-2. 문자와 정수의 연산
        //       컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있다.
        //       때문에 모든 문자는 대응되는 숫자들이 존재한다. = 아스키코드와 유니코드
                 System.out.println("============ 문자와 정수 연산 ============");
                 System.out.println('a' + 2);   // 덧셈
                 System.out.println('a' - 2);   // 뺄셈
                 System.out.println('a' * 2);   // 곱셈
                 System.out.println('a' / 2);   // 나눈 값의 몫
                 System.out.println('a' % 2);   // 나눈 값의 나머지

        // 3. 문자열의 연산
        //  3-1. 문자열과 문자열의 연산
        //       문자열과 문자열의 '+' 연산 결과는 문자열 합치기가 된다.
        //       하지만 문자열은 '+' 연산 외에는 사용하지 못한다. (수가 아니기 때문에.)
                 System.out.println("============ 문자열과 문자열 연산 ============");
                 System.out.println("hello" + "world");   // 덧셈
        //       System.out.println("hello" - "world");   // 뺄셈
        //       System.out.println("hello" * "world");   // 곱셈
        //       System.out.println("hello" / "world");   // 나눈 값의 몫
        //       System.out.println("hello" % "world");   // 나눈 값의 나머지

        //  3-2. 문자열과 다른 형태의 값 연산
        //       문자열이 포함된 연산은 '+' 연산만 가능하다.
        //       중요!
        //       문자열이 포함된 연산의 결과는 다른 형태의 값(숫자, 문자, 논리)들도 문자열로 취급하여 이어붙인(합친) 결과가 나온다.
                 System.out.println("============ 문자와 다른 형태의 값 연산 ============");
                 System.out.println("hello" + 123);     //정수
                 System.out.println("hello" + 1.23);    //실수
                 System.out.println("hello" + 'a');     //문자
                 System.out.println("hello" + true);    //논리 형태

        // 4. 논리값과 문자열의 연산
        //    논리 형태의 값은 문자열 합치기(+) 연산 외에는 사용할 수 없다.
                 System.out.println("============ 논리값과 문자열 연산 ============");
        //       System.out.println(true + 'a');       // 불가
        //       System.out.println(true + 123);       // 불가
        //       System.out.println(true + 1.23);      // 불가
        //       System.out.println(true + false);     // 불가
                 System.out.println(true + "false");   // 문자열만 가능


        System.out.println("============ 연산 실습 ============");
        System.out.println("기차"+123+45+"출발");
        System.out.println(123+45+"기차"+"출발");
        System.out.println(123-45+"기차"+"출발");


    }

}
