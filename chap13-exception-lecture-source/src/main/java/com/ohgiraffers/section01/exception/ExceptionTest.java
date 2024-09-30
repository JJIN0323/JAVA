package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("price = " + price);
        System.out.println("money = " + money);

        if (money >= price) {
            System.out.println("구매 가능");
        } else {
            throw new Exception();
        } /* 강제로 예외를 발생시키는 방법
             throw new  예외클래스명(); */

        System.out.println("즐쇼핑~");
    }

}
