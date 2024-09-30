package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    // ~하는 동안 = for

    public void testSimpleForStatement() {
        /* 수업목표. for 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 필기.
        *   [for 문 표현식]
        *   for ( 초기식; 조건식; 증감식 ) {
        *       조건을 만족하는 경우 수행할 구문 (반복 구문);
        *
        *   ★ int i = 1 : 초기식; ★
        *   ★ i <= 10 : 조건식; ★
        *   ★ i++ : 증감식 ★
        *   } */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // 지역변수
        }
    }

    public void testForExample() {

        /* 수업목표. 무엇을 반복 하는지를 확인해서 반복문으로 개선할 수 있다. */

        /* 필기.
        *   10명의 학생 이름을 입력 받아 이름을 출력해보자 */

        Scanner sc = new Scanner(System.in);

//        System.out.print("첫번째 학생의 이름은 : ");
//        String student1 = sc.nextLine();
//        System.out.print("첫번째 학생의 이름은" + student1+ "입니다.");
//
//        System.out.print("두번째 학생의 이름은 : ");
//        String student2 = sc.nextLine();
//        System.out.print("두번째 학생의 이름은" + student2 + "입니다.");
//
//        System.out.print("세번째 학생의 이름은 : ");
//        String student3 = sc.nextLine();
//        System.out.print("세번째 학생의 이름은" + student3 + "입니다.");
//
//        System.out.print("네번째 학생의 이름은 : ");
//        String student4 = sc.nextLine();
//        System.out.print("네번째 학생의 이름은" + student4 + "입니다.");
//
//        System.out.print("다섯번째 학생의 이름은 : ");
//        String student5 = sc.nextLine();
//        System.out.print("다섯번째 학생의 이름은" + student5 + "입니다.");
//
//        System.out.print("여섯번째 학생의 이름은 : ");
//        String student6 = sc.nextLine();
//        System.out.print("여섯번째 학생의 이름은" + student6 + "입니다.");
//
//        System.out.print("일곱번째 학생의 이름은 : ");
//        String student7 = sc.nextLine();
//        System.out.print("일곱번째 학생의 이름은" + student7 + "입니다.");
//
//        System.out.print("여덟번째 학생의 이름은 : ");
//        String student8 = sc.nextLine();
//        System.out.print("여덟번째 학생의 이름은" + student8 + "입니다.");
//
//        System.out.print("아홉번째 학생의 이름은 : ");
//        String student9 = sc.nextLine();
//        System.out.print("아홉번째 학생의 이름은" + student9 + "입니다.");
//
//        System.out.print("열번째 학생의 이름은 : ");
//        String student10 = sc.nextLine();
//        System.out.print("열번째 학생의 이름은" + student10 + "입니다.");

        /* 필기.
        *   - 1. 이름 입력 안내 문구
        *   - 2. 학생의 이름을 입력받아 변수에 저장
        *   - 3. 저장된 이름을 출력 */

        /* 필기.
        *   둘 중 어떤 코드가 좋은 코드일까?
        *   둘 다 좋은 코드다. Why? = 결과가 같으니까.
        *   하지만, 반복문을 사용하는 것이 더 좋은 코드다.
        *   1. 보다 간결하게 작성이 되었다. (가독성 상승)
        *   2. 학생의 이름 뿐 아니라, 나이 및 기타 등등을 입력 받아야 할때도 유용하다. (유지보수성 향상)
        *   3.  */

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름은 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다." );
            System.out.print(i + "번째 학생의 성적을 입력해주세요 : ");
            int grade = sc.nextInt();
            System.out.println(i + "번째 학생의 성적은 " + grade + "입니다.");
        }
    }

    public void testSampleForExample2() {
        
        /* 목차. 1. 1부터 10까지의 합계를 구하시오 */

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum); // 반복문 다 돌리고 나서 출력해야함 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    public void testSampleForExample3() {

        /* 목차. 2. 문제
        *   5부터 10까지의 사이의 난수를 발생시켜서,
        *   1부터 발생한 난수까지의 합계를 구해보자. */

        int random = (int)(Math.random() * 6) + 5;

        // 초기식 : int i = 1;
        // 조건식 : i <= random
        // 증감식 : i++

        int sum = 0;

        for (int i = 1; random >= i; i++) {
            sum += i;
        }
        System.out.println("1부터 "+ random + " 까지의 합은 " + sum);
    }

    // 2024-09-03

    public void testSampleForExample4() {
        /* 필기.
        *   숫자 2개를 입력 받아 작은수에서 큰 수까지 합을 구하시오.
        *   단, 두 숫자는 '같지 않다'를 가정하에 진행한다. */

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int second = sc.nextInt();

        // 합산 결과를 담을 변수
        int result = first + second;

//        for(int i = first;  i <= second; i++ ) {
//            result += i;
//        }

        if (first > second) {
            for(int i = second;  i <= first; i++ ) {
                result += i;
            }
        } else {
            for (int i = first; i <= second; i++) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public void printSimpleGugudan() {
        /* 필기.
        *   스캐너로 2-9사이의 구구단을 받아
        *   2~ 9 사이인 경우 구구단을 룰력하고,
        *   그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해주세요." 를 출력해보자 */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력해주세요 : ");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <=9) {
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan * su);
            }
        } else {
            System.out.println("반드시 2~9 사이의 양수를 입력해주세요.");
        }
    }
}
