package com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /* 수업목표. 메소드 리턴에 대해서 이해할 수 있다. */
        /* 필기.
        *       return 이란?
        *       모든 메소드 내부에는 return;이 존재한다.
        *       void 형의 메소드는 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가해준다.
        *       return;은 현재 메소드를 강제 종료하고 호출한 구문으로 돌아가는 명령어이다!!! <-- 중요★ */

        System.out.println("Main 시작");

        Application05 app5 = new Application05();
        app5.testMethod();

        //System.out.println(app5);

        System.out.println("Main 종료");
    }
    
    public void testMethod() {
        System.out.println("Test method 시작");
        System.out.println("Test method 종료");

        return; // 안써도 되는 것. 혹은 안쓰고 있는 것

        /* 필기.
        *       return 키워드는 컴파일러에 의해 자동으로 가장 마지막 줄에 추가된다.
        *       만약, 가장 마지막 줄에 안쓰면 도달 할 수 없는 코드가 되어 컴파일 에러를 발생 시킨다. */

        //System.out.println("종료?");
    }
}
