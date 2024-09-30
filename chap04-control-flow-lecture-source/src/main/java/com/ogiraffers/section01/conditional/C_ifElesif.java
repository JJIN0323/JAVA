package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElesif {
    public static void main(String[] args) {
        /* 목차. 1. if. if-else, if-else-if 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 필기.
        *   [if-else-if] 문 표현식
        *   if (조건식 1) {
        *       조건식 1이 true일 때, 실행할 구문;
        *   } else if (조건식2) {
        *       조선식 1이 false 이고 조건식 2가 true 일 때 실행할 구문;
        *   } else {
        *       위의 조건 2개가 모두 거짓일 경우 실행할 구문;
        * } */

        /* 필기.
        *   if-else-if 문은 조건식 1의 결과 값이 true 이면. if {} 블럭 실행,
        *   조건식 1이 false 이면 조건식 2를 확인하여 true 이면 else if {} 블럭 실행,
        *   조선식 1, 2 의 결과가 모두 거짓(false)이면 else {} 블럭을 실행한다. */

    }

    public void testIfElseIfStatement() {

        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("그때, 연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타나 물었다.");
        System.out.println("셋 중 어떤 도끼가 너의 도끼인가 ?");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.print("산신령 : 어느 도끼가 너의 도끼이냐 (1. 금, 2, 은, 3. 동) : ");

        Scanner sc = new Scanner(System.in);

        int answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("산신령 : 거짓말쟁이야 !");
        } else if (answer == 2) {
            System.out.println("산신령 : 거짓말쟁이야 !");
        } else if (answer == 3) {
            System.out.println("산신령 : 정답! 모두 다 주겠다.");
        } else {
            System.out.println("산신령 : 뭐라는 ㄱㅓ냐?");
        }
        System.out.println("산신령은 다시 연못 속으로 떠나갔다 ~~~");
    }

    public void testNestedIfElseIfStatement() {
        /* 목차1.
        *   오지라퍼 대학교의 조**교수는 학생들의 성적을 입력해서
        *   학점 등급을 매기는 채점방식을 사용하고 있다.
        *   학생의 이름가 점수를 입력받아, 90점 이상이면 'A', 80점 이상이면 'B' 70점 이상이면 'C'
        *   60점 이상이면 'D' 60점 미만이면 'F' 학점을 줄것이다.
        *   추가로 각 등급의 중간점수 (예) 65, 75, 85, 95 이상이면 '+'를 붙여 줄것이다. */

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int score = sc.nextInt();
        System.out.print("학생의 이름 : " + name);
        System.out.print("학생의 점수 : " + score);


        String grade = "";

        if (score >= 90) {
            grade = "A";
            if (score >= 95) {
                grade += "+";
            }
            System.out.println(grade);
        } else if (score >= 80) {
            grade = "B";
            if (score >= 85) {
                grade += "+";
            }
            System.out.println(grade);
        } else if (score >= 70) {
            grade = "C";
            if (score >= 75) {
                grade += "+";
            }
        } else if (score >= 60) {
            grade = "D";
            if (score >= 65) {
                grade += "+"; // 대입연산자
            }
        } else {
            grade = "F";
        }
    }

    public void ImproveNestedIfElseIfStatement() {
        /* 목차1.
         *   오지라퍼 대학교의 조**교수는 학생들의 성적을 입력해서
         *   학점 등급을 매기는 채점방식을 사용하고 있다.
         *   학생의 이름가 점수를 입력받아, 90점 이상이면 'A', 80점 이상이면 'B' 70점 이상이면 'C'
         *   60점 이상이면 'D' 60점 미만이면 'F' 학점을 줄것이다.
         *   추가로 각 등급의 중간점수 (예) 65, 75, 85, 95 이상이면 '+'를 붙여 줄것이다. */

        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 이름 : " );
        String name = sc.nextLine();
        System.out.print("학생의 점수 : " );
        int score = sc.nextInt();

        String grade = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if (score % 10 >= 5 &&  score >= 60 || score == 100) {
            grade += "+";
        }
        System.out.println(" " + name + " 학생의" + " 점수는 " + score + " 학점은 " + grade);
    }

    public void question() {
        Scanner sc = new Scanner(System.in);

        System.out.print("내 몸무게 : ");
        int weight = sc.nextInt();
        System.out.print("치킨집 (열었으면 1 닫았으면 2) : ");
        int open = sc.nextInt();

        if (weight > 70) {
            System.out.println("샐러드");
        } else if (open == 1 || open != 2 ) {
            System.out.println("치킨");
        } else {
            System.out.println("라면");
        }
    }
}
