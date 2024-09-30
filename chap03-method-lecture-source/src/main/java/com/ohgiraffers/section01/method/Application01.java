package com.ohgiraffers.section01.method;

public class Application01 { //클래스명
    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다. */

        /* 필기.
        *       메소드란?
        *       메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문(코드의 집합)
        *       main 메소드는 프로그램을 시작하게하는 메소드다. */

        System.out.println("main() 시작-"); //Executing ':com.ohgiraffers.section01.Application01.main()'...

        /* 목차. 2. 작성한 methodA() 호출하기 */
        /* 필기.
        *       우리가 만든 메소드 호출하는 방법
        *
        *       [표현식] : 클래스명 변수명 = new 클래스명();
        *       변수명.메소드명(); */

        /* 필기.
        *       main 영역 밖에 있는 친구를 소환할 때 쓰는 구문 ▼ */

        Application01 App1 = new Application01();
        App1.methodA();
        App1.methodCheck();
        App1.methPlus();
        App1.methMinus();
        App1.methMultiply();
        App1.methDivide();

        System.out.println("main() 종료-"); //> Task :com.ohgiraffers.section01.Application01.main()

        System.out.println("----------------------------------------------");

        int a = 5;
        int b = 8;

        String checkMethod = calculator.checkMethod(a, b);
        int sumTwoNumber = calculator.sumTwoNumber(a, b);
        int minusTwoNumber = calculator.minusTwoNumber(a, b);
        int multiTwoNumber = calculator.multiTwoNumber(a, b);
        int divideTwoNumber = calculator.divideTwoNumber(a, b);
        System.out.println("함수 호출 : " + checkMethod);
        System.out.println("더하기 : " + sumTwoNumber);
        System.out.println("빼기 : " + minusTwoNumber);
        System.out.println("곱하기 : " + multiTwoNumber);
        System.out.println("나누기 : " + divideTwoNumber);

    }

    // main() 메소드 밖에서 진행

    int first = 10;
    int second = 20;
    int third = 5;

    public void methodCheck() {
        System.out.println("메소드 호출 확인");
        System.out.println("10과 20의 합 : " + methPlus());
        System.out.println("10과 5의 차 : " + methMinus());
        System.out.println("10과 5의 곱 : " + methMultiply());
        System.out.println("10과 5의 나눈 후 몫 : " + methDivide());
    }

    public int methPlus() {
        return first + second;
    }

    public int methMinus() {
        return first - third;
    }

    public int methMultiply() {
        return first * third;
    }

    public int methDivide() {
        return first / third;
    }

    /* 목차. 1. methodA() 만들어보기 */

    public void methodA() {
        // public 은 어디서든 사용 가능하다 ! 는 뜻.
        // static 은 정적함수이기 때문에, 동적으로는 사용 불가하다.

        System.out.println("methodA() 시작.");
        methodB(); // A 안에서 B 호출
        System.out.println("methodA() 종료.");

    }

    public void methodB() {
        System.out.println("methodB 시작");
        System.out.println("methodB 종료");
    }

}
