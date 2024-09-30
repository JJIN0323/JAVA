package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {

        // 객체를 전달해보기

        /* 수업목표. 메서드의 파라메터에 대해 이해할 수 있다. */

        /* 필기.
        *   매개변수(parameter)로 사용 가능한 자로형
        *   1. 기본 자료형 (int, char -)
        *   2. 기본자로형 배열 (String[] -)
        *   3. 클래스자료형
        *   4. 클래스자로형 배열
        *   5. 가변인자 */

        ParameterTest pt = new ParameterTest(); // 아직 없는 클래스 (Alt + Enter 로 create class)

        /* 목차. 1. 기본 자료형 매개변수 전달 */
        int num = 20;

        pt.testPrimaryParameter(num);

        /* 목차. 2. 기본자료형 배열을 매개변수로 전달 받는 메서드 호출 */

        int[] iarr = {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);

        System.out.print("메소드 변경 후 원본 배열 확인 : ");

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

        pt.testPrimaryArrayParameter(iarr);

        System.out.println();

        /* 목차. 3. 클래스 자료형  */

        RectAngle r1 = new RectAngle(12.5, 22.5);

        System.out.println("인자로 전달하는 클래스 자료형 : " + r1);

        pt.testClassParameter(r1);
        
        /* 목차. 4. 클래스의 배열 */
        
        /* 목차. 5. 가변인자 */

        /* 필기.
        *   가변인자 : 인자로 전달하는 값의 갯수가 정해지지 않은 경우 사용하는 배열의 일종이다. */

        /* 필기.
        *   가변인자는 매개변수가 여러개 일 시 반드시! 뒤에 작성해야 한다.
        *   WHY? 가변인자의 끝을 알 수 없기 때문에. */

        pt.testVariableLengthParameter("혜진", "야구", "유튜브", "누워있기"); // 가변인자는 전달하지 않아도 된다.
        pt.testVariableLengthParameter("혜진", new String[] {"야구2", "유튜브2", "누워있기2"});

    }
}
