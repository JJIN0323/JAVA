package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanTwoToNine() {
        // 2에서 9까지의 구구단 모두 출력.
        // dan 2~9까지
        // su 1~9까지

        for (int dan = 2; dan <= 9; dan++) {
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            // 한줄 띄우기
            System.out.println();
        }
    }

    public void upgradeGugudanTwoToNine() {
        for (int dan = 2; dan <= 9; dan++) {
            printGugudanOf(dan); // 전달 인자
        }
    }

    // 해당하는 클래스 내부에서만 사용 가능한 private.
    private void printGugudanOf(int dan) { // int dan은 매개변수

        // 어떤 값을 전달 받는 지 확인하는 출력문
        System.out.println("dan = " + dan);

        for (int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
        // 한줄 띄우기
        System.out.println();
    }

    public void printStarInuptRowTimes() {
        /* 필기.
        *   키보드로 정수를 입력 받아 해당 정수만큼
        *   한 행에 '*'을 5개씩 출력하는 구문을 만들자 */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력해주세요 : ");
        int star = sc.nextInt();
//
        for (int i = 1; i <= star; i++) {
//            for (int j = 1; j <= 5; j++) {
//               System.out.print("*");
//            }

            printStart(5);
            System.out.println(); // 한 줄 띄우기
        }
   }
    private void printStart(int times) {
        for (int i = 1; i <=times; i++) {
            System.out.print("*");
        }
    }
}
