package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.calculator;

public class Application02 {

    public static void main(String[] args) {

        /* 필기.
        *   IMPORT란?
        *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우
        *   패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        *   하지만, 매번 다른 클래스의 풀 패키지명을 쓰기에는 번거롭다.
        *   그래서 패키지 명을 생략하고 사용할 수 있도록 한 구문이 IMPORT 이다.
        *   IMPORT는 PACKAGE 선언문과 CLASS 선언문 사이에 작성하게 되며
        *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해
        *   미리 선언하는 효과가 갖게 된다. */

        calculator calc = new calculator();

        System.out.println(calc);
        /* non-static 메서드 호출 */

        int min = calc.minNum(50, 60);
        System.out.println(min);

        /* static 메서드 호출 */

        int max = calculator.maxNum(50, 60);
        System.out.println(max);

        }

    }
