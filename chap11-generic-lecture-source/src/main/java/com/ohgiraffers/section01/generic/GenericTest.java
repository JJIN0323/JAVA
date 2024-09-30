package com.ohgiraffers.section01.generic;

public class GenericTest<Type> { // 소문자도 가능하지만 대문자로 쓰는게 좋다.

    /* 제네릭에 대한 설정은, 클래스 선언부 마지막 부분에
       다이아몬드 연산자 <> 꺽새두개를 이용해서 작성을 하게 된다. */

    /* 다이아몬드 연산자 내부에 작성한 Test 라는 변수는 타입변수라고 부른다.
    *  타입변수를 자료형 대신에 사용을 하게 되는데,
    *  가상으로 존재하는 타입이며, 다른 영문자를 써도 상관없다.
    *  하지만, T를 많이 쓴다. T = Type 이므로...
    *  또한, 여러개의 타입변수를 작성할 때에는 나열 연산자(,)를 이용해서
    *  여러개를 기술 할 수 있다.
    *  사용하는 쪽에서는 우리가 만든 제네릭 클래스를 사용할 때,
    *  <Type> 대신에 <우리가 지정한 자료형>을 입력해주면된다.
    *  실제 사용할 타입을 타입 변수 자리에 맞춰서 넣어주면,
    *  컴파일 시점에 타입이 결정되게 된다. */

    private Type value; // 아직 자료형(타입) 미정 !!! ▶ 가상의 자료형

    // getter & setter 작성 시에도 구체적인 타입 대신 가상의 타입 (Type)를 사용할 수 있다.
    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}
