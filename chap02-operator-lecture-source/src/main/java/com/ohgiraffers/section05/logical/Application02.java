package com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 논리연산자의 우선순위에 대해 이해하고 활용해보자. */

        /* 필기.
        *       논리 연산자의 우선순위와 활용
        *       논리 and 연산자와 논리 or 연산자의 우선순위
        *       && : 11순위
        *       || : 12순위 */

        /* 목차. 1. 1부터 100까지 사이의 값인지 확인 */

        int num1 = 50;

        System.out.println("1부터 100사이의 값? : " + ( num1 >= 1 && num1 <= 100 ));

        System.out.println("----------------------------------------------------------");

        /* 목차. 2. 영어 대문자인지 확인 */

        char ch1 = 'G'; // 문자는 내부적으로 숫자이다.

        System.out.println("ch1이 영어 대문자인지 확인? : " + (ch1 >= 'A' && ch1 <= 'Z'));

        // 소문자 a는 대문자 A보다 클까? -> 형변환을 사용해보자.

        char a = 'a';
        char A = 'A';

        System.out.println((int)a);
        System.out.println((int)A);

        System.out.println("----------------------------------------------------------");

        /* 목차. 3. 'f' 대소문자 상관없이 영어인지 확인해보기 */

        char f = 'f';

        //System.out.println("f가 영어인지 확인해보기 : " + (f >= 'a' && f <='z' || f >= 'A' && f <= 'Z')); // &&가 더 우선순위기 때문에..
        System.out.println("f가 영어인지 확인해보기 : " + ((f >= 'a' && f <='z') || (f >= 'A' && f <= 'Z'))); // 이게 더 완벽한 식

    }
}
