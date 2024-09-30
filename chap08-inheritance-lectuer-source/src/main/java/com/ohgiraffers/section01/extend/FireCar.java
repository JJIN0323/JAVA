package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    /* 목차. 1. extends 키워드를 통해 car 클래스 상속 */

    /* 목차. 2. soundHorn() 메서드 오버라이딩 */

    @Override
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("소방차 나가신다 길을 비켜라");
        } else {
            System.out.println("소방차가 경적을 울릴 수 없습니다.");
        }
    }

    // 기본생성자
    public FireCar() {

        /* 모든 생성자에는 가장 첫 줄에 super()를 컴파일러가 자동 추가해준다.
        *   super() = 부모의 기본 생성자를 호출하는 구문이다.
        *   명시적. 묵시적 둘 다 가능하다. */

        super(); // 써도되고 안써도됨.

        System.out.println("FireCar 클래스의 기본생성자 호출-");
    }

    /* 목차. 3. 물 뿌리는 기능 추가 */

    public void sprayWater() {
        System.out.println("소방차가 물을 뿌린다.");
    }

}
