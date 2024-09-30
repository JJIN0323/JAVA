package com.ohgiraffers.section03.math;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. RANDOM()을 사용해서 사용자 지정 범위의 난수 발생 시키기 */

        /* 필기.
         *   난수의 활용
         *   Math.random()을 이용하게 되면 0부터 1전까지의 실수값을 반환해준다.
         *   필요에 따라서, 실수가 아닌 정수를 출력 할 수 있고,
         *   예를들어 8~20사이의 난수 등등을 만들 수 있다. */

        /* 필기.
         *   원하는 범위의 난수를 구하는 공식
         *   (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
         *   (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */

        /* 목차. 1. 0~9까지의 난수 발생 */

        int random1 = (int) (Math.random() * 10) + 0;
        System.out.println("랜덤 숫자 구하기 : " + random1);

        // 1 ~10
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("랜덤 숫자 구하기 : " + random2);

        // 10 ~ 15
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("랜덤 숫자 구하기 : " + random3);

        // -128 ~ 127
        int random4 = (int) (Math.random() * 256) + -128; //-128은 시작 값 / 256은 구하려는 값 (128+127+1)
        System.out.println("랜덤 숫자 구하기 : " + random4);

    }

}