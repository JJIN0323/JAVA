package com.ohgiraffers.section03.interfaceimplements;

/* interface 를 상속 받을 때는 implements 키워드를 사용한다 */
//public abstract class Product extends Object implements InterfaceProduct, java.io.Serializable{
public class Product extends Object implements InterfaceProduct, java.io.Serializable{

    /* 필기.
    *   클래스에서 인터페이스를 상속 받을 때는 implements 키워드를 사용하게 된다.
    *   또한 인터페이스는 여러 개를 상속 받을 수 있으며,
    *   extends 로 다른 클래스를 상속 받는 경우에도 별개로 추가 상속이 가능하다.
    *   단, extends 가 implements 보다 앞에 작성되어야 한다. */

    @Override
    public void nonstaticMethod() {
        System.out.println("interfaceProduct 의 nonStaticMethod 호출-");
    }
}
