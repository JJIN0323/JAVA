package com.ohgiraffers.section01.method;

public class calculator {

    /* 필기.
    *       우리는 Application 에서 2개의 정수를 전달 할 것이고,
    *       calculator 클래스는 2개의 정수를 전달 받아
    *       최소값과 최대값을 구하는 메서드(기능) 을 만들것이다.
    *       실행 후 Application 에게 2개의 정수 중 큰 값과 작은 값이 무엇인지 알려줄 것이다. */

    public int minNum(int firstNum, int secondNum) {
        return (firstNum < secondNum) ? firstNum : secondNum;
    }

    public static int maxNum(int firstNum, int secondNum) {
        return (firstNum > secondNum) ? firstNum : secondNum;
    }

    //public static void test() {}

    public static String checkMethod(int a, int b) {
        return "a, b";
    }

    public static int sumTwoNumber(int a, int b) {
        return (a + b);
    }

    public static int minusTwoNumber(int a, int b) {
        return (a - b);
    }

    public static int multiTwoNumber(int a, int b) {
        return (a * b);
    }

    public static int divideTwoNumber(int a, int b) {
        return (a / b);
    }

}
