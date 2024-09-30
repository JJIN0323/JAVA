package com.ohgiraffer.section04.time;

import java.time.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지에서 제고하는 클래들의 사용 문법을 이해할 수 있다. */

        /* time 패키지는 JDK 1.8 버전에서 추가 되었다.
        *   Date, Calendar 가 가지고 있는 한계점을 극복하기 위해 나왔다.
        *   LocalTime, LocalDate, LocalDateTime, ZonedDateTime 등 대표적인 클래스가 있다. */

        LocalTime timeNow = LocalTime.now(); // now 는 static 이기 때문에 이탤릭체로 누워있음.
        System.out.println("timeNow = " + timeNow);

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2023, 3, 23); // 조작가능.
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        // Local 들은 서버의 windows 기준이므로, 사용시 유의 해야한다.

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(dateOf, timeNow, ZoneId.of("America/Los_Angeles"));
        System.out.println("zonedDateTime1= " + zonedDateTime1);

    }
}
