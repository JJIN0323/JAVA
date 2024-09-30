package com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 자동 형변환 규칙에 대해 이해 할 수 있다. */
        
        /* 필기. 
        *   데이터 형변환 
        *   데이터 형변환이 필요한 이유? 
        *   - 자바에서 다른 타입끼리의 연산은 모두 같은 타입인 경우 실행 가능
        *   -  예) int - int / char - car 등등...
        *   - *즉, 같은 데이터 타입끼리만 연산이 가능하다. */
        
        /*  필기. 
        *   형변환의 종류와 규칙
        *   1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 변환
        *       1-1. 작은 자료형에서 큰 자료형으로는 자동으로 형변환 된다.
        *       1-2. 정수는 실수로 자동 형변환 된다.
        *       1-3. 문자형은 int 형으로 자동 형변환 된다.
        *       1-4. 논리형은 형변환 규칙에서 제외된다.
        *   2. 강제형변환 (명시적 형변환) : 형변환 연산자 (예) long / int 를 이용한 강제적으로 수행하는 변환
        *       2-1. 자동이 안된다 ? -> 강제로 해야한다.
        * */

        /* 목차. 1. 자동형변환  규칙 테스트
        *   1-1. 작은 자료형에서 큰 자료형으로는 자동형변환 된다.
        *   하지만, 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우
        *   데이터 유실은 발생하지 않기 때문에 컴파일러가 자동으로 해준다. */

        /* 목차. 1-1-1. 정수끼리의 자동 형변환 */

        byte bnum = 1; // 1
        short snum = bnum; // 2
        int inum = snum; // 4
        long lnum = inum; // 8

        /* 연산시에도 큰 쪽 자료형에 맞춰 계산해준다. */
        int num1 = 10;
        long num2 =20;

        // 같은 연산자끼리만 계산이 가능하므로, 이것은 계산 불가 오류가 뜬다.
        // 자동으로 큰 쪽인 long으로 변경 후, 계산하기 때문에 int 형 변수 공간에 값을 담을 수 없다.

        // int result = num1 + num2 // 같은 연산자끼리만 계산이 가능하므로, 이것은 계산 불가 오류가 뜬다.

        long result1 = num1 + num2;
        // int + long은 서로 다른 자료형이라 데이터 소닐이 발생하지 않는 int -> long 으로
        // 변환을 자동으로 수행 한 후 연산을 진행한다.

        /* 목차. 1-1-2. 실수 끼리의 자동 형변환 */

        float fnum = 4.0f;
        double dnum = fnum;

        // float result2 = fnum + dnum;

        /* 목차. 1-2. 정수는 실수로 자동 형변환이 된다. */
        /* 필기. 정수에서 실수로 변환하는것은 문제가 없으나, 실수에서 정수로 가게되면 소수점이 없어진다. */

        /* 목차. 1-3. 문자형은 int형으로 자동 형변환 된다. */

        char ch = '옹';
        int charNum = ch;

        System.out.println("charNum = " + charNum);

        /* 목차. 1-4. 논리형은 형변환 규칙에서 제외된다. */
        boolean isTrue = true;  // 1
//        byte b = isTrue;
//        short s = isTrue;
//       double d = isTrue;
//       char c = isTrue;
    }
}
