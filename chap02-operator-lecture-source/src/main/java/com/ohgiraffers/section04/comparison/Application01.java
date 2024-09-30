package com.ohgiraffers.section04.comparison;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 비교연산자에 대해 이해하고 활용할 수 있다. */

        /* 필기.
        *       비교연산자
        *       비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        *       연산자 중 참 혹은 거짓을 반환하는 연산자는 조건식이나 조건문의 조건절에 많이 사용된다. */

        /* 필기.
        *       비교연산자의 종류
        *       '==' 같다 : 왼쪽 피연산자와 오른쪽 피연산자가 같으면 True 다르면 False
        *       '!=' 다르다 : 왼쪽 피연산자와 오른쪽 피연자가 같으면 False 다르면 True
        *       - 느낌표(!)는 부정의 표시이다.
        *       '>' : 왼쪽 피연산자가 오른쪽 피연산자보다 크면 True 다르면 False
        *       '>=' : 왼쪽 피연산자가 오른쪽 피연산자보다 크거나 같으면 True 다르면 False
        *       이외에도 '<', '<=' 등이 있다. */

        /* 목차. 1. 숫자값 비교 */
        
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);


        System.out.println("----------------------------------------------");

        /* 목차. 2. 문자 값 비교 */

        /* 필기.
        *       문자는 내부적으로 숫자로 처리가 되기 때문에 대소비교가 가능하다. */
        
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);
        System.out.println(ch1 <= ch2);
        System.out.println(ch1 >= ch2);
        System.out.println(ch1 < ch2);
        System.out.println(ch1 > ch2);

        /* 목차. 2. 문자열 값 비교 */
        
        System.out.println("----------------------------------------------");

        String str1 = "조평훈";
        String str2 = "조평훈";

        /* 필기.
        *       문자열은 ==, !=는 가능하지만, 대소비교는 불가능하다. */

        System.out.println(str1 == str2);
        System.out.println(str1 != str2);

        // 문자열은 대소비교가 불가능하다.

        //System.out.println(str1 <= str2);
        //System.out.println(str1 >= str2);
        //System.out.println(str1 < str2);
        //System.out.println(str1 > str2);


    }
}
