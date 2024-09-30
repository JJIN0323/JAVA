package com.ohgriffers.section03.sort;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표 : 순차 정렬에 대해 이해 할 수 있다. */

        /* 필기.
        *   순차 정렬이란, 정렬 알고리즘에서 가장 간단하고 기본이 되는
        *   알고리즘으로 배열의 처음과 끝을 탐색하면서 차순대로
        *   정렬하는 가장 기초적인 정렬 알고리즘이다. */

        int [] arr = {2, 5, 3, 6, 1, 4};

        /* 첫번째 인덱스(0)은 비교할 필요가 없으므로, 1부터 시작한다. */

        for (int i =1; i < arr.length; i++) {
            // 인덱스가 증가할 때마다, 처음부터 해당 인덱스까지 값을 비교
            for (int j = 0; j < i; j++) {
                if ( arr[i] < arr[j]) { // 여기 부등호에 따라서 오름차순/내림차순.
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print( i + " ");
        }
    }
}
