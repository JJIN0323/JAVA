package com.ohgriffers.section03.sort;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표 : 변수의 두 값을 변경하는 '기초' 방법에 대해 이해 할 수 있다. */

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

//        num1 = num2;
//        num2 = num1;

        /* 필기. 임시 공간을 만들어 보자. */

        int temp;
        temp = num1; // 10 이 저장되어 있음.
        num1 = num2;
        num2 = temp;

        System.out.println("수정 후 num1 = " + num1);
        System.out.println("수정 후 num2 = " + num2);
        
        /* 배열의 기초 : 향상된 for 문으로 확인하기. */
        
        int [] arr = {2, 1, 3};
        
        int temp1;
        temp1 = arr[0]; // 2를 임시 공간에 저장
        arr[0] = arr[1];
        arr[1] = temp1;

        for (int i : arr) {
            System.out.print( i + " ");
        } // 향상된 for 문으로 확인.

    }
}
