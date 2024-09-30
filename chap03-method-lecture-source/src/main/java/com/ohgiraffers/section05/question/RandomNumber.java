package com.ohgiraffers.section05.question;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("최소값 : ");
        int randomNumberMin = sc.nextInt();
        System.out.print("최대값 : ");
        int randomNumberMax = sc.nextInt();
        System.out.println("랜덤 값 : " + (int)(Math.random() * ( randomNumberMax - randomNumberMin + 1) + randomNumberMin));

        System.out.println("-----------------------------------------");

        System.out.println(randomString());

        System.out.println("-----------------------------------------");
    }

    public static String randomString() {

        Scanner sc = new Scanner(System.in);

        System.out.print("인자의 길이 : ");
        int leftLimit = 65;
        int rightLimit = 90;
        int targetStringLength = sc.nextInt();
        Random random = new Random();
        String getString = random.ints(targetStringLength, leftLimit, rightLimit + 1)
                //.filter(i -> (i <= 1 || i >= 65)) // Stream .filter // 내가 원하는 값을 고를 수 있음.
                //.limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append) // 변수 값 여러개 가능 -
                .toString();

        return getString;
    }
}
