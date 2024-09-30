package com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 메소드의 전달 인자와 매개변수에 대해 이해하고 활용할 수 있다. */
        /* 필기
        *       전달인자(argument) & 매개변수(parameter)
        *       지금까지 우리가 배운, 즉 사용한 변수는 지역변수에 해당한다.
        *
        *       변수의 종류
        *       1. 지역변수 :
        *       2. 매개변수 :
        *       3. 전역변수 :
        *       4. 클래스(static)변수 :
        *
        *       지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
        *       이것을 지역변수의 스코프(범위)라고 한다.
        *       만약 다른 메소드들 끼리 값을 공유해야 하는 경우가 생기는 경우,
        *       메소드 호출시에 사용하는 괄호 [예) methodA()]를 이용해서 값을 전달 할 수 있다.
        *       이 때 전달하는 값을 전달인자(argument)라고 부르고,
        *       메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
        * */
        
        /* 목차. 2. 만든 메소드 호출하기 */
        Application03 app3 = new Application03();
        //app3.testMethod(40);
        //app3.testMethod("나는 40"); // String ) 파라메터 공간은 int형이지만, 인자를 String 으로 보내서 오류 발생
        //app3.testMethod(20, 30, 40); // int[] )파라메터 공간이 1개 뿐이지만, 인자를 3개 보내서 오류 발생

        /* 목차. 3. 변수에 저장한 값을 전달 테스트 */
        int age = 20;
        app3.testMethod(age);

        /* 목차. 4. 자동 형변환을 이용하여 값 전달 테스트 */
        byte bnum = 10; // 작은것을 큰것에 넣었기 때문에 문제가 없음.
        app3.testMethod(bnum);

        /* 목차. 5. 강제 형변환을 이용하여 값 전달 테스트 */
        long longNum = 55L;
        //app3.testMethod(longNum); // 8바이트 짜리를 4바이트에 넣으려고 해서 안됨.
        app3.testMethod((int) longNum);

        /* 목차. 6. 연산의 결과를 이용해서 값 전달 테스트 */
        app3.testMethod(age * 3);

    }
    
    /* 목차. 1. 호출 할 메소드 만들기 */
    public void testMethod(int var) {
        System.out.println("testMethod 호출");
        System.out.println(var);
        System.out.println("testMethod 종료");
    }
}
