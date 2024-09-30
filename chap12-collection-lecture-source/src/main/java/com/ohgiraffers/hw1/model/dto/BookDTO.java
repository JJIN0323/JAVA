package com.ohgiraffers.hw1.model.dto;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDTO {
    Scanner sc= new Scanner(System.in);

    private String bNo;
    private String bTitle;
    private String bAuthor;
    private ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();

    public BookDTO() {
    }

    public String getbNo() {
        return bNo;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public ArrayList<BookDTO> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<BookDTO> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo='" + bNo + '\'' +
                ", bTitle='" + bTitle + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", bookList=" + bookList +
                ", sc=" + sc +
                '}';
    }
}
