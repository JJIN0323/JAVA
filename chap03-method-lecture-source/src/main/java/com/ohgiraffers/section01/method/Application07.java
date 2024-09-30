package com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {

        // 매개변수, 전달인자, 리턴
        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는것을 이해할 수 있다. */
        /* 필기.
         *       매개변수와 리턴값 복합 응용
         *       매개변수도 존재하고 리턴값도 존재하는 메소드를 이용해서 간단한 계산기 만들기 */
        /* 필기.
         *       더하기 - 빼기 - 곱하기 - 나누기 메서드를 만들기.
         *       해당하는 메서드들에게 2개의 정수를 넘겨줄 것이다. */

        // 2개의 정수 !
        int first = 20;
        int second = 10;

        Application07 app7 = new Application07();
        app7.plus(first, second);
        app7.minus(first, second);
        app7.multiply(first, second);
        app7.divide(first, second);

//        System.out.println(app7.plus(first, second));
//        System.out.println(app7.minus(first, second));
//        System.out.println(app7.multiply(first, second));
//        System.out.println(app7.divide(first, second));

        int plus = app7.plus(first, second);
        int minus = app7.minus(first, second);
        int multiply = app7.multiply(first, second);
        int divide = app7.divide(first, second);

        System.out.println("plus = " + plus);
        System.out.println("minus = " + minus);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
    }

    public int plus(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;
    }
}
