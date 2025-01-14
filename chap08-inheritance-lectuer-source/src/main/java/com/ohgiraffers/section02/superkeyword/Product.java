package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Product {

    private String code;                              // 상품코드
    private String brand;                             // 제조사
    private String name;                             // 상품명
    private int price;                                  // 가격
    private LocalDateTime manufacturingDate; // 제조일자

    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출-");
    }

    // 모든 값을 초기화.
    public Product(String code, String brand, String name, int price, LocalDateTime manufacturingDate) {

        /* 필기.
        *   Product 클래스는 아무런 클래스도 상속받고 있지 않지만,
        *   super()이 호출되고 있다.
        *   이는. 모든 클래스는 우리가 명시적으로 작성하고 있지 않지만
        *           Object 라는 클래스를 상속 받고 있다는 뜻이다. */
        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 클래스의 모든 필드를 초기화하는 생성자 호출-");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDateTime manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInfo() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
