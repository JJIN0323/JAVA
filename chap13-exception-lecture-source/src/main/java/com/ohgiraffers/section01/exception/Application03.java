package com.ohgiraffers.section01.exception;

public class Application03 {
        public static void main(String[] args) {

            /* 목차. 3. try-catch 블럭을 이용한 방법 (예외 발생함.) */

            ExceptionTest et = new ExceptionTest();

            try {
                // try 구문에서 예외가 발생하면, catch 구문이 동작한다.
                // 마치 if-else 구문과 비슷하다.

                // 상품의 가격이 더 높게 만든다.
                et.checkEnoughMoney(8000, 5000);
                System.out.println("상품 구매 가능");
            } catch (Exception event) {
                //throw new RuntimeException(event);
                System.out.println("상품 구매 불가");
            }
            System.out.println("프로그램 종료");
        }
}
