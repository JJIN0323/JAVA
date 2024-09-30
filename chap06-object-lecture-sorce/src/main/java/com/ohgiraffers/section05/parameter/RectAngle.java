package com.ohgiraffers.section05.parameter;

public class RectAngle {

    private double width;   // 너비
    private  double height; // 높이

    // Alt + Insert 로 매개변수가 있는 생성자를 작성하면,
    // 기본생성자는 자동으로 만들어지지 않는다.

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void calcArea() {
        double area = width * height; // 시렁
        System.out.println("이 사각형의 높이는 " + area + "mm 입니다.");
    }

    public void calcRound() {
        double round = (width * height) * 2;
        System.out.println("이 사각형의 둘레는 " + round + "mm 입니다.");
    }
}
