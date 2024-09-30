package com.ohgiraffers.section02.encapsulation.problem03;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 3. 필드에 직접 접근 시 발생하는 문제. */

        // 여기서는 problem 1을 적용 -> 메소드를 통해 값 입력
        Monster monster1 = new Monster();

//        monster1.setName("외계인");
        monster1.setKinds("외계인");
        monster1.setHp(100);

        System.out.println(monster1.getInfo());  // String

        /* 그러나, 아직 해결 안된 문제가 있다. */

        Monster monster5 = new Monster();

        monster5.kinds = "";
        monster5.hp = -12428324;

        System.out.println(monster5.getInfo());

        // 아직도 필드에 직접 값을 넣을 수 있다.

    }
}
