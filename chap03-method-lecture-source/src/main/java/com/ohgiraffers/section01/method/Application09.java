package com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메서드를 호출 할 수 있다. */

        /* 필기.
         *       우리는 Application 에서 2개의 정수를 전달 할 것이고,
         *       calculator 클래스는 2개의 정수를 전달 받아
         *       최소값과 최대값을 구하는 메서드(기능) 을 만들것이다.
         *       실행 후 Application 에게 2개의 정수 중 큰 값과 작은 값이 무엇인지 알려줄 것이다. */

        int first = 5;
        int second = 8;

        /* non-static method 호출 방식 ( static 이 붙지 않은것을 non-static 이라고 한다.) */
        calculator cal = new calculator();
        int min = cal.minNum(first, second);
        System.out.println("min = " + min);

        // static method 호출 방식

        // static method 도 non-static 메서드처럼 호출은 가능하지만, 권장하지 않는다.
        // 원래 방식이 있는데 굳이? 왜 ?
        // 이미 메모리에 로딩이 되어 있는 static 메서드는 여러 객체가 공유하게 된다.
        // new 키워드로 접근을 하게 된다면, 공유된 값에 예상치 못 한 동작을 유발할 수 있기 때문에
        // 사용을 제한해 달라는 컴퓨터의 주의 문구다.

        int max2 = cal.maxNum(26,21);
        int max = calculator.maxNum(first, second);
        System.out.println("max = " + max);

        // 선생님 꿀 팁 ( Alt + Enter )
        //test();

    }
}
