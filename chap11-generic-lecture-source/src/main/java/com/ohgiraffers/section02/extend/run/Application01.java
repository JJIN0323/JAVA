package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. extends 키워드를 사용해서 특정 타입만 사용할 수 있도록
        *               범위를 제한 할 수 있다.*/

        // animal 은 rabbit 이거나 rabbit 의 후손이 아니다.
        //RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        // mammal 은 rabbit 이거나 rabbit 과 관련이 없다.
        //RabbitFarm<Mammal> mam1 = new RabbitFarm<Mammal>();

        /* extends 키워드로 Rabbit 후손들은 인스턴스 생성이 가능하다. */
        RabbitFarm<Rabbit> farm3 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>();

        farm3.setAnimal(new Rabbit());
        farm3.getAnimal().cry();

        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();

        farm5.setAnimal(new DrunkenBunny());
        farm5.getAnimal().cry();
    }
}
