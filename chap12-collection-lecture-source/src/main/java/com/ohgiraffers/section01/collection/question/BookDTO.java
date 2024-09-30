package com.ohgiraffers.section01.collection.question;

public class BookDTO {

    private int bookNum;
    private String bookName;
    private String bookMan;
    private int bookPrice;

    public BookDTO() {
    }

    public BookDTO(int bookNum, String bookName, String bookMan, int bookPrice) {
        this.bookNum = bookNum;
        this.bookName = bookName;
        this.bookMan = bookMan;
        this.bookPrice = bookPrice;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookMan() {
        return bookMan;
    }

    public void setBookMan(String bookMan) {
        this.bookMan = bookMan;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookNum" + bookNum +
                ", bookName = '" + bookName + '\'' +
                ", bookMan = '" + bookMan + '\'' +
                ", bookPrice='" + bookPrice +
                '}';
    }
}