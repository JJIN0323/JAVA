package com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {

        /* 수업목표. static 메서드를 호출할 수 있다. */
        /* 필기.
        *       우리가 지금 만들고있는 메서드는 public 과 void or 자료형 사이에
        *       static 키워드가 붙은 메서드를 만들어서 호출을 해 볼 것이다.
        *       static 은 나중에 다시 다룰거지만,
        *       static 키워드가 붙은 메서드 호출을 알아 볼 것이다. */

        //// testMethod();
        //// System.out.println(testMethod());

        /* static 표현식
        *   클래스명.메소드명(); */

        //Application08.sumTwoNum(10, 20);

        int result = Application08.sumTwoNum(10, 20);
        System.out.println(result);

        /* 필기.
         *       동일한 클래스 내에 작성 된 static 메서드는 클래스명 생략이 가능하다. */

        //sumTwoNum(10, 20);
        int result2 = sumTwoNum(10, 20);
        System.out.println(result2);

    }

////    public static String testMethod() {
////        return "안녕";
////    }

    public static int sumTwoNum(int first, int second) {
        return first + second;
    }

}
