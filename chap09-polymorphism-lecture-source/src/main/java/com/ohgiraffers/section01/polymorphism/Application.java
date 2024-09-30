package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */

        /* 필기.
        *   다형성 이란
        *   하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미한다.
        *   그렇기때문에 하나의 타입으로, 여러 타입의 인스턴스를 처리할 수 있고
        *   하나의 메서드 호출로 객체별로 각기 다른 방법으로 동작하게 만들 수 있다. */

        System.out.println("○ 동물 생성 ○");
        동물 animals = new 동물();
         animals.먹기();
         animals.뛰기();
         animals.자기();

        System.out.println("○ 코뿔소 ○");
        코뿔소 cow = new 코뿔소();
        cow.먹기();
        cow.뛰기();
        cow.자기();
        cow.갸우뚱();

        System.out.println("○ 개구리 ○");
        개구리 frog = new 개구리();
        frog.먹기();
        frog.뛰기();
        frog.자기();
        frog.몰라();
        
        /* 필기.
        *   개구리와 코뿔소는 동물 클래스를 상속 받았다.
        *   따라서 개구리는 개구리 이면서 동물이다. ★
        *   코뿔소도 코뿔소이면서 동물이다. ★ */
        
        /* 목차. 1. 부모의 타입으로 자식 인스턴스 주소값 저장 */
        
        동물 a1 = new 개구리();
        동물 a2 = new 코뿔소();

        // 동물은 동물이지 개구리가 아니다. IS-A 관계까 성립되어야 한다.
        // 개구리 f1 = new 동물();

        /* 목차 2. 동적 바인딩 확인 */
        /* 필기.
        *   컴파일 시점에는 해당 타입의 메서드와 연결(동물)되어 있다가
        *   런타임 시 실제 객체가 가진 오버라이딩 된 메서드로 바인딩이 바뀌어
        *   동작하는것을 의미한다. */

        System.out.println("○ 동적 바인딩 확인 ○");
        a1.먹기();
        a2.먹기();

        /* 필기.
        *   현재 레퍼런스 변수의 타입은 동물 이기 때문에 개구리와 코뿔소가 가진
        *   고유의 기능은 작동 시킬 수 없다. */

        // a1.몰라(); // 지금 시점에선 동물을 가르키고 있기 때문에, 바인딩 할 수 없다.

        /* 목차. 3. 클래스 타입 형변환 확인 */

        System.out.println("○ 클래스 타입 형변환 확인 ○");
        ((개구리)a1).몰라(); // 동물에서 개구리로 강제 형변환
        ((코뿔소)a2).갸우뚱();

        /* 주의 : 타입 형변환을 잘못하게되면, 컴파일 시에는 문제가 없지만 런타임시 문제 발생. */
        //((개구리)a2).몰라(); // 될것 같지만, 런타임 시키면  ClassCast 오류.

        /* 목차. 4. instanceof 연산자로 확인 */
        // 아래 3개가 true 이므로, 이게 바로 '다형성'
        System.out.println("○ instanceof 연산자 확인 ○");
        System.out.println("a1이 개구리 타입인지 확인 : " + (a1 instanceof 개구리)); //boolean 반환.
        System.out.println("a1이 코뿔소 타입인지 확인 : " + (a1 instanceof 코뿔소));
        System.out.println("a1이 동물 타입인지 확인 : " + (a1 instanceof 동물));
        System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));

        /* 목차. 5. 클래스의 명시적-묵시적 형변환 확인 */
        // 업캐스팅과 다운캐스팅
        /* 필기.
        *   클래스 형변환은 up-casting 과 down-casting 으로 구분할 수 있다.
        *   up : 상위 타입 형변환 - 예) 개구리 -> 동물 (강제형변환 必)
        *   down : 하위 타입 형변환 - 예) 동물 -> 개구리 */

        동물 a3 = (동물)new 개구리(); //  up-casting - 오류나는게 맞음
        코뿔소 a4 = (코뿔소)new 동물(); // down-casting - 오류나는게 맞음


    }
}
