package com.ohgiraffers.question;

public class Application01 {
    public static void main(String[] args) {

        char ch1 = 'A';

        //키보드로 문자하나를 입력받아, 그 문자의 유니코드를 출력되게 함

        System.out.println("유니코드 : " + (int) ch1);

        System.out.println("-----------------------------------------------");

        double num1 = 75;
        double num2 = 21;
        int result = 0;

        // 코드를 작성해주세요.

        result = (int) (num1 - num2);

        // result = num1 - num2 가 되도록 형변환해서 작성하기.

        System.out.println("result : " + result);

        System.out.println("-----------------------------------------------");

        /* 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형 .
            (data type) ? regNo 을 선택해야 할까 라는 이름의 변수를 선언하고 자신의 주민등록번호로
            초기화 하는 한 줄의 코드를 적으시오. (초기화 한다 = 값을 입력한다) */

        int regNo = 1234567891;
        System.out.println("regNo : " + regNo);

        /* 다음의 문장에서 리터럴 변수 상수 키워드를 적으시오 , , , .
            int i = 100;
            long l =100L;
            final float PI = 3.14f;

            상수 :
            변수 :
            리터럴 : */

        int i = 100;
        long l =100L;
        final float PI = 3.14f;

        System.out.println("상수 : " + PI);
        System.out.println("변수 : " + i);
        System.out.println("리터럴 : " + "정수형 long");

        /* 다음 중 형변환을 생략할 수 있는 것은 모두 고르시오 ? ( )
            byte b = 10;
            char ch = 'A';
            int i = 100;
            long l = 1000L;
            a. b = (byte)i;
            b. ch = (char)b;
            c. short s = (short)ch;
            d. float f = (float)l;
            e. i = (int)ch; */

        byte b = 10;
        char ch = 'A';
        int ib = 100;
        long lb = 1000L;

        System.out.println(b);
        System.out.println(ch);
        System.out.println(ib);
        System.out.println(lb);

        /* int x = 2;
            int y = 5;
            char c = 'A'; // 'A' 65 의 문자코드는 */

        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println(c++);
        //System.out.println(++c);  이것의 결과값은 66이다.



    }
}
