package com.ohgiraffer.section02.stringbuilder;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. String 과 StringBuilder 의 차이점을 알 수 있다. */

        /* 필기.
        *   String 과 StringBuilder 의 차이
        *
        *   String : 불변이라는 특성을 가지고 있다.
        *             문자열에 + 연산으로 합치기를 하는 경우에는 기존의 인스턴스를 수정하는것이 아닌
        *             새로운 인스턴스를 생성하여 덮어 씌우는 것이다.
        *             따라서, 문자열 변경이 많이 일어나는 경우에는 성능상에 좋지 않다.
        *             반대로 변하지 않는 문자열 같은 경우에는 오히려 좋다.
        *
        *   StringBuilder : 가변이라는 특성을 가지고 있다.
        *                      append() 메서드를 이용해서 문자열을 합칠 수 있는데
        *                      기존의 인스턴스를 수정 할 뿐, 새로운 인스턴스를 만들지는 않는다.
        *                      따라서, 잦은 변경이 일어나는 문자열의 경우 String 보다 성능이 좋다. */

        String str1 = "Hello";
        System.out.println(str1); // 원래는 주소값이 나와야 하지만, 자동으로 toString()이 적용된다.

        // toString() 메서드가 오버라이딩 되어있어 주소가 아닌 값이 나온다.
        StringBuilder str2 = new StringBuilder("World");
        System.out.println(str2); // 원래는 주소값이 나와야 하지만, 자동으로 toString()이 적용된다.
        System.out.println(str2.hashCode());

        // append("합칠문자열");
        str2.append("Hello");
        System.out.println(str2); // 문자열 합쳐서 내보냄.
        System.out.println(str2.hashCode()); // 주소가 같............다 == 원래 인스턴스에 갖다 붙여놓음. new 아님!!

        /* 필기.
        *   hashCode() 를 확인했을 때, 인스턴스가 동잃한것을 확인했다.
        *   즉, 문자열을 변경했다고 해서 새로운 인스턴스가 생성된 것이 아니다. */
    }
}
