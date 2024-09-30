package com.ohgiraffer.section04.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스들에 포멧팅을 적용해서 출력할 수 있다. */

        String timeNow = "10:19:10";
        String dateNow = "2024-09-13";

        // parsing 사용
        LocalTime localTime = LocalTime.parse(timeNow);
        System.out.println("localTime = " + localTime);

        LocalDate localDate = LocalDate.parse(dateNow);
        System.out.println("localDate = " + localDate);

        String timeNow2 = "10-11-10";
        String dateNow2 = "230323";
        String dateNow3 = "20230323";
        LocalTime localTime1 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate localDate1 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        LocalDate localDate2 = LocalDate.parse(dateNow3, DateTimeFormatter.ofPattern("yyyyMMdd"));

        System.out.println("localTime1 = " + localTime1);
        System.out.println("localDate1 = " + localDate1);
        System.out.println("localDate1 = " + localDate2);

    }
}
