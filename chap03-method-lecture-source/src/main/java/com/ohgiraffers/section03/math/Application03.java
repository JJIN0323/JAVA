package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {
    public static void main(String[] args) {


        /* 수업목표. java.util.Random 클래스를 사용해서 난수 발생 */
        Random random = new Random(); // static이 없으므로, non-static 메서드이다.

        /* 필기.
         *   random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         *   random.nextInt 는 형변환을 하지 않아도 알아서 해줌으로 편리하다. */

        int randomNumber = random.nextInt(10);
        System.out.println("랜덤 숫자 구하기 : " + randomNumber);

        // 1 ~ 10
        int randomNumber1 = random.nextInt(10) + 1;
        System.out.println("랜덤 숫자 구하기 : " + randomNumber1);

        // 10 ~ 15
        int randomNumber2 = random.nextInt(6) + 10;
        System.out.println("랜덤 숫자 구하기 : " + randomNumber2);

        // -127 ~128
        int randomNumber3 = random.nextInt(256) + -128;
        System.out.println("랜덤 숫자 구하기 : " + randomNumber3);

    }
}
