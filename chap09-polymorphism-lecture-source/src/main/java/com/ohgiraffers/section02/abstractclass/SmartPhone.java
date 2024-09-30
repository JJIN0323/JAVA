package com.ohgiraffers.section02.abstractclass;

// extends 는 단 하나의 클래스만 상속 받을 수 있음.
public class SmartPhone extends Product{

    @Override
    public void abstMethod() { // 반드시 사용해야함!!!!!!!!
        System.out.println("Product 클래스의 오버라이딩 강제화 된 abstMethod() 호출-");
    }

    /* 상속 : 부모의 것뿐만 아니라 자기만의 기능을 가질 수 있다.. */

    public void Samsung() {
        System.out.println("갤럭시폴듀-오해");
    }

}
