package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. Static 키워드에 대해 이해할 수 있다. */

        /* 필기.
        *   static
        *   정적 메모리영역에 프로그램이 start 될 때 할당하는 키워드다.
        *   인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드. 메서드)에 지정을 할 수 있다.
        *   여러 인스턴스가 공유해서 사용할 목적의 공간이며,
        *   의도에 맞게 사용하면 좋은 코드를 만들 수 있지만,
        *   static 키워드의 남발은 유지보수와 추적이 힘든 코드를
        *   작성하는 피해야 할 방식이다.
        *   즉, 명확한 목적이 없다면  static  키워드는 자제하는것이 좋다.
        *   의도적으로 static 키워드를 사용하는 대표적인 예시는 singleton 객체를 만들 때이다. */

        staticFieldTest sft1 = new staticFieldTest();

        /* 목차. 1. 두 필드가 가지고 있는 값 확인 */
        System.out.println("nonStatic 필드 값 : " + sft1.getNonStaticCount()); // 초기값 0
        System.out.println("Static 필드 값 : " +  sft1.getStaticCount()); // 초기값 0

        /* 목차. 2. 두 필드의 값을 1씩 증가시키는 메서드 호출 */
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        /* 목차. 3. 증가 시킨 후 값 확인 */

        System.out.println("nonStatic 필드 값 : " + sft1.getNonStaticCount()); // 초기값 0
        System.out.println("Static 필드 값 : " +  sft1.getStaticCount()); // 초기값 0

        /* 목차. 4. 새로운 staticFieldTest 인스턴스 생성 */

        staticFieldTest sft2 = new staticFieldTest();

        /* 목차. 5. sft 2의 필드가 가지고 있는 값 확인 */

        System.out.println("nonStatic 필드 값 : " + sft2.getNonStaticCount()); // 초기값 0
        System.out.println("Static 필드 값 : " +  sft2.getStaticCount()); // 1

        /* 필기.
        *   인스턴스 변수의 경우에는 sft1 과 sft2 두 개의 인스턴스가
        *   서로 값을 공유하지 못한다.
        *   따라서, new 키워드를 만나는 순간 0이라는 기본값으로 초기화가 된다.
        *   하지만 static 필드의 경우 클래스변수 자체가 프로그램을 종료할 때까지
        *   유지되고 있기 때문에 값을 유지하는 것을 확인했다.
        *   따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로
        *   필드에 static 키워드를 사용하게 된다.  */

        /* 목차. 6. static 메서드를 확인 */

        StaticMethodTest smt1 = new StaticMethodTest();

        smt1.nonStaticMethod();

        /* 필기.
        *   static 메서드는 이렇게 호출을 할 수 있긴 하나
        *   static 메서드는 인스턴스를 생성하지 않아도 되는
        *   메서드 이기 때문에 static 메서드는 정적 영역에 두고
        *   인스턴스를 생성하지 않고 호출 할 목적으로 작성을 하기 때문에
        *   아래처럼 사용하는 것은 권장하지 않는다. */

        smt1.staticMethod();

        /* 목차. 7. static 호출 */

        /* 필기.
        *   static 키워드가 붙은 메서드는 인스턴스를 생성하지 않고 호출 할 수 있기 때문에
        *   클래스명.메서드명(); 이렇게 호출 한다. */
        StaticMethodTest.staticMethod();
    }
}
