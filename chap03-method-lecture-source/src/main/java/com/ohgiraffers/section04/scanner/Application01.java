package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Scanner 를 이용해서 값 입력 해보기. */

        // Ln의 의미는 개행(줄바꿈, Enter 키)의 의미이다.
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello ~");
        System.out.print("My name is JJIN ! ");
        System.out.println("Nice to meet you");


        /* 목차. 2-1. 문자열 입력 받기 */
        System.out.print("What's your name ? ");
        String main = sc.nextLine();
        System.out.println("My name is " + main + " .");

        /* 목차. 2-2. 정수형 값 입력 받기 */
        /* 필기.
        *   nextInt() : 입력 받은 값을 Int 형으로 반환해준다.  */
        System.out.print("How old are you ? ");
        int age = sc.nextInt();
        System.out.println("your age " + age +" !");

        /* 목차. 2-3. 실수형 값 입력받기 */
        System.out.print("How height are you ? ");
        double height = sc.nextDouble();
        System.out.println("Your Height " + height +"cm");

        /* 목차. 2-4. 논리형 값 입력받기 */
        System.out.print("True & False ? ");
        boolean tf = sc.nextBoolean();
        System.out.println("★" + tf +"★");

        /* 목차. 2-5. 문자형 값 입력받기 */

        /* 필기.
            아쉽게도 문자를 직접 입력받는 기능은 없다.
            따라서 문자열로 입력을 받은 후, 입력 바은 문자에서
            원하는 순번의 문자를 분리해서 사용을 해야한다.
            charAt(int INDEX) 를 사요애서 문자열을 분리 할 수 있다.
            정수형으로 값을 넘기게 되면 문자열에서 해당하는 번호(index)를 가진
             문자를 반환해주는 기능을 한다.
             INDEX 숫자 체계는 컴퓨터에서 정말 많이 쓰인다.
             이 친구의 특징은 0부터 시작한다. */

        sc.nextLine(); // Application03번에 필기부분 참고 !!!
        System.out.print("Your input ABC ? ");
        char ch = sc.nextLine().charAt(1); // 입력한 숫자가 ABC 일 때, B를 출력한다. 즉, 두번째 문자를 출려개주는 것이다.
        System.out.println("Input " + ch);
    }
}
