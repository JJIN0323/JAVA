package com.ohgiraffers.section03.math;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Math 크래스에서 제공하는 static 메서드를 호출할 수 있다. */

        /* 필기.
        *   API 란?
        *   Application Programming Interface 는 프로그램에서 사용 할 수 있도록
        *   운영체제나 프로그래밍 언어가 제공하는 기능을 이용(제어) 할 수 있도록 만든 인터페이스를 의미한다.
        *   쉽게 마래 우리가 구혀나기 힘들거나, 번거로운 기능을 JDK 만 설치하면 사용할 수 있도록 제공해둔 소스코드를 의미한다.
        *   더 쉽게 말하면, 인도/미국 사람들이 만든 유용한 기능을 우리는 가져와서 쓰기만 하면 된다. */

        /* 목차. 1. 절대값 출력 해보기 */
        System.out.println("-7의 절대값 구하기 : " + (Math.abs(-7)));

        /* 목차. 2. 최대값과 최솟값 출력 해보기 */
        // 최대값
        System.out.println("10과 20중 더 큰 값은 : " + (Math.max(10, 20)));
        // 최솟값
        System.out.println("10과 20중 더 작은 값은 : " + (Math.min(10, 20)));

        /* 목차. 3. 난수 출력 */
        System.out.println("랜덤 값 출력해보기 : " + (Math.random()));
    }
}
