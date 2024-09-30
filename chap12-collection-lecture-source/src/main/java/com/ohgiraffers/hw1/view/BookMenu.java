package com.ohgiraffers.hw1.view;

public void BookMenu() {

    while (true) {
        System.out.println("Welcome to the Library");
        System.out.println("[1] 도서 등록\t [2] 도서 정렬\t [3] 도서 삭제\t [4] 도서 조회\t [5] 도서 출력\t[6] 종료");
        String userInput = sc.nextLine();

        switch (userInput) {
            case ("1"):
                insertBook();
                break;
            case ("2"):
                selectAll();
                break;
            case ("3"):
                deletebook();
                break;
            case ("4"):
                selectOne();
                break;
            case ("5"):
                checkBook();
                break;
            case ("6"):
                System.out.println("프로그램 종료");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                break;
        }
    } // end while

    // 책 삭제
    public void deletebook() {
        while (true) {
            System.out.println("삭제 할 책의 번호를 입력해주세요");
            String temp = sc.nextLine();
            int cnt = 0;
            for (int i = 0; i < bookList.size(); i++) {
                if (temp.equals(bookList.get(i).getbNo())) {
                    bookList.remove(i);
                    cnt++;
                    System.out.println("도서 삭제 완료");
                    break;
                }
            } // end for
            if (cnt == 0) {
                System.out.println("해당 도서가 존재하지 않습니다. 도서 번호를 다시 입력하세요.");
            } else {
                break;// 메인으로
            }
        } // end while

    } // end delete book


}

