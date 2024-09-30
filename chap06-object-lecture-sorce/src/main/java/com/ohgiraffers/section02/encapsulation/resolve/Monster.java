package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {

    /* 접근제한자.
    *   클래스 혹은, 클래스의 멤버(변수 / 메소드)에 참조연산자( . )로
    *   접근할 수 있는 범위를 제한하기 위한 키워드이다.
    * 
    *   1. public : 모든 패키지에서 접근 가능
    *   2. protected : 동일 패키지에서 접근 가능 (단, 상속관계에 있는 경우 다른 패키지에서 접근 가능)
    *   3. private : 해당 클래스 내부에서만 접근 가능.
    *   4. default : 동일 패키지에서만 접근 가능. (쓰지 않는게  default) */

    private String kinds;
    private int hp;

    // 위와 같은 방식으로 막아버리면 됨.


void setName(String name) { // 이게 default !!!!!!!!!
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
    return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
}

}