package com.ohgiraffers.section01.generic;

import java.lang.reflect.Type;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. Generic 에 대해 이해할 수 있다. */

        /* 제네릭의 사전적 의미는 일반적인 이라는 의미를 갖는다
        *  자바에서 제네릭이란, 데이터 타입을 일반화 시키는 의미를 갖고 있다.
        *
        *  제네릭은 클래스나 메서드에서 사용할 내부 데이터 타입을
        *  컴파일 시점에 지정하는 방법을 말한다.
        *  컴파일 시에 미리 타입 검사를 실행하게 되면 클래스나 메서드
        *  내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며,
        *  반환값에 대한 타입 변환 및 타입 검사에 대한 코드 생략이 가능하다. */

        //GenericTest<Type> genericTest1 = new GenericTest<Type>();
        GenericTest<Integer> genericTest1 = new GenericTest<Integer>();
        genericTest1.setValue(10); // 오토박싱
        System.out.println("genericTest1.getValue() = " + genericTest1.getValue());

        System.out.print("genericTest1.getValue() Instance = ");
        System.out.println(genericTest1.getValue() instanceof Integer);

        /* JDK 7 버전부터, 타입 선언 시 타입변수를 작성하면
        *  생성자 쪽에서는 타입을 생략해도 된다. */

        //GenericTest<String> genericTest2 = new GenericTest<>(); // 가능.
        GenericTest<String> genericTest2 = new GenericTest<String>();
        genericTest2.setValue("홍길동");
        System.out.println("genericTest2.getValue() = " + genericTest2.getValue());

        System.out.print("genericTest2.getValue() Instance = ");
        System.out.println(genericTest2.getValue() instanceof String);
    }
}
