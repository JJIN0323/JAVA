package com.ohgiraffers.section02.extend;

/* Rabbit Farm 은 토끼들을 위한 농장. */
public class RabbitFarm<Type extends Rabbit> {

    /* <Type extends Rabbit> 의 의미
    *   타입변수 <Type>가 어떤 녀석이 될 지 모른다.
    *   하지만,  extends Rabbit 이라고 설정을 하게 되면
    *   토끼 이거나, 토끼를 상속받는 녀석은 다 가능하다. */

    private Type animal;

    public RabbitFarm() {} // 기본생성자를 명시적으로 작성

    // 모둔 필드를 초기화하는 생성자
    public RabbitFarm(Type animal) {
        this.animal = animal;
    }

    public Type getAnimal() {
        return animal;
    }

    public void setAnimal(Type animal) {
        this.animal = animal;
    }
}
