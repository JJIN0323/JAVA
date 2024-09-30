package com.ohgiraffers.section05.overloading;

public class OverloadingTests {

    /* 수업목표. 오버로딩에 대해 이해할 수 있다. */

    /* 필기.
    *   오버로딩 사용 이유 :
    *   매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우가 종종 있다.
    *   이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 붙이게 되면,
    *   메소드의 이름을 다 외우고, 관리하기 힘들 것이다.
    *   동일한 이름으로 다양한 종류의 매개변수에 따라서 처리해야 하는
    *   여러가지 메소드를 관리하는 기술을 오버로딩(Overloading) 이라고 한다. */

    /* 필기.
    *   오버로딩의 조건 :
    *   동일한 이름을 가진 메소드의 파라메터 선언부에 매개변수의 타입, 갯수, 순서를
    *    다르게 작성해서 한 클래스 내에 동일한 이름의 메소드를 여러 개
    *   작성할 수 있도록 한다. ( = 메소드의 시그니처 )
    *   - 메소드의 시그니처가 다르면 다른 메소드로 인식하게 된다.
    *
    *   메소드의 시그니처란 :
    *   public void test (int num) {} 이라는 메소드가 있다면,
    *   test (int num) <- 이 부분이 메소드의 시그니처이다.  */

    public void test () {}

    // 위와 메소드의 시그니쳐가 같기 때문에 컴파일 오류 발생.
    //public void test () {}

    // 접근 제한자를 바꾸어도, 메소드의 시그니처가 같기 때문에 컴파일 오류 발생.
    //private vioid test () {}

    // 마찬가지로, 메소드의 반환형을 바꾸더라도 시그니처가 같기 때문에 오류 발생.
    //public int test () {return  0;}

    public void test (int num) {}

    // 매개변수명은 다를지라도, 타입이 같기 때문에 컴파일 오류 발생.
    //public void test (int num1) {}

    // 매개변수의 갯수에 따라 오버로딩이 성립한다.
    public void test (int num, int num1) {}

    // 매개변수의 타입 변화에 따라 오버로딩이 성립한다.
    public void test (int num1, String str) {}

    // 매개변수의 순서에 따라 오버로딩이 성립한다.
    public void test (String str, int num1) {}

    /* 코드의 확장성!!!!!!!!!!!!!!!!! 중요★ */
}
