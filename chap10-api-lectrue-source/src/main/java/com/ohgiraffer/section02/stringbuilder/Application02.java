package com.ohgiraffer.section02.stringbuilder;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder 의 특징을 확인해보자. */

        StringBuilder str1 = new StringBuilder("HelloWorld");

        /* delete() : 시작 인덱스와 종료 인덱스를 이용해서 제거
        *  deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나 제거
        *  ★ 둘 다 원본에 영향을 미친다 ! == 하나의 인스턴스 ★ */

        System.out.println(str1);
        System.out.println(str1.delete(1, 4));
        System.out.println(str1); // 위에 delete() 값과 동일.
        System.out.println(str1.deleteCharAt(2));
        System.out.println(str1); // 위에 deleteCharAt() 과 동일.

        /* insert() : 인자로 전달한 값을 문자열로 변환 후 지정한 위치에 추가
        *  reverse() : 문자열 인덱스 순번을 역순으로 재배치 */

        System.out.println(str1.insert(0, "test"));
        System.out.println(str1.reverse());
    }
}
