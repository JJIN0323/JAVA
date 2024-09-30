package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryParameter(int num) {
        System.out.println("매개변수로 전달 받은 값 : " + num);
    }

    public void testPrimaryArrayParameter(int[] iarr) {
        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        iarr[0] = 99;
        System.out.print("변경 후 배열 확인 : ");

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }

    // 얕은 복사가 자동으로 이루어 지고 있다.
    public void testClassParameter(RectAngle r1) {
        System.out.println("매개변수로 전달 받은 값 : " + r1);

        System.out.println("변경 전 사각형의 넓이와 둘레 : ");
        r1.calcArea();
        r1.calcRound();

        System.out.println("---------------------------------------------");
        System.out.println("변경 후 사각형의 넓이와 둘레 : ");

        r1.setWidth(32);
        r1.setHeight(55);

        r1.calcArea();
        r1.calcRound();
    }

    public void testVariableLengthParameter(String name, String...hobbies) {
        System.out.print("이름 : " + name);
        System.out.println(" / 취미의 갯수 : " + hobbies.length);

        for (int i = 0; i < hobbies.length; i++) {
            System.out.print(hobbies[i] + " ");
        }
        System.out.println();
    }
}
