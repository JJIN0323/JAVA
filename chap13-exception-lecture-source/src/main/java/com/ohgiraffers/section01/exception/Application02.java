package com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args) {

    /* 수업목표.  try-catch 블럭을 이용하여 예외처리를 할 수 있다. */

        /* 목차. 2. try-catch 블럭을 이용한 방법 (예외 발생하지 않음) */

        ExceptionTest et = new ExceptionTest();

        try {
            // try 구문에서 예외가 발생하면, catch 구문이 동작한다.
            // 마치 if-else 구문과 비슷하다.
            et.checkEnoughMoney(1000, 5000);
            System.out.println("상품 구매 가능");
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("상품 구매 불가");
        }
        System.out.println("프로그램 종료");
    }
}