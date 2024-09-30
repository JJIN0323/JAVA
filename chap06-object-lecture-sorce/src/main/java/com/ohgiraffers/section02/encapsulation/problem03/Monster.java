package com.ohgiraffers.section02.encapsulation.problem03;

public class Monster {

    /* 목차. 1. NAME / HP */
//    String name;
//    int hp;

    /* 목차. 2. 이름이 아니라 종류로 바꾸래요. */

    String kinds;
    int hp;


public void setName(String name) {
//    this.name = name;
}

public void setKinds(String kinds) {
    this.kinds = kinds;
}

public void setHp(int hp) {
    if (hp > 0) {
        this.hp = hp;
    } else {
        this.hp = 0;
    }
}
// 이 메서드는 몬스터의 정보 (이름 / 체력 )을 알려주는 기능.
public String getInfo() {
//    return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
}

}