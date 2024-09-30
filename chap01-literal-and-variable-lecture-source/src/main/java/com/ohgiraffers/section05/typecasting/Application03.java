package com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 자동 형변환과 강제 형변환을 이용해서 서로 다른 자료형 끼리 계산. */

        /* 필기. 자동 형변환과 강제 형변환을 이용한 다른 자료형 끼리의 연산
        *           다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 되어 연산이 된다. */

        int inum = 10;
        long lnum = 100;

        /* 목차. 1. 두 수의 연산 결과를 int 형으로 반환 후 int 자료형 변수에 리턴 */

        //int isum = inum + lnum; // 연산의 결과가 자동형변환 되어 long이 된다.
                                                   // 그러면, int와 long이 충돌되기 때문에 오류가 발생한다.
                                                   // 자동 형변환이 되므로, 더 큰쪽으로 옮겨가게 된다.

        int isum = (int) (inum + lnum);
        int isum2 = inum + (int) lnum;
        long isum3 = inum + lnum;

    }
}
