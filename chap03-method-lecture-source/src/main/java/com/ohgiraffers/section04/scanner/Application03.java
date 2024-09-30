package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. Scanner 사용 시 주의사항에 대해 이해할 수 있다. */

        /* 필기.
        *   Scanner 의 next 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서 읽어오게 된다.
        * 그래서, 크게 두가지 사항을 주의해야 한다.
        * 1. next()로 문자열을 입력 받은 후 정수, 실수, 논리값 입력 받을 때
        * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력 받을 때 */

        /* 목차. 1. 스캐너 객체 생성 = 사용할 준비 */

        Scanner sc = new Scanner(System.in); // 어떤걸 쓰는지 컴퓨터에게 알려줘야 한다.

        /* 목차. 1-1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 */
        System.out.print("문자열을 입력 해주세요 : ");
        String str1 = sc.next(); // 공백이나 개행문자 전 까지를 읽는다.
        System.out.println("문자열 = " + str1);

        /* 필기.
        *   comfile err가 발생하고 있지 않다. = 번역에는 문제가 없다.
        *   hello 만 입력을 하고 정수를 입력하면 정상적으로 동작을 한다.
        *   하지만, hello world 를 입력하게 디면 숫자를 입력하지 않았음에도
        *   InputMismatch 오류가 발생하게 된다.
        *   -> 공백이 있는 문자열을 입력해야 된다. = nextLine()을 쓰면 된다.
        *   -> sc.nextLine()을 호출 중간에 넣어만 줘도 해결이 된다. */

        System.out.print("정수를 입력 해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("정수 = " + num1);
        
        /* 목차. 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열을 입력 받을 때 */

        System.out.print("다시한번 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("입력한 숫자 = " + num2);

        System.out.print("공백이 있는 문자열 하나 입력하세요 : ");

        /* 필기.
        *   입력을 받을 시 nextLine()을 호출한 것이 아직 행을 바꾸지 않고
        *   한 라인을 읽어들인다고 판단을 ㅐ서 아무것도 읽지 못하고
        *   넘어간 뒤에 다음 출력 구문을 실행 한 것이다.
        *   이걸 해결하기 위해서는 sc.nextLine()  호출 전에 미리 sc.nextLine()을
        *   한번 호출하면 그 행을 읽어들이는걸 다음 행으로 넘기게 되고
        *   그 이후 새로 입력 받은 한 라인을 읽어와서 str2에 저장하게 된다. */

        sc.nextLine(); // 목차 2 해결 방법 !!!
        String str2 = sc.nextLine();
        System.out.println("공백이 있는 문자열 = " + str2);

    }
}
