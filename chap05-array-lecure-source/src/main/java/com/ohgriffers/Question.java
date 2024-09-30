package com.ohgriffers;

import java.util.Scanner;

public class Question {

    public void question1 () {
        /* Q1.길이가 10인 정수형 배열을 선언 및 할당한 뒤 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요. */

        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
            System.out.print( i + " "); // 출력 구문
        }
    }

    public void question2() {

        String [] str = new String[5];
        String [] strFruits = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("0-4 중 정수를 하나 입력해주세요 : ");

        System.out.println(num);

        if ( num > 5 ) {
            for(int i = 0; i < strFruits.length; i++) {
                System.out.println(strFruits[i]);
            }
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
    }

    public void question03() {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("검색할 문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("입력하신 문자열" + str + "에서 찾으시는 문자 " + ch + "는 " + count + "개 입니다.");
    }

    public void question04() {

        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 : ");
        String str = sc.nextLine();

        char[] ch = new char[str.length()];

        // 우리가 입력 한 문자열을 charAt 을 이용해서 위에 만든 배열에 하나씩 넣어준다.
        // {1,2,3,4,5,6,-,1,2,4,5,6,7}
        // - 이후에 *로 치환.

        for (int i = 0; i < ch.length; i++) {
                ch[i] = str.charAt(i); // point !!! 여기서 한번 다시 char 배열로 잡아줘야함.
            for (int j = 0; j < i; j++) {
                if ( i > 7) {
                    ch[i] = '*';
                }
            }
            System.out.print(ch[i]);
        }
    }
}
