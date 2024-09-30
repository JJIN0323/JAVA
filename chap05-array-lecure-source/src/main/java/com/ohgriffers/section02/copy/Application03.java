package com.ohgriffers.section02.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {
        /* 수업목표 : 깊은 복사에 대해서 이해할 수 있다. */

        /* 필기.
        *   깊은 복사는 heap 에 생성된 배열이 가지고 있는 값을
        *   또 다른 배열에 복사를 해 둔 것이다.
        *   서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기 때문에,
        *   원본 또는 복사본을 수정하더라도 서로에게 영향을 미치지 않는다. */

        /* 필기.
        *   깊은 복사를 하는 방법은 4가지가 있다.
        *   1. for 문을 이용한 동일한 인덱스 값의 복사 (안씀..)
        *   2. Object 의 clone() 메소드를 이용한 값 복사
        *   3. System 의 arraycopy() 메소드를 이용한 값 복사 (안씀..)
        *   4. Arrays 의 copyOf() 메소드를 이용한 값 복사
        *
        *   이 중 가장 높은 성능(빠르다)을 보이는 것은 순수 배열의 복사를 위해 만들어진 !
        *   arraycopy() 메소드 이며, 가장 많이 사용되는 방식은 copyOf() 메소드 이다.
        *   clone() 메소드는 이전 배열과 같은 배열 밖에 만들지 못하는 특징이 있으며,
        *   그 외 3가지 방법은 복사하는 배열의 길이를 조절 할 수 있다는 장점이 있다. */

        int[] count = new int[] {1, 2, 3, 4, 5};

        for(int i = 0 ; i < count.length ; i++){
            count[i] = i + 1;
            System.out.print(count[i] + "번째 Array - ");
        }
        System.out.println();

        System.out.println("전달 받은 배열의 hashcode() : " + count.hashCode());



        int [] originArr = new int [] {1, 2, 3, 4, 5}; // Base !!!

        print(originArr);

        /* 목차. 1. for 문을 이용한 인덱스 값 복사 */
        System.out.println("[copyArr1]");
        int [] copyArr1 = new int[10];

        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        print(copyArr1);

        /* 목차. 2. Object(class) 의 clone() 을 이용한 값 복사 */
        System.out.println("[copyArr2]");
        int [] copyArr2 = originArr.clone(); // Object = (originArr)

        print(copyArr2);

        /* 목차. 3. System 의 arraycopy() 를 이용한 복사 -> 얘를 압축한게 copyOf */
        System.out.println("[copyArr3]");
        int [] copyArr3 = new int[10];

        // 첫번째 전달인자 : 원본 배열 (originArr)
        // 두번째 전달인자 : 복사를 시작할 인덱스 ( 2 == 4 )
        // 세번째 전달인자 : 복사본 배열&공간(copyArr3) -> 몇 번째 칸 부터 복사할 값을 넣을지 결정하는 구간
        // 네번째 전달인자 : 복사를 시작할 인덱스 ( 4 == 2 ) -> 3은 0, 1, 2를 채우고 3부터 시작.
        // 다섯째 전달인자 : 복사 할 길이
        System.arraycopy(originArr,0,copyArr3,3, originArr.length);
        print(copyArr3);

        /* ★목차. 4.★ Arrays 의 copyOf() 메소드를 이용한 값 복사 */
        
        // 첫번째 전달 인자 : 복사하고 싶은 배열 (originArr)
        // 두번째 전달 인자 : 만들고 싶은 배열의 길이
        int [] copyArr4 = Arrays.copyOf(originArr, 8); // copyOf 에서 ctrl + 좌 click

        print(copyArr4);

        int [] copyArr5 = Arrays.copyOf(originArr, 5);
        print(copyArr5);
    }

    public static void print(int [] 전달받은배열을저장할매개변수) {
        System.out.println("전달 받은 배열의 hashcode() : " + 전달받은배열을저장할매개변수.hashCode());

        for (int i = 0; i < 전달받은배열을저장할매개변수.length; i++) {
            System.out.print(전달받은배열을저장할매개변수 [i] + " ");
        }

        System.out.println(); //줄바꿈 용도
    }
}
