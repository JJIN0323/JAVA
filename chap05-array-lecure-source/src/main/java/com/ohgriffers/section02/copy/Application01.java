package com.ohgriffers.section02.copy;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표 : 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */

        /*  필기.
        *   1. 얕은 복사 (shallow copy) : stack 의
        *   2. 깊은 복사 () : */

        /* 필기.
        *   얕은 복사란, stack 에 저장되어 있는 배열의 주소값만 복사하는 것이다.
        *   따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        *   하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정( 값 변경)
        *   하게되면, 다른 레퍼런스 (주소) 변수로 배열에 접근했을 때도 동일한 배열을
        *   가리키고 있기 때문에 변경 된 값이 반영되어 있다. */

        // 목차. 1. 얕은 보가 확인을 위한 원본 배열 만들기

        int [] originArr = {1, 2, 3, 4, 5};

        // int o = new int [5];
        // o[01] = 1; <- 위와 같지만 축약 가능하다.

        // 목차. 2. 새로운 배열 만들어서 주소 복사하기

        int [] copyArr = originArr;

        // 목차. 3. hashcode () 를 사용해서 진짜로 같은 지 비교
        System.out.println("원본 배열의 주소값 : " + originArr.hashCode());
        System.out.println("복제배열의 주소값 : " + copyArr.hashCode());

        // 목차. 4. 원본 배열과 복제 배열의 값을 반복문을 통해서 출력
        for ( int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }

        System.out.println();

        for ( int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

        // 목차. 5. 복제한 배열의 값을 수정하고, 원본도 반영됐는지 확인하기

        // 같은 공간을 사용하기 때문에, copyArr 과 originArr 이 같은 값을 가진다.
       copyArr[0] = 99;

        System.out.println();

        for ( int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }

        System.out.println();

        for ( int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

    }

}
