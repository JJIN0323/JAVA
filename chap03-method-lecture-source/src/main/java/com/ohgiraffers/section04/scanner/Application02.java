package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. Scanner 의 nextLine(), next()의 차이 */

        /* 필기.
        *   nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다. (공백문자 포함 = 띄어쓰기 포함)
        *   next() : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환 (공백문자 포함하지 않음 = 띄어쓰기 X) */

        /* 목차. 1. Scanner 객체 생성 = 사용할 준비 */
        Scanner sc = new Scanner((System.in));

        /* 목차. 2. 문자열 입력 */
        // nextLine() 사용
        System.out.print("인사말을 입력해주세요 : ");
        String hi = sc.nextLine(); // 리터럴
        System.out.println(hi);

        // next() 사용
        System.out.print("인사말을 입력해주세요 : ");
        String nextHi = sc.next(); // 리터럴
        System.out.println(nextHi); // "Hello world"를 썼는데, 출력값은 Hello 이다.

        //
//
    }
}
