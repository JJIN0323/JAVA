package com.ohgiraffers.section04.constructor;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */

        /* 필기.
         *   생성자란?
         *   우리가 지금까지 클래스명 래퍼런스변수명 = new 클래스명();
         *   이렇게 객체를 만들어왔다.
         *   new 뒤에 클래스명은 사실 생성자(constructor) 라고 불리는 메소드를
         *   호출하는 구문이다.
         *   하지만, 우리는 지금까지 생성자를 만든 적이 없는데
         *   매개변수가 없는 생성자는 compiler 에 의해 자동으로 추가되기 때문에
         *   우리가 지금까지 작성하지 않고도 사용할 수 있게 되었다.
         *  */

        UserDTO user = new UserDTO();
        System.out.println("user 의 초기값 : " + user.toString());

        UserDTO user2 = new UserDTO("user01", "pass01", "홍길동");
        System.out.println("user2 의 초기값 : " + user2.toString());
    }
}