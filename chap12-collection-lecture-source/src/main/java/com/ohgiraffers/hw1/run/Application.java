package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.view.BookMenu;

public class Application {
    public static void main(String[] args) {

        BookMenu manager = new BookMenu();
        manager.mainMenu();

        System.out.println("프로그램 종료~");

    }
}

