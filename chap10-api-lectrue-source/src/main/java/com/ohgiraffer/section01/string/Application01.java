package com.ohgiraffer.section01.string;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. String 클래스의 자주 사용하는 메서드에 대해 숙지할 수 있다. */

        /* 필기.
        *   charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환 */

        String str1 = "apple ";

        for (int i = 0; i < str1.length(); i ++) {
            System.out.println(str1.charAt(i));
        }

        /* 필기.
        *   concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 물자열을 반환해준다.
        *                단, 원본 문자열에는 영향을 주지 않는다. */

        String str2 = "red ";
        String str3 = "sweet";

        System.out.println("concat() 메서드 사용 : " + str1+(str2.concat(str3)));
        System.out.println("concat() 동작 후 str2의 값 : " + str2); // 원본에는 영향을 미치지 않는다.

        System.out.println();

        /* 필기.
        *   trim()  : 문자열에 앞 뒤에 공백을 제거한 문자열을 반환한다. */

        String trimStr = "   JAVA   ";

        System.out.println("trim() 사용 전 : " + trimStr);
        System.out.println("trim() 사용 후 : " + trimStr.trim());
        System.out.println("원본 : " + trimStr); // 원본은 영향을 받지 않는다.

        System.out.println();

        /* 필기.
            toLowerCase() : 모든 문자를 소문자로 바꿔준다.
            toUpperCase() : 모든 문자를 대문자로 바꿔준다.
            단, 원본에는 영향을 미치지 않는다. */

        String caseStr = "JavaMysql";

        System.out.println("toLowerCase() 사용 : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() 사용 : " + caseStr.toUpperCase());

        System.out.println();

        /* 필기.
        *   substring() : 문자열의 일부를 잘라내어 새로운 문자열을 반환한다. */

        String subCase = "ClipString";
        System.out.println(subCase.substring(4)); // 4번째 인덱스부터 끝까지 반환 = String

        System.out.println();

        /* 필기.
        *   replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 사용한다. */

        String replaceStr = "111111-1000000";
        System.out.println(replaceStr.replace('0','*'));

    }
}

