package com.ohgiraffers.section03.abstraction;

public class Car {

    // 관리해야 할 상태
    //  - 속력, 시동상태
    
    private boolean isOn; // 시동 상태
    private int speed;      // 현재 속력

    public void startUp() {
        if (isOn) { // false
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true; // 시동 걸기
            System.out.println("시동을 걸었습니다. 출발 준비 완료~");
        }
    }

    public void go() {
        if (isOn) { // 시동이 걸린 상태
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 100;
            System.out.println("현재 속도는 " + this.speed + "km/h 입니다.");
        } else {
            System.out.println("차의 시동을 확인 해주세요.");
        }
    }

    public void stop() {
        if (isOn) { // 시동이 걸려있고, 달리는 경우에만 멈출 수 있다.
            // if 문에서는 ! 부정을 쓰지 않는다. 왜 ? True 여야만, if 문이 실행 되기 때문에.
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("ㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲ");
            } else {
                System.out.println("이미 차는 0km/h 입니다.");
            }
        } else {
            System.out.println("이미 멈춰있습니다.");
        }
    }

    // 시동이 걸려있다면, 시동을 끄고
    // 이미 꺼져 있다면, 끌 수 없고
    // 움직이고 있다면, 브레이크 밟아라
    public void turnOff() {
        if (isOn) {
            if (speed > 0) { // 어짜피 전역 변수여서 this. 이 없어도 된다. 다만, turnOff 에 변수가 있으면 예외.
                System.out.println("달리는 상태에서는 시동을 끄면 안됩니다.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끄겠습니다.");
            }
        } else {
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }
}
