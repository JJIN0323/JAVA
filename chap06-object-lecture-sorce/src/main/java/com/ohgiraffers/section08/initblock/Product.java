package com.ohgiraffers.section08.initblock;

public class Product {

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        System.out.println("매개변수가 있는 생성자 호출-");
    }

    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand =" + Product.brand +
                '}';
    }

    /* 목차. 1. 필드를 초기화 하지 않으면 JVM 이 정한 기본값으로 객체가 만들어진다. */
//    private String name;            // 제품이름
//    private int price;                 // 제품가격
//    private static String brand;    // 제품상표

    /* 목차. 2. 명시적 초기화 */
    private String name = "컴퓨터";
    private int price = 5000;
    private static String brand = "SAMSUNG";

    /* 목차. 3. 인스턴스 초기화 블럭 */
    {
        name = "노트북";
        price = 10000;
        brand = "LG";
        System.out.println("인스턴스 블럭 초기화-");
    }

    static {
        /* 필기.
        *   static 초기화 블럭은 non-static 필드를 초기화 할 수 없다.
        *   static 초기화 블럭은 클래스 로드 시에 동작하기 때문에
        *   동작 시점에는 인스턴스가 존재 할 수 없어
        *   인스턴스 변수는 초기화 할 수 없다. */

        //name = "목민심서";
        //price = 10000; // name 과 price 는 static 이 아니기 때문에 초기화 불가능.
        brand = "정약용";
        System.out.println("정적 초기화 블럭-");
    }

    public Product() {
        System.out.println("기본 생성자 동작 ~");
    }
    
}
