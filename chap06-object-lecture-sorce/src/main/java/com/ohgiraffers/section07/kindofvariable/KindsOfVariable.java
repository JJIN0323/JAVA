package com.ohgiraffers.section07.kindofvariable;

public class KindsOfVariable {

    /* 수업목표. 다양한 변수들을 이해하고 사용할 수 있다. */

    /* 필기.
    *   클래스 영역 내부에 작성하는 변수를 '필드'라고 한다.
    *   필드 == 멤버변수(클래스가 가진 멤버), == 전역변수 */

    /* 필기.
    *   non-static 필드 == 인스턴스변수 라고도 한다.
    *   인스턴스 생성 시점에 사용 가능한 변수의 의미
    *   즉. 공간이 있어야만 사용할 수 있다. */

    private int globalNum; // 필드 + 멤버변수 + 전역변수 + 인스턴스변수

    /* 필기.
    *   static 필드는 '정적 필드' == 클래스변수 라고도 한다.
    *   static 이기 때문에, 인스턴스 변수는 될 수 없다. */

    private static int staticNum;

    public void testMethod(int num) {

        /* 필기.
        *   메서드 영역 내에서 작성하는 변수를 '지역변수'라고 한다.
        *   매개변수도 일종의 지역변수 이다.
        *   지역변수와 매개변수는 모두 메서드 호출 시,
        *    stack 영역에 생성이 된다. */


        int localNum;

        // 매개변수는 호출 시 값이 넘어와서 변경 되기 때문에, 초기화가 필요 없다.
        System.out.println(num);

        // 지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화 해야 한다.
        //System.out.println(localNum);

        System.out.println(globalNum);
        System.out.println(staticNum);

    }

    public void testMethod2() {

        System.out.println(globalNum);
        System.out.println(staticNum);
        //System.out.println(localNum); // 다른지역에 있기 때문에 얜 모름.
    }

}
