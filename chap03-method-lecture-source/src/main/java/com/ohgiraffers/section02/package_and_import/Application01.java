package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.calculator;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해 할 수 있다. */

        com.ohgiraffers.section01.method.calculator calc = new com.ohgiraffers.section01.method.calculator();

        /* 필기.
        *    패치지란?
        *    서로 관련있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는것을 의미한다.
        *    같은 패키지 내에서는 동일한 이름을 가진 클래스를 만들 수 없지만,
        *    패키지가 다르다면 동이란 이름을 가진 클래스를 만들 수 있다.
        *    우리가 지금까지 method 패키지에서 Calculator 클래스를 호출 할 때
        *    com.ohgiraffers ~~~ 를 생략해도 가능한 이유는 같은 패키지에 있기 때문에 가능하다. */

        calc.minNum(30, 20);

        int min = calc.minNum(30,20);
        System.out.println("30과 20중에 더 작은 값은 : " + min);

        // static 메서드 호출해보기
        calculator.maxNum(30,20);
        int max = calculator.maxNum(10,20);
        System.out.println("30과 20중에 더 큰 값은 : " + max);

    }
}
