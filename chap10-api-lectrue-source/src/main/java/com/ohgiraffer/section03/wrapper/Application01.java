package com.ohgiraffer.section03.wrapper;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 알 수 있다. */

        /* 필기.
        *   상황에 따라서 원시타입(int, boolean, char 등)을 인스턴스화 해야하는 경우가 생긴다.
        *   이 때, 기본타입의 데이터를 인스턴스로 반환 후 사용해야 하는데
        *   8가지 기본 타입 데이터를 인스턴스화 할 수 있도록 하는
        *   클래스를 Wrapper 클래스라고 한다. */
        // Collection 은 원시타입을 받을 수 없기 때문에, Wrapping 된 인스턴스 클래스를 사용한다.

        /* 기본타입 */        /* 래퍼클래스 */
        /*  byte */              /* Byte  */
        /*  short  */            /* Short */
        /*  int  */               /* Integer */
        /*  long  */             /* Long */
        /*  float  */             /* Float */
        /*  double  */          /* Double */

        /*  박싱(Boxing) 과 언박싱(UnBoxing)
        *   기본(원시)타입을 래퍼클래스로 인스턴스화 하는것을 Boxing 이라고 하며,
        *   래퍼클래스로 인스턴스화 된 것을 기본 타입으로 변경하는 것을 UnBoxing 이라고 한다. */

        int intValue = 20;  // 기본자료형
        //Integer boxingNum = new Integer(intValue); // 인스턴스화 - 박싱 (생성자 이용)
        Integer boxingNum2 = Integer.valueOf(intValue); // 인스턴스화 - static 이용

        //System.out.println(boxingNum);
        System.out.println(boxingNum2);

        // UnBoxing : 인스턴스화 된 값을 기본 타입으로 변경
        int unBoxingNum = boxingNum2; // 자동으로 형변환 해줌.

        /* 오토 박싱(Auto Boxing) & 오토 언박싱(Auto UnBoxing)
        *  JDK 1.5 부터는 박싱과 언박싱이 필요한 상황에는 컴파일러가 자동으로
        *  즉, 묵시적으로 형변환을 처리해준다. */

        System.out.println(unBoxingNum);

        Integer boxingNum3 = intValue; // 오토 박싱 : 원시타입의 intValue 를 자동으로 Integer 타입에 대입
        int unBoxing2 = boxingNum2; // 오토 언박싱 : Integer 타입의 boxingNum2를 원시타입에 대입.
    }
}
