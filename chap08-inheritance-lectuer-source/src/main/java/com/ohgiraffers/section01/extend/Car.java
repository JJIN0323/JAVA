package com.ohgiraffers.section01.extend;

public class Car {

    /* 멤버 -> 필드 , 메서드 */

    private boolean runningStatus;      // 달리고 있는지 여부

    //  호출 흐름 파악을 위한 기본 생성자
    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출-");
    }

    /* run() : 달리는 기능, soundHorn() : 경적을 울리는 기능
    *   isRunning() : 주행상태를 반환하는 기능, stop() : 멈추는 기능 */

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달려갑니다.");
    }

    public void soundHorn() {
        // 자동차는 주행중인 상태에서만 경적을 울릴 수 있다.
        if(isRunning()) {
            System.out.println("빵빵");
        } else {
            System.out.println("경적을 울릴 수 없습니다.");
        }
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    // protected 접근 제한자로 같은 패키지 내에 있는 클래스에서는
    // 사용할 수 있게 접근 범위 확장.
    protected boolean isRunning() {
        // 주행상태 반환
        return runningStatus;
    }

}
