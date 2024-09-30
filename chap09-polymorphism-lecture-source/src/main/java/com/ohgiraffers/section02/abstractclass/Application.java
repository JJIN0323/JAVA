package com.ohgiraffers.section02.abstractclass;

public class Application { // 추상 클래스 (구체적이지 않다)
    public static void main(String[] args) {

        /* 수업목표. 추상 클래스와 추상 메서드에 대해 이해할 수 있다. */

        /* 필기.
        *   추상클래스와 추상메서드
        *   추상메서드를 0개이상(없어도 되고, 있어도 됨) 가지고 있는 클래스를 추상클래스라고 한다.
        *   추상클래스는 클래스 선언부에 abstract 라고 명시해야 한다.
        *   추상클래스는 츨래스인척 하는 녀석이기 때문에 직접적으로 인스턴스를 생성 할 수 없다.
        *   그렇기 때문에, 추상클래스를 사용하기 위해서는 상속 받은,
        *   자식 클래스를 이용해서 인스턴스를 생성해야 한다. */

        /* 목차. 1. 추상클래스는 인스턴스를 생성 할 수 없다. */
        //Product product = new Product();

        /* 다형성을 적용해서 자식 클래스를 이용하여 Product 를 추출. */
        /* 목차. 2. 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용 */
       SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* 목차. 2. 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용 */
        Product product = new SmartPhone();

        /* 목차. 3. 동적 바인딩을 통해 자료형은 Product 지만, SmartPhone 메서드가 호출 */
        product.abstMethod();
        // 추상클래스가 가진 메서드도 호출 가능.
        product.nonStaticMethod();

        // static 메서드는 인스턴스 생성이 불필요
        Product.staticMethod();

        /* 필기.
        *   추상클래스를 왜 사용하는가
        *   추상메서드를 오버라이딩 하는것에 대해 강제성이 부여된다.
        *   따라서. 여러 클래스를 그룹화 하여 필수 기능을 정의해서 강제성을 부여해
        *   개발 시 일관된 인터페이스를 정의할 수 있게 된다. */
    }
}
