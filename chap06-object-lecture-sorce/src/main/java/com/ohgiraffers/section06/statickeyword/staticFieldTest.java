package com.ohgiraffers.section06.statickeyword;

public class staticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {

        /* 필기.
        *   static 필드에 접근하기 위해서는
        *   메소드와 마찬가지로 클래스명.필드명으로 접근한다.
        *   this.도 가능하지만 사용하지 않는 것이 좋다. */
        return staticFieldTest.staticCount;
    }

    // 두 필드의 값을 1씩 증가시키기 위한 메서드 생성
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        staticFieldTest.staticCount++;
    }

    public void setNonStaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }

    public static void setStaticCount(int staticCount) {
        staticFieldTest.staticCount = staticCount;
    }
}
