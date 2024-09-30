package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해할 수 있다. */

        /* 와일드카드(WildCard)
        *   제네릭 클래스 타입의 객체를 메서드의 매개변수로 받을 때
        *   그 객체의 타입 변수를 제한할 수 있다.
        *   <> 연산자
        *   <?> : 제한 없음 (모두 가능)
        *   <? extends Type> : 와일드카드 상한 제한
        *   == 타입과 타입의 후손을 이용한 인스턴스만 인자로 사용 가능.
        *   <? super Type> : 와일드 카드 하한 제한
        *   == 타입과 타입의 부모를 이용한 인스턴스만 인자로 사용 가능. */

        WildCardFarm wildCardFarm = new WildCardFarm();

        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny()));

        /* Bunny 이거나 Bunny 의 후손 토끼농장만 매개변수로
        *  사용이 가능하고 상위타입인 Rabbit 은 매개변수로 사용할 수 없다. */

        //wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny()));

    }
}
