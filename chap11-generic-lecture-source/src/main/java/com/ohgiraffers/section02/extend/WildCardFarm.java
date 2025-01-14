package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    /* RabbitFarm<> 객체를 전달 받아 */
    public void anyType (RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    /* 토끼농장의 토끼가 Bunny 이거나 그의 후손 타입으로 만들어진
    *  토끼농장만 매개변수로 사용 가능. */
    public void extendsType (RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    public void superType (RabbitFarm<? super DrunkenBunny> farm) {
        farm.getAnimal().cry();
    }
}
