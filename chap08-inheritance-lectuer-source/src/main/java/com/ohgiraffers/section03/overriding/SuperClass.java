package com.ohgiraffers.section03.overriding;

public class SuperClass {

    /* 수업목표. Overriding 에 대해 이해할 수 있다. */

    /* 필기.
    *   Overriding 의 성립 요건.
    *   1. 메서드의 이름이 동일해야 한다.
    *   2. 메서드의 리턴 타입이 동일해야 한다.
    *   3. 매개변수의 타입, 갯수, 순서가 동일해야 한다.
    *   4. private 메서드는 접근이 불가능하기 때문에 오버라이딩 불가능.
    *   5. final 키워드가 사용 된 메서드는 오버라이딩 불가능.
    *   6. 접근제한자는 부모 메서드와 같거나, 더 넓은 범위여야 가능. (protected) ★★★
    *   7. 예외처리는 같은 예외이거나. 더 구체적(하위)인 예외를 다루어야한다. ★★★ */

    // 예시 메서드
    public void method(int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}

}
