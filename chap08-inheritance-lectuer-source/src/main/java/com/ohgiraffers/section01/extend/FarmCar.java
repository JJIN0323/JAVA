package com.ohgiraffers.section01.extend;

public class FarmCar extends Car {

    public FarmCar() {
        System.out.println("FarmCar 클래스의 기본생성자 호출-");
    }

    @Override
    public void run() {
        System.out.println("경운기 지나간다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("경적이 없다.");
    }

    @Override
    public void stop() {
        System.out.println("경운기 멈춘다.");
    }
}
