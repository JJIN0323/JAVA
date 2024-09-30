package com.ohgiraffer.section03.wrapper;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 기본 자료형 값을 문자열로 변경할 수 있다. */

        /* 필기.
        *   1. valueOf() : 기본 자료형 값을 Wrapper 클래스 타입으로 변환
        *   2. toString() : 필드 값을 문자열로 반환하는 메서드
        *   3. 문자열 합치기 */

        String b = Byte.valueOf((byte)1).toString(); // byte 1을 String 화 시킨다.
        Byte.valueOf("1");

        /* String 클래스에서 제공하는 valueOf()를 사용할 수 있다. */
        
        String str = String.valueOf(8);

        /* 문자열 합치기를 이용해서 String 타입으로 변환할 수 있다. */
        String str2 = 123 + ""; // 공백도 문자열이기 때문에-


    }
}
