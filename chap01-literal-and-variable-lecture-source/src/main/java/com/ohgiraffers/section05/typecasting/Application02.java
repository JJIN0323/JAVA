package com.ohgiraffers.section05.typecasting;

public class Application02 {
    public static void main(String[] args) {

       /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */

       /* 필기.
       *    강제형변환 (명시적 형변환)
       *    바꾸려는 자료형으로 캐스트 연산자 =>()를 이용하여 형변환 한다.
       *    EX] (바꿀 자료형) 값; = int inum = (int) lnum; */

        /* 필기2.
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        *   1. 강제 형변환의 규칙
        *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요하다.
        *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        *   1-3. 문장형을 int 미만 크기의 변수를 저장할 때 강제 형변환 필요하다.
        *   1-4. 논리형은 강제 형변환 규칙도 제외된다. */

        /* 목차. 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 */
        /* 목차. 1-1-1. 정수 끼리의 강제 형변환 */

        long lnum = 8;
        //int inum = lnum; // 빨간색 밑줄을 그어, 데이터 손실 가능성을 컴파일러가 알려준다.
        int inum = (int) lnum;
        short snum = (short) lnum;
        byte bnum = (byte) lnum;

        /* 목차. 1-2. 실수를 정수로 변경 시 */
        float fnum = 4.0f; // 4byte
        //long lum2 = fnumf;

        // 소수점이 날아가기 때문에 큰 공간이라고 해도 강제 형변환이 필요하다.
        long lnum2 = (long) fnum;

        /* 목차. 1-3. 문자형을 int 미만의 크기의 변수에 저장 할 때 강제 형변환 */
        // Sign bit(부호 결정 공간)도 값을 저장 할 수 있는 공간으로 사용한다. (2의 7승도 쓴다.)
        char ch = 'a';
        //short snum2 = ch; // 같은 2byte인데 왜 강제로 해야할까? -> 문자는 음수가 없기 때문에.

        /* 목차. 1-4. 논리는 application 한 자동형변환과 같이 강제 형변환 규칙도 제외된다. = 하지맛! */

    }
}
