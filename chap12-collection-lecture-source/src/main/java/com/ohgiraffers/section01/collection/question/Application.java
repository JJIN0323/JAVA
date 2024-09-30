package com.ohgiraffers.section01.collection.question;

import java.util.*;
public class Application {
    public static void main(String[] args) {

        // 1. ArrayList를 만들고 4권의 책을 넣음
        List<BookDTO> books = new ArrayList<>();

        books.add(new BookDTO(1, "책1", "저1", 100));
        books.add(new BookDTO(2, "책2", "저2", 200));
        books.add(new BookDTO(3, "책3", "저3", 300));
        books.add(new BookDTO(4, "책4", "저4", 400));

        // 2. 출력하는 구문 (전통적인 for문)
        System.out.println("책 목록 (전통적인 for문):");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("i " + books.get(i));
        }

        // 2. 출력하는 구문 (향상된 for문)
        System.out.println("\n책 목록 (향상된 for문):");
        for (Object book : books) {
            System.out.println(book);
        }

        // 3. Scanner 객체를 사용해 입력한 값을 ArrayList에 넣고 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n책이름,저자,가격 순서로 입력해 주세요");

        BookDTO newbook = new BookDTO();
        newbook.setBookNum(2);
        newbook.setBookName(scanner.nextLine());
        newbook.setBookMan(scanner.nextLine());
        newbook.setBookPrice(scanner.nextInt());

        books.add(1, newbook);

        // 추가된 책 목록 출력
        //System.out.println("\n최종 책 목록:");
        for (Object book : books) {
            System.out.println(book);
        }
    }
}


