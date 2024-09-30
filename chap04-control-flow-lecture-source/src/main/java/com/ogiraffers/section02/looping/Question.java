package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class Question {

    public void question1() {

        /* 람쥐가 축제 아르바이트를 시작했습니다.
         * 맥주를 판매하려면 성인인지 확인을 해야 해요.
         *
         * '나이가 어떻게 되세요?'를 출력하고 나이(정수)를 입력받아,
         * 성인이면 '판매 가능합니다.'를 출력하고,
         * 미성년자이면 '판매 불가능합니다. 음료 코너에서 골라주세요.'를 출력하세요.
         *
         * -- 입력 예시 --
         * 성인이십니까? 21
         *
         * -- 출력 예시 --
         * 판매 가능합니다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("나이가 어떻게 되세요? : ");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("판매 가능합니당~");
        } else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }

    public void question2() {
        /* 람쥐가 이벤트 부스에서 짝홀 게임 진행을 맡았습니다.
         *
         * "짝홀, 그 결과는?"을 출력하고, 도토리 갯수를 정수로 입력받아
         * 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요.
         *
         * 짝수인 경우 "짝수입니다~!" 출력, 홀수인 경우 "홀수입니다~!" 출력
         *
         * -- 입력 예시 --
         * 짝홀, 그 결과는? 7
         *
         * -- 출력 예시 --
         * 홀수입니다~!
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("짝홀, 그 결과는? : ");
        int dtr = sc.nextInt();

        if (dtr % 2 == 1) {
            System.out.println("홀수입니다~");
        } else {
            System.out.println("짝수입니다~!");
        }
    }

    public void question3() {
        /* 랍쥐가 숫자 뽑기를 통해 선물을 나눠주는 이벤트 부스에서 일합니다.
         *
         * "당첨 번호가 어떻게 되세요?"를 출력하여,
         * 1~10 사이의 정수 한개를 입력받고,
         * 홀수인지 짝수인지 확인하고,
         * 홀수이면 "홀수네요, 인형 선물입니다!", 홀수가 아니면 "짝수네요, 모자 선물입니다!"라고 출력하세요.
         *
         * 단, 1~10 사이의 정수가 아닌 경우 "당첨 번호는 1~10 사이에만 있어요."를 출력하세요.
         *
         * -- 입력 예시 --
         * 당첨 번호가 어떻게 되세요? 8
         *
         * -- 출력 예시 --
         * 짝수네요, 모자 선물입니다!
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("당첨 번호가 어떻게 되세요? : ");
        int dtr = sc.nextInt();

        if (dtr % 2 == 1 && dtr <= 10) {
            System.out.println("홀수네요, 인형 선물입니다!");
        } else if (dtr % 2 == 0 && dtr <= 10){
            System.out.println("짝수네요, 모자 선물입니다!");
        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        }
    }

    public void question4() {
        /* 축제에서 무료로 건강 검진을 해주는 부스로 이동했어요.
         *
         * 키와 몸무게를 실수(double)로 입력받아 BMI(신체질량지수)를 계산하고,
         * 계산된 값에 따라
         * 저체중(20 미만)인 경우 "저체중입니다. 축제 음식을 왕창 드세요!",
         * 정상체중(20이상 25미만)인 경우 "정상 체중입니다. 축제 재미있게 즐기세요~",
         * 과제충(25이상 30미만)인 경우 "축제에서 10,000보를 걷고 오시면 상품을 드려요!",
         * 비만(30이상)인 경우 "댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!"를  출력하세요.
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 입니다.
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         *
         * -- 입력 예시 --
         * 키를 입력해 주세요(m) : 1.7
         * 체중을 입력해 주세요(kg) : 67
         *
         * -- 출력 예시 --
         * 정상 체중입니다. 축제 재미있게 즐기세요~
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("키가 어떻게 되세요? (m) : ");
        double height = sc.nextDouble();
        System.out.print("몸무게가 어떻게 되세요? (kg) : ");
        double weight = sc.nextDouble();
        
        int bmi = (int)(weight / (height * height));

        if (bmi > 20) {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        } else if (bmi <= 20 && bmi > 25) {
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
        } else if (bmi <= 25 && bmi > 30) {
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        } else {
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }
    }

    public void question5() {
        /* 간단한 계산기를 만들어 봅시다.
         *
         * 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램을 종료합니다.
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번쨰 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해 주세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요 : ");
        int second = sc.nextInt();

        System.out.print("연산 기호 입력 ( + - */ %) : ");

        // 문자열을 charAt(인덱스)로 문자로 만들기
        char op = sc.next().charAt(0);
        // 입력한 연산 기호 문자에 따라서 연산 결과를 다르게 만들어보기.

        int result = 0;

        switch (op) {
            case '+':
                result = first + second;
                System.out.println(first + "+" + second + " = " + result);
                break;
            case '-':
                result = first - second;
                System.out.println(first + "-" + second + " = " + result);
                break;
            case '*':
                result = first * second;
                System.out.println(first + "*" + second + " = " + result);
                break;
            case '/':
                result = first / second;
                System.out.println(first + "/" + second + " = " + result);
                break;
            case '%':
                result = first % second;
                System.out.println(first + "%" + second + " = " + result);
                break;
        }
    }

    public void question6() {
        /* 람쥐는 축제 간식 부스에서 일하게 됐어요.
         *
         * 간식 이름("캬라멜팝콘", "츄로스", "통감자", "도토리탕후루") 중 한 가지를 문자열로 입려하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         *
         * 단, 목록에 없는 과일을 입력 시 "해당 상품이 판매하지 않습니다." 출력 후 프로그램을 종료합니다.
         *
         * -- 상품 가격 --
         * 캬라멜팝콘 : 15500원
         * 츄로스 : 3000원
         * : 2000원
         * 도토리탕후루 : 5000원
         *
         * -- 입력 예시 --
         * 어떤 간식을 주문하시겠어요? 도토리탕후루
         *
         * -- 출력 예시 --
         * 도토리탕후루의 가격은 5000원 입니다. */

        System.out.println("\"캬라멜팝콘 (P) \", \"츄로스 (C) \", \"통감자 (T) \", \"도토리탕후루 (D) \"");
        System.out.println("-----------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("어떤 간식을 주문하시겠어요? : ");
        String selectMenu = sc.nextLine();

        int price = 0; // 투입 가격을 위한 변수
        String orderMenu = "";

        switch (selectMenu) {
            case "P":
                orderMenu = "캬라멜팝콘";
                price = 15500;
            case "C":
                orderMenu = "츄로스";
                price = 3000;
                break;
            case "T":
                orderMenu = "통감자";
                price = 2000;
                break;
            case "D":
                orderMenu = "도토리탕후루";
                price = 5000;
                break;
            default:
                System.out.println("아무것도 선택되지 않았습니다.");
                break;
        }
        System.out.println(orderMenu + "를 고르셨고, 가격은 " + price + "원 입니다");
    }

    public void question7() {
        /* 람쥐는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.
         *
         * 성실, 서비스, 미소 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         *
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
         * 항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 성실 점수 : 60
         * 서비스 점수 : 30
         * 미소 점수 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 서비스 점수 미달로 불합격입니다.
         * 미소 점수 미달로 불합격입니다.  **/

        Scanner sc = new Scanner(System.in);

        System.out.print("성실 점수 : ");
        int sung = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int service = sc.nextInt();
        System.out.print("미소 점수 : ");
        int miso = sc.nextInt();

        int avg = (sung + service + miso) / 3;

        if (avg >= 60 && sung >=40 && service >= 40 && miso >= 40) {
            System.out.println("합격입니다!!!");
        } else if (avg < 60 && sung < 40) {
            System.out.println("평균점수 미달과 성실 점수 미달로 불합격입니다.");
        } else if (avg < 60 && service < 40) {
            System.out.println("평균점수 미달과 서비스 점수 미달로 불합격입니다.");
        } else {
            System.out.println("평균점수 미달과 미소 점수 미달로 불합격입니다.");
        }
    }

    public void question8() {
        /* 열심히 일한 람쥐가 급여를 계산해 보려고 합니다.
         * 월 급여액과 월 매출액을 입력받아 급여를 산정합니다.
         * 축제 운영 사원은 매출액 대비 보너스율에 명시된 보너스를, 급여 외에 추가로 지급받습니다.
         *
         * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
         * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산합니다.
         *
         * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어 보세요.
         *
         * -- 총 급여 계산식 --
         * 총 급여 = 월 급여  + (매출액 * 보너스율)
         *
         * -- 매출액 대비 보너스율 --
         *   매출액       보너스율
         * 5천만원 이상      5%
         * 3천만원 이상      3%
         * 1천만원 이상      1%
         * 1천만원 미만      0%
         *
         * -- 입력 예시 --
         * 월 급여 입력 : 3000000
         * 매출액 입력 : 20000000
         *
         * -- 출력 예시 --
         * ======================
         * 매출액 : 20000000
         * 보너스율 : 1%
         * 월 급여 : 3000000
         * 보너스 금액 : 200000
         * ======================
         * 총 급여 : 3200000
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("월 급여 입력 : ");
        int month = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int money = sc.nextInt();

        if (money >= 50000000) {
            double bonus = 0.05;
            double total = month + (money * bonus);
            System.out.println("매출액 : " + money);
            System.out.println("보너스율 : 5%");
            System.out.println("월 급여 : " + Math.round((total)));
            System.out.println("보너스 금액 : "+ Math.round(money * bonus));
            System.out.println("----------------------------------------");
            System.out.println("총 급여 : " + Math.round(month + (money * bonus)) + "원");
        } else if (money >= 30000000) {
            double bonus = 0.03;
            double total = month + (money * bonus);
            System.out.println("매출액 : " + money);
            System.out.println("보너스율 : 3%");
            System.out.println("월 급여 : " + Math.round((total)));
            System.out.println("보너스 금액 : "+ Math.round(money * bonus));
            System.out.println("----------------------------------------");
            System.out.println("총 급여 : " + Math.round(month + (money * bonus)) + "원");
        } else if (money >= 10000000) {
            double bonus = 0.01;
            double total = month + (money * bonus);
            System.out.println("매출액 : " + money);
            System.out.println("보너스율 : 1%");
            System.out.println("월 급여 : " + Math.round((total)));
            System.out.println("보너스 금액 : "+ Math.round(money * bonus));
            System.out.println("----------------------------------------");
            System.out.println("총 급여 : " + Math.round(month + (money * bonus)) + "원");
        } else {
            double bonus = 0;
            double total = month + (money * bonus);
            System.out.println("매출액 : " + money);
            System.out.println("보너스율 : 0%");
            System.out.println("월 급여 : " + Math.round((total)));
            System.out.println("보너스 금액 : "+ Math.round(money * bonus));
            System.out.println("----------------------------------------");
            System.out.println("총 급여 : " + Math.round(month + (money * bonus)) + "원");
        }
    }

    public void question9_1() {
        /*
        * Q1. 9세 이상이면서 110cm 이상인 사람만 놀이기구를 탑승 가능 한 프로그램 만들기
                조건 : 나이 조건에 만족하지 않으면 출력문으로 9살 넘으면 오시오.
                키 조건에 만족하지 않으면 키 더 크고 오시오. */

        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("키 입력 : ");
        int height = sc.nextInt();

        if (age >= 9 && height >= 110) {
            System.out.println("탑승이 가능합니다.");
        } else if (age < 8) {
            System.out.println("9살 넘으면 오시오.");
        } else {
            System.out.println("키 더 크고 오시오.");
        }
    }

    public void question9_2() {
        /* Q2. 두 과목의 평균이 60점 이상이면 합격
			한 과목이라도 40점미만이면 불합격 */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 점수를 입력해 주세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 점수를 입력해 주세요 : ");
        int second = sc.nextInt();
        
        int avg = (first + second) / 2;
        
        if (avg >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }

    public void question9_3() {
        /* Q3. 1일간 차를 렌트하려고 하는데 차종에 따른 렌트비를 출력해보자(switch)
                소형 : 40000원
                중형 : 55000원
                대형 : 80000원
                SUV : 100000원
                승합 : 120000원
                추가 : Scanner 를 사용해서 내가 가지고 있는 예산을 입력해서 추천 하는 방식으로 해도 좋다. */

        System.out.println("차는 소형(S) 중형(M) 대형(L) SUV(U) 승합(V)가 있습니다.");

        Scanner sc = new Scanner(System.in);
        System.out.print("차를 고르세요 : ");
        String car = sc.nextLine();
//        System.out.print("예산을 입력해주세요 : ");
//        int price = sc.nextInt();

        switch (car) {
            case "S":
                System.out.println("소형 / 40,000원");
                break;
            case "M":
                System.out.println("중형 / 55,000원");
                break;
            case "L":
                System.out.println("대형 / 80,000원");
                break;
            case "U":
                System.out.println("SUV / 100,000원");
                break;
            case "V":
                System.out.println("승합 / 120,000원");
                break;
        }
    }

    public void question9_4() {
        /* Q4. Scanner 로 1 ~ 12 사이의 정수를 입력 받아 입력 한 정수에 해당하는
		  계절의 정보를 출력하시오.
		  추가적으로 겨울과 여름의 경우 온도를 입력받아
		  겨울에 경우 -15 도 이하이면 한파경보
		  -5 ~ -14 이면 한파 주의보
		  여름의 경우 33도 이상이면 폭염경보,
		  28 ~ 33 이면 폭염주의보 를 출력하시오 */

        Scanner sc = new Scanner(System.in);
        System.out.print("온도를 설정하세요 : ");
        int temp = sc.nextInt();

        if (temp <= 1 && temp >=12) {
            System.out.println("봄 & 가을입니다.");
        }

    }

    public void printTriangleStarts() {
        /* 필기.
        *   키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 '*'을 행의 번호개씩 출력한다
        *   예) 정수를 입력해주세요 : 5 */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int star = sc.nextInt();

        for (int i = 1; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printReversTriangleStars() {
        /* 필기.
         *  예) 정수를 입력해주세요 : 5  */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int star = sc.nextInt();

        for (int i = 1; i < star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangle() {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {  //위쪽 삼각형
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) { //아래쪽 삼각형
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

