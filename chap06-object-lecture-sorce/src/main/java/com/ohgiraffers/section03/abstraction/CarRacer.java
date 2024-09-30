package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class CarRacer {

    Scanner sc = new Scanner(System.in);

    private Car car = new Car(); // 속성
    String user = userName();
    // 사용자가 상태를 마음대로 바꿀 수 없게 private 로 막아줌.
    // 클래스도 자료형이다 !!!!!

    // 행위 - Alt + Enter 누르고 Create method~
    public String userName() {
        System.out.print("사용자 이름을 입력해주세요 : ");
        String user = sc.nextLine();
        return user;
    }

    public void startUp() {
        System.out.print(user + " ");
        car.startUp(); // 자동차 안에 시동걸기 호출
    }

    public void stepAccelerator() {
        System.out.print(user + " ");
        car.go();
    }

    public void stepBreak() {
        System.out.print(user + " ");
        car.stop();
    }

    public void turnOff() {
        System.out.print(user + " ");
        car.turnOff();
    }

    public void offHemet() {
        System.out.print(user + " ");
        System.out.println("헬멧을 창밖으로 던진다.");
    }
}
