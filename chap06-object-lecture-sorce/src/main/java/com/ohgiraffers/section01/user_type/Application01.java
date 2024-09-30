package com.ohgiraffers.section01.user_type;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 클래스가 무엇인지 이해할 수 있다. */

        /* 필기.
        *   지금까지 우리는 자바에서 제공하는 자료형을 다루어 보았다.
        *   예) int, char, String, double 등등...
        *   회원의 정보를 관리하기 위해 (아이디, 비밀번호, 이름, 나이, 성별, 취미 등)
        *   지금까지 배운 내용으로 값을 넣고 출력을 해보자. */

        /* 목차. 1. 변수를 이용한 회원관련 데이터 처리 */

        String id = "user01";
        String password = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = 'M';
        String[] hobbies = new String[] {"야구", "누워있기", "유튜브"};

        System.out.println("id = " + id);
        System.out.println("password = " + password);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        //System.out.println("hobbies = " + hobbies); // 주소가 출력됨.
        System.out.print("hobbies = ");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print(hobbies[i] + " ");
        } // 이렇게 해야 배열로 나옴.
        System.out.println();

        /* 필기.
        *   각기 다른 변수로 데이터를 관리하게 되면 여러가지 단점이 있다.
        *   1. 변수명을 다 알아야 한다.
        *   2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 한다면
        *      너무 많은 값을 전달인자로 보내야 해서 한 눈에 안들어온다. = 자료형이 너무 많다.
        *   3. return 은 한개의 자료형 값만 가능하기 때문에,
        *      회원 정보를 묶어서 return 값으로 사용할 수 없다.
        *      왜? 서로 다른 자료형이기 때문이다. */
        
        /* 목차. 2. 사용자 정의의 자료형 사용하기. */
        /* 목차. 2-1. 변수 선언 및 객체 생성 */

        /* 필기.
        *   클래스 변수명 = new 클래스();
        *   - 위에 구문은 객체(instance) 를 만드는 구문이다.
        *   - 예) int[] arr = new int[5];
        *   클래스는 사용자 정의의 자료형이 되며, 클래스가 가지고 있는
        *   변수 / 메서드를 사용하기 위해서는 new 할당 연산자로
        *   heap 메모리 공간에 할당을 해야 한다. */

        Member member = new Member(); // 하나의 공간이 생김,

        /* 목차. 2. 생선된 인스턴스(객체)의 초기값 확인하기. */

        /* 필기.
        *   우리가 Member 클래스에 작성한 전역 변수, 즉 필드에 접근하기 위해서는
        *   레퍼런스변수명.변수명 <- 이 방법으로 접근 할 수 있다.
        *   '.' 은 참조연산자라고 하는데, 레퍼런스 변수가 참조하고 있는(가르키는 주소)
        *   곳으로 접근한다 라는 의미이다. */

        System.out.println("member ID = " + member.id);
        System.out.println("member PASSWORD = " + member.pwd);
        System.out.println("member NAME = " + member.name);
        System.out.println("member AGE = " + member.age);
        System.out.println("member GENDER = " + member.gender);
        System.out.println("member HOBBIES = " + member.hobbies);

        /* 목차. 2-3. 필드(전역변수)에 접근해서 변수처럼 사용해보기. */

        member.id = "user01";
        member.pwd = "pwd01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = 'M';
        member.hobbies = new String[] {"야구", "누워있기", "유튜브"};

        System.out.println("af Member ID = " + member.id);
        System.out.println("af Member PASSWORD = " + member.pwd);
        System.out.println("af Member NAME = " + member.name);
        System.out.println("af Member AGE = " + member.age);
        System.out.println("af Member GENDER = " + member.gender);
        System.out.print("af Member HOBBIES = ");

        for (int i = 0; i < hobbies.length; i++) {
            System.out.print(member.hobbies[i] + " ");
        }
        System.out.println();
    }
}
