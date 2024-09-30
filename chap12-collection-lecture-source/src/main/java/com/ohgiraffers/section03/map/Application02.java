package com.ohgiraffers.section03.map;

import java.io.*;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. Properties 에 대해 이해할 수 있다. */

        /* 필기.
        *   Properties 란?
        *   HashMap 을 구현하여 사용방법이 거의 유사하지만
        *   차별점은 Key 와 value 모두 문자열만 사용 할 수 있다는 것이다.
        *   사용하는 예시는 대부분 설정 관련 파일의 값을 읽어
        *   어플리케이션에 적용하기 위해 사용한다. */

        // Properties 는 값의 의미를 가졌다.
        Properties prop = new Properties(); // String 으로 제네릭<> 고정돼있음.

        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost/menu");
        prop.setProperty("username", "user");
        prop.setProperty("password", "pass");

        // 예외처리 -> 파일의 입력과 출력에 대한 예외처리를 강제화 했다.
        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("prop = " + prop); // 지 멋대로 저장함.


        /* 목차. 1. Output 으로 파일을 내보냈다.
        *            그러면 이제, 다시 내보낸 파일을 읽어오자. */

        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
            // list() 메서드 사용 -> Properties 의 모든 키와 값 목록을 내보내기
            prop2.list(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("prop2 = " + prop2);

    }
}
