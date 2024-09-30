package com.ohgiraffer.section01.string;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 객체를 만드는 방법과 인스턴스가 생성되는 방식 */

        /* 필기.
        *   문자열 객체를 만드는 방법
        *   1. " " 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (싱글톤)
        *   2. new String("문자열") :  */

        String str1 = "Hello";
        String str2 = "Hello";

        /* 1. 리터럴 형태.
        *   리터럴 형태로 만든 문자열 인스턴스는 동일한 값을 가지게 되면
        *   하나의 인스턴스로 관리하게 된다. (= 싱글톤) 주소값을 비교하는
        *   == 연산으로 비교 시 서로 동일한 주소를 비교하여 true 를 반환한다. */

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        /* 2. new 문자열 형태.
        *   항상 새로운 공간을 만들어주기 때문에, 주소값이 같을 수 없다. */

        System.out.println(str1 == str2); // true : 같은 주소값
        System.out.println(str3 == str4); // false : 다른 주소값

        /* 필기.
        *   문자열의 가장 큰 특징은 '불변'이다.
        *   기존 문자열에 + 연산은 수행하는 경우,
        *   문자열을 수정하는것이 아닌 새로운 문자열을 할당하게 된다. */

        str1  += " World";

        System.out.println(str1 == str2); // false : World 가 추가되어 새료운 공간을 만들었으므로 주소가 바뀜.

        /* 필기.
        *   equals() : (주소값) 인스턴스를 비교하는것이 아닌 '문자열 값'을 비교하여,
        *               동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false 를 반환한다.
        *               따라서 인스턴스 생성 방식과 상관없이 값이 같은 지를 확인하기 위해서는
        *               == 연산대신, equals() 메서드를 사용해야 한다. */

        System.out.println(str2.equals(str3)); // true : 문자열의 값만 비교하므로 true
        System.out.println(str2.equals(str4)); // true : 문자열의 값만 비교하므로 true

    }
}
