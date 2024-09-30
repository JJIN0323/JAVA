package com.ohgiraffers.secton06.ternary;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 삼항연산자에 대해 이해할 수 있다. */

        /* 필기
        *       삼항연산자
        *       자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        *       = 항목이 3개다.
        *       표현식 : (조건식) ? 조건이 참일 때 사용할 값 : 조건이 거짓일 때 사용할 값. */

        int num1 = 10;
        int num2 = -10;
        
        //(조건식) ? 조건이 참일 때 사용할 값 : 조건이 거짓일 때 사용할 값 : 
        String result1 = (num1 > 0) ? "참" : "거짓";
        String result2 = (num2 > 0) ? "참" : "거짓"; // 자료형을 맞춰줘야 함!!!

        System.out.println(("(조건식)의 값 : ") + result1);
        System.out.println(("(조건식)의 값 : ") + result2);

        System.out.println("----------------------------------------------------------");
        
        /* 목차. 2. 삼항연산자 중첩 활용 */

        int num3 = 5;
        int num4 = 0;
        int num5 = -5;
        
        String result3 = (num3 > 0) ? "참" : (num3 == 0) ? "0" : "거짓";
        String result4 = (num4 > 0) ? "참" : (num4 == 0) ? "0" : "거짓";
        String result5 = (num5 > 0) ? "참" : (num5 == 0) ? "0" : "거짓";

        System.out.println(("조건식의 값 : ") + result3);
        System.out.println(("조건식의 값 : ") + result4);
        System.out.println(("조건식의 값 : ") + result5);

    }
}
