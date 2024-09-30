package com.ohgiraffers.section03.interfaceimplements;

public interface InterfaceProduct {

    /* 필기.
    *   인터페이스의 특징은
    *   상수필드만 작성이 가능하다.
    *   public static final 키워드 조합을 상수 필드라고 한다.
    *   반드시 선언과 동시에 초기화를 해주어야 한다. */

    // public static final 을 지워도 묵시적으로 적용됨
    // public static final int Max_Num = 100;
    int Max_Num = 100;

    /* 인터페이스는 추상메서드만 작성이 가능하다.
    *   따라서, 인터페이스 내부에 작성한 메서드는 묵시적으로
    *   public abstract 의 의미를 가지게 된다.
    *   그리고 인터페이스는 생성자를 가질 수 없다. */

    /* 목차. 1. 인터페이스는 생성자를 가질 수 없다. */
    // public InterfaceProduct() {} // 허용되지 않음.

    /* 목차. 2. 인터페이스는 구현부가 있는 메서드를 가질 수 없다. */
    // public void nonstaticMethod() {} //  { 구현체 } 가질 수 없다.

    /* 목차. 3. 추상클래스에서 작성해본 추상메서드만 작성 가능하다. */

    /* 필기.
    *   인터페이스 내부의 메서드는 묵시적으로 public abstract 의
    *   의미를 가지고 있기에 굳이 쓰지 않아도 된다.
    *   반드시!!!!! public 으로 해야한다.
    *   다른 접근 제한자는 사용이 불가능하다. */

    // public abstract void nonstaticMethod();
    void nonstaticMethod();

    /* static 메서드는 작성 가능하다. */
    static void staticMethod() {
        System.out.println("InterfaceProduct 의 staticMethod() 호출- ");
    }

}
