package com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 객체 배열에 대해 이해할 수 있다. */

        /* 필기.
        *   객체 배열이란 ?
        *   레퍼런스 변수에 대한 배열이다.
        *   생성한 인스턴스도 배열을 이용해서 관리를 하게 된다면,
        *   동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고
        *   연속처리를 할 수 있게 되어서 유용하다.
        *   또한, 메서드의 반환값(return)은 1개의 값만 반환할 수 있기 때문에
        *   동일한 타입의 여러 인스턴스를 반환해야 하는 경우
        *   배열로 묶어서 반환할 수 있게 된다. */

        Car[] carArr = new Car[5];
        
        carArr[0] = new Car("페라리", 300);
        carArr[1] = new Car("포르셰", 300);
        carArr[2] = new Car("부가티", 300);
        carArr[3] = new Car("현대", 300);
        carArr[4] = new Car("기아", 300);
    
        // 출력하기 위한 for 문
        for (int i = 0; i < carArr.length; i++) {
            carArr[i].carMaxSpeedInfo();
        }

        System.out.println();

        // 향상된 for 문
        for (Car c : carArr) {
            c.carMaxSpeedInfo();
        }
    }
}
