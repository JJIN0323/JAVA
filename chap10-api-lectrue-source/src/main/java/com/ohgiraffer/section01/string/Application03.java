package com.ohgiraffer.section01.string;

import java.util.StringTokenizer;

public class Application03 {
    public static void main(String[] args) {
        
        /* 수업목표. 문자열을 특정 문자로 분리할 수 있다. */

        /* split() :  정규 표현식을 이용해서 문자열을 분리한다.
        *             공백 문자열도 포함한다.
        *             정규표현식은 속도가 느리다는 단점을 가지고 있고,
        *             자바에서는 다루지 않고 자바스크립트에서 간단히 볼 예정이다.
        *
        *  StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        *                        공백 문자열을 무시할 수 있다.
        *                        정규표현식을 사용하지 않아 split() 보다 속도면으로 빠르다.
        *                        구분자를 생략하는 경우에는 공백을 기준으로 구분을 한다. */

        // 사번/이름/주소/부서
        String employee1 = "100/홍길동/서울/개발부";
        String employee2 = "200/홍길순/영업부"; // 주소 없음
        String employee3 = "300/홍길자/경기/"; // 부서 없음

        String[] emp1Arr = employee1.split("/");
        String[] emp2Arr = employee2.split("/");
        String[] emp3Arr = employee3.split("/");

        for(int i = 0; i < emp1Arr.length; i++) {
            System.out.print(emp1Arr[i] + " ");
        }

        for(int i = 0; i < emp2Arr.length; i++) {
            System.out.print(emp3Arr[i] + " ");
        }

        for(int i = 0; i < emp3Arr.length; i++) {
            System.out.print(emp3Arr[i] + " ");
        }

        System.out.println();

        // 전달인자 (분리하고 싶은 문자열, 구분 기호)
        StringTokenizer str1 = new StringTokenizer(employee1, "/");
        StringTokenizer str2 = new StringTokenizer(employee2, "/");
        StringTokenizer str3 = new StringTokenizer(employee3, "/");

        // StringTokenizer 는 index 체계가 아니기 때문에 for 문 사용 불가능.
        // 구분자를 생략하는 경우 기본 구분자는 공백이다.
        while (str1.hasMoreTokens()) {
            System.out.println("While(1) : " + str1.nextToken());
        }

        while (str2.hasMoreTokens()) {
            System.out.println("While(2) : " + str2.nextToken());
        }

        while (str3.hasMoreTokens()) {
            System.out.println("While(3) : " + str3.nextToken());
        }

    }
}
