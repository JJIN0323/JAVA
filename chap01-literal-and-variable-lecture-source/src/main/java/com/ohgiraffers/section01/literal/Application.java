package com.ohgiraffers.section01.literal;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */

        /* 필기
           Java 라고 하는 프로그래밍 언어에는 정해진 약속된 형태의 값들 있다. */

        /*    1. 숫자 형태의 값.
                 숫자 형태는 숫자 그대로 입력해도 정상적으로 인식된다. */
        //    1-1. 정수 형태의 값 출력
                   System.out.println(123);
        //    1-2. 실수 형태의 값 출력
                   System.out.println(1.23);

        /*    2. 문자 형태의 값.
                 문자 형태의 값은 홀따옴표(single-quotation)으로 감싸야 한다. */
        //    2-1. 문자 하나만 했을 때
                   System.out.println('a');
        //    2-2. 문자 두개 입력했을 때
        //         System.out.println('ab'); //붉은 줄로 오류 발생 안내됨. 두 개 이상은 문자로 취급하지 않아 에러가 발생한다.
        //    2-3. 문자 없이 홀따옴표만 있을 때
        //         System.out.println(''); //붉은 줄로 오류 발생 안내됨. 아무런 문자도 기록되지 않아 에러가 발생한다.
        //    2-4. 문자 대신 숫자가 들어갈 때
        //         숫자 값이지만, 홀따옴표로 감싸여 있기 때문에 문자로 인식된다.
                   System.out.println('3');

        /*    3. 문자열 형태의 값.
                 두 개 이상의 문자가 나열된 형태의 값은 쌍따옴표(double-quotation)로 감싸야 한다. */
        //    3-1. 문자열이 입력되었을 때
                   System.out.println("안녕하세요");
        //    3-2. 문자 대신 숫자가 들어갈 때
        //         숫자 값이어도 쌍따옴표로 감싸여 있으면 문자로 인식된다.
                   System.out.println("123");
        //    3-3. 공백이 들어갔을 때
        //         공백이어도 문자열이라고 인식된다.
                   System.out.println("");
        //    3-4. 문자 하나가 들어갈 때
        //         문자 값이지만, 쌍따옴표로 감싸여 있기 때문에 문자로 인식된다.
                   System.out.println("a");

        /*    4. 논리 형태의 값.
                 논리적으로 약속된 값들  */
        //    4-1. true / false
                   System.out.println(true);


    }

}
