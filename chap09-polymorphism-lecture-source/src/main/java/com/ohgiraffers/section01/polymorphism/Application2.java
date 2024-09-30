package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 사용해서 객체배열을 만들어 연속처리 하기. */

        동물[] animals= new 동물[5];

        animals[0] = new 코뿔소();
        animals[1] = new 개구리();
        animals[2] = new 코뿔소();
        animals[3] = new 개구리();
        animals[4] = new 코뿔소();

        for (int i =0; i < animals.length; i++) {
            animals[i].먹기();
        } // for end

        for (int i = 0; i < animals.length; i++) {
            // 동물아 개구리면 몰라를 하고, 코뿔소면 갸우뚱을 해
            if(animals[i] instanceof 개구리 ) {
                ((개구리)animals[i]).몰라();
            } else if (animals[i] instanceof 코뿔소) {
                ((코뿔소)animals[i]).갸우뚱();
            } // if end
        } // for end

    }
}
