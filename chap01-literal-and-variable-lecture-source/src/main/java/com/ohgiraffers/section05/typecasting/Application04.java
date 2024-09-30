package com.ohgiraffers.section05.typecasting;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 형변환 시 주의점을 이해하고 사용할 수 있다. (데이터 손실!) */

        /* 필기.
        *       형변환시 주의점.
        *       데이터 손실 !!!!!!! */

        /* 목차. 1. 의도하지 않은 데이터 손실 */

        int inum = 290; // 1byte = 128~127
        byte bnum = (byte) inum;

        System.out.println("bnum = " + bnum);

        /* 목차. 2. 의도한 데이터 손실 */
        // 실수 형태를 정수형태로 바꾸면서 의도적으로, 소숫점을 날린다.

        double height = 172.5;

        int height1 = (int) height;

        System.out.println("height1 = " + height1);

        // byte와  short의 자료형 계산 값은 무조건 int로 처리!

        // 실습문제

        double ko = 80.5;
        double mt = 50.6;
        double en = 70.8;
        double sum = ko + mt + en;

        // 합계 (소숫점 제외한 정수)
        System.out.println("총점 1 = " + (int) (ko + mt + en));
        System.out.println("총점 2 = " + (int) (sum));
        // 평균 (소숫점 제외한 정수)
        System.out.println("평균 1 = " + (int) ((ko + mt + en) / 3) );
        System.out.println("평균 2 = " + (int) (sum / 3));
    }
}
