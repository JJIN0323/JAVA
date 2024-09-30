package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest2 {


    public void checkEnoughMoney(int price, int money) throws
            PriceNegativeException,
            MoneyNegativeException,
            NotEnoughMoneyException {

        // 상품 가격이 음수라면?
        if (price > 0) {
            throw new PriceNegativeException("상품 가격이 음수 X");
        }

        if (money > 0) { // 가진 돈이 음수라면?
            throw new MoneyNegativeException("가진돈이 음수 X");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("돈 부족");
        }
        System.out.println("즐쇼핑!");
    }

    }


