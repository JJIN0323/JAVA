package com.ohgiraffers.section02.encapsulation.problem01;

public class Monster {

    // 몬스터 이름
    String name;
    // 몬스터의 체력
    int hp;

    public void setHp(int hp) { // 암묵적인 룰.

        /* 필기.
        *   this 는 인스턴스가 생성될 때 자신의 주소를 저장하는 레퍼런스이다.
        *   지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선 접근하기 때문에
        *   '전역 변수'에 접근하기 위해 & 전역변수라는걸 알려주기 위해 this. 를 명시한다!!!!!!!!!!!!!!! */

        if (hp > 0) {
            System.out.println("정상적인 값이 들어와서 전달한 값으로 몬스터의 체력을 설정합니다.");
            this.hp = hp; // this 는 자기자신 = 해당하는 클래스. Monster.hp 와 동일.
        } else {
            System.out.println("* 부적절한 값이 들어와서 체력을 0으로 초기화 합니다. *");
            this.hp = 0;
        }
    }
}
