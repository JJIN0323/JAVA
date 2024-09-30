package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.section01.collection.question.BookDTO;

import java.util.List;

public class BookManager {

    private List<BookDTO> bookList;

    public void addBook(BookDTO bookDTO) {
        System.out.println(bookDTO);
        System.out.println("입력하신 " + bookDTO.getBookName() + "을 추가합니다");
        bookList.add(bookDTO);
    }

    public void deleteBook(int bNo) {
        System.out.println("bookNo = " + bNo);
        bookList.remove(bNo - 1);
        System.out.println(bNo + "번 책을 삭제했습니다.");
    }

    public String searchBook(String bTitle) {
        boolean isSearch = false;

        for (BookDTO book : bookList) {

            if (bTitle.equals(book.getBookName())) {
                System.out.println(book);
                isSearch = true;
            }
        }
        if (!isSearch) {
            System.out.println("조회 할 도서가 없습니다.");
        }
        return "";
    }

    public void displayAll () {
        if (bookList.size() == 0) {
            System.out.println("출력 결과가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }

    public void printBookList() {

        for(BookDTO book : bookList) {
            System.out.println(book);
        }

    }
}
