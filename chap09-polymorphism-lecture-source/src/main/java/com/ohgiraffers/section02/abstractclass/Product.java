package com.ohgiraffers.section02.abstractclass;

import java.security.PublicKey;

public abstract class Product {

    /* 추상클래스는 필드를 가질 수 있다. */

    private int nonStaticField;
    private static int staticField;

    // 생성자를 가질 수 있다.
    public Product() {}

    /* 일반적인 메서드도 가질 수 있다. */

    public void nonStaticMethod() {
        System.out.println("Product 의 nonStatic 메서드 호출-");
    }

    public static void staticMethod() {
        System.out.println("Product 의 static 메서드 호출-");
    }

    /* 필기.
    *   위에까지는 일반적인 클래스와 다를바가 없다.
    *   하지만, 클래스를 추상클래스로 만들면 추상메서드를 작성할 수 있다. (강제성 부과) */

    /*  미완성 메서드 (추상메서드) : 구현부가 없는 메서드를 의미한다.
    *   추상 메서드가 0개 이상인 경우 선택으로 abstract 키워드를 클래스에 작성해야한다.
    *   하지만, 추상메서드가 1개 이상이면 abstract  키워는 필수이다. */

    public abstract void abstMethod(); // 구현체가 없음. = 몸통이 없음 = { } 가 없음.

}
