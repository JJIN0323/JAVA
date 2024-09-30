package com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 다른 흐름의 메소드 호출에 대해 이해할 수 있다. */
        
        /* 목차. 1. methodA(), methodB(), methodC() 차례로 작성 */
        /* 목차. 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 작성 */
        /* 목차. 3. 메인메소드 실행 종료를 확인하기 위한  출력 구문을 작성 */

        System.out.println("main() 호출");

        /* 목차. 4. methodA(), methodB(), methodC()를 차례로 호출 */
        
        Application02 Test = new Application02();
        Test.methodA();
        Test.methodB();
        Test.methodC();
        Test.methodD(); // 오직 이 안에서만 쓸 수 있는 method !!!

        System.out.println("main() 종료");
    }

    public void methodA() {
        System.out.println("methodA 호출");
        System.out.println("methodA 종료");
    }
    public void methodB() {
        System.out.println("methodB 호출");
        System.out.println("methodB 종료");
    }
    public void methodC() {
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");
    }

    private void methodD() { // private : 접근 제한자
        System.out.println("오직 App2에서만 사용 가능!");
        System.out.println("외부 Class 에서는 사용 할 수 없음.");
    }
}
