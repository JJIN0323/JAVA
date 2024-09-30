package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 리턴타입에 활용할 수 있다. */

        /* 필기.
        *   랜덤한 동물 인스턴스를 반환받아 먹게 만들자. */

        Application3 app3 = new Application3();
        동물 random = app3.getRandomAnimal();

        random.먹기();
    }

    public 동물 getRandomAnimal() {
        // 코뿔소와 개구리 2개
        int random = (int)(Math.random() * 2);
        //  묵시적으로 선언 가능
        return random == 0 ? new 코뿔소() : new 개구리();
    }
}
