package com.ohgriffers.section02.copy;

import java.sql.Array;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표 : 배열의 깊은복사를 사용한 java 문법을 이해하고 활용 할 수 있다.. */

        /* 필기.
        *   깊은복사는 원본 배열과 복사본 배열 둘 중 한 가지의 값을 변경하더라도,
        *   전혀 영향을 주지 않는다! -> 왜? 다른 주소를 가지고 있기 때문이다.
        *   같은 값을 가지고 있지만, 주소는 서로 다른 배열이다!!! */

        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = arr1.clone();

        // 목차. 1. 각 배열의 인덱스에 10씩 누적 증가
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 10; // 1+10, 2+10 ......
        }

        // 목차. 2. 반복문을 사용한 값 출력해보기
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // 출력 구문
        }

        System.out.println();

        /* 필기.
        *   향상된 for 문 :
        *   - 배열의 인덱스에 하나씩 차례로 접근해서 담긴 값을
        *     임시로 사용할 변수에 담고 '반복'을 실행한다. */

        for ( int i : arr2 ) {
            i += 10; // 회색 = 즉, 비활성.
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        /* 필기.
        *   ★ 값을 확인하는 용도로만 사용하는게 좋다. ★
        *   arr 에 따라서 자료형도 같이 바뀌어야 한다.
        *   주의할 점은, 향상된 for 문은 배열의 인덱스에 차례로 접근 할 때는 유용하나,
        *   값을 변경 할 수는 없다 !!!!!!!!!! == find() 의 용도. */

        for ( int i : arr2 ) { // 배열같이 여러가지 값이 들어있는것을 확인하는 용도!!!
            System.out.print( i + " ");
        }
    }
}
