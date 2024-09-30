package com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 여러개의 전달 인자를 이용한 메소드 호출 테스트 */

    Application04 app4 = new Application04();

    String name = "혜진";
    int age = 20;
    char gender = '여';

    app4.testArgsMethod("혜진", 20, '여');
    app4.testArgsMethod(name, age, gender);
    //app4.testArgsMethod(20, '여', "혜진"); // 값의 갯수는 맞지만, 순서가 다르게 전달되면 안된다.



    }

    public void testArgsMethod(String name, int age, final char gender) {

        /* 필기.
        *       매개변수도 일종의 지역변수로 분류된다.
        *       매개변수 역시 상수의 의미를 가지는 Final 키워드를 사용 할 수 있다.
        *       (지역변수에 Final 키워드를 붙이는 것과 동일하다.) */

        System.out.println("제 이름은 : " + name + " 이고 " + " 나이는 " + age + "이며, " + " 성별은 " + gender + "입니다.");

    }
}
