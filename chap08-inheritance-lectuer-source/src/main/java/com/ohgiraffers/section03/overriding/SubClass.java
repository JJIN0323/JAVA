package com.ohgiraffers.section03.overriding;

// 클래스에 final 키워드를 붙이면 상속을 제한하는 의미.

public class SubClass extends SuperClass {

    /* 목차. 1. 메서드 이름을 변경하면 오류 발생 */

//    @Override
//    public void method2(int num) {}

    /* 목차. 2. 메서드의 리턴 타입을 변경하면 오류 발생 */

//    public int method(int num) {return 0;}

    /* 목차. 3. 매개변수의 갯수, 타입 변경하면 오류 발생 */
    
//    @Override
//    public void method(String num, int num2) {}
    
    /* 목차. 4. 메서드의 이름, 리턴타입, 매개변수, 갯수, 타입, 순서 모두 일치 */
    
    @Override
    public void method(int num) {}
    
    /* 목차. 5. private 메서드는 오버라이딩 불가능 */
    
//    @Override
//    private void privateMethod() {}
    
    /* 목차. 6. final 메서드는 오버라이딩 불가능 */
    
//    @Override
//    public final void finalMethod() {}
    
    /* 목차. 7. 부모 메서드의 접근 제한자와 같거나 더 넓은 범위로 해야 가능 */

    @Override
//  void protectedMethod() {} // 더 좁은 범위로는 불가능. default 버전.
//  protected void protectedMethod() {} // 부모와 같은 범위는 가능.
    public void protectedMethod() {} // 부모보다 더 큰 범위도 가능.
}
