package com.ohgiraffers.section04.use;

// 경운기는 차의 기본적인 기능 (출발, 정지)는 할 수 있지만
// 경적을 울리는 기능은 없다.
public class FarmCar extends Car {

    @Override
    public void go() {
        System.out.println("경운기 출발~");
    }

    @Override
    public void stop() {
        System.out.println("경운기 정지.");
    }
}
