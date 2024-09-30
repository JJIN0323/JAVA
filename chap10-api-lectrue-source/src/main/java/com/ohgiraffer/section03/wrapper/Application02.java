package com.ohgiraffer.section03.wrapper;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 파싱(Parsing)에 대해 이해할 수 있다.  */

        /* 파싱(Parsing) 이란
        *   문자열(String)을 값을 기본 자료형 값으로 변경하는 것. */

        /* 기본 자료형은 넘겨진 문자열을 스스로 바꿀 수 있는 기능이 없기에
        *   byte 의 Wrapper Class 인 Byte 가 가지고 있는 parseByte(); 메서드를
        *   사용해서 문자열 값을 Byte 형으로 변경 할 수 있다. */

        byte b = Byte.parseByte("1"); // 오토 언박싱
        short s = Short.parseShort("2");
        int i = Integer.parseInt("3");
        double d = Double.parseDouble("0.4");
        boolean bl = Boolean.parseBoolean("true");
        // char c = Character.parse // Character 는 parsing 을 제공하지 않는다. 하지만 CharAt() 이 있다.
        char c = "ABC".charAt(0);
        long l = Long.parseLong("5");
        float f = Float.parseFloat("6");

    }
}
