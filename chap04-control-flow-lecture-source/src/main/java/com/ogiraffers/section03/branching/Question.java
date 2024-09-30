package com.ogiraffers.section03.branching;

import java.util.Scanner;
import java.util.Random;

public class Question {

    public void question1() {

        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합계 : " + sum);
    }

    public void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터" + num +"까지의 합계 : " + sum);
    }

    public void question3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1부터" + num +"까지 짝수의 합계 : " + sum);
    }

    public void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + "번째 = " + ch);
        }
    }

    public void question5() {

        String abc = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < abc.length(); i++) {
            char ch = abc.charAt(i);
            System.out.print(ch);
        }
    }

    public void question6() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print("토");
            } else {
                System.out.print("마");
            }
        }
    }

    public void question7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 2 && num % 2 == 0) {
            System.out.println("소수가 아니다");
        } else if (num > 2) {
            System.out.println("소수다");
        } else {
            System.out.println("다시 입력하세요.");
        }
    }

    public void question8() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int count = 1;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();

            if(num > randomNumber){
                System.out.println("입력하신 정수보다 작습니다.");
                count++;
            } else if (num < randomNumber){
                System.out.println("입력하신 정수보다 큽니다.");
                count++;
            } else {
                System.out.println("정답입니다. " + count + "회 만에 정답을 맞추셨습니다.");
                break;
            }
        }
}

    public void question9() {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        System.out.print("문자를 입력해주세요 : ");
        char ch = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("포함된 갯수 = " + count);
    }

    public void question10() {

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        System.out.print("정수를 입력해주세요. : ");
        int num = sc.nextInt();

        String result = "";
        int mod = num % 26;

        for(int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (temp != ' ') {
                if (temp <= 'z' && temp >= 'a') {
                    if (temp + mod > 'z') {
                        result += (char) (temp + mod - 26);
                    } else {
                        result += (char) (temp + mod);
                    }
                } else {
                    if (temp + mod > 'Z') {
                        result += (char) (temp + mod - 26);
                    } else {
                        result += (char) (temp + mod);
                    }
                }
            } else {
                result += temp;
            }
        }
        System.out.println(result);
    }

    public void question11() {

        Scanner sc = new Scanner(System.in);

        System.out.print("받으신 금액을 입력해주세요. : ");
        int money = sc.nextInt();

        System.out.print("받으신 금액을 입력해주세요. : ");
        int mod = sc.nextInt();

        int count = 0;

        if ( money - mod >= 50000 ) {
            count = (money -mod) / 50000;
            System.out.println("50,000원 지폐 " + count + "장");
        } else {
            count = (money -mod) / 10000;
            System.out.println("10,000원 지폐 " + count + "장");
        }

        System.out.println("거스름돈 : " + mod);
    }

}
