package com.ohgiraffers.section04.use;

// 경적도 울릴 수 있고, 차의 기본적인 기능도 수행 할 수 있다.
public class FireCar extends Car implements SoundHorn {
    @Override
    public void go() {
        System.out.println("소방차 출발~");
    }

    @Override
    public void stop() {
        System.out.println("소방차 멈춤.");
    }

    @Override
    public void horn() {
        System.out.println("비키세요~");
    }
}
