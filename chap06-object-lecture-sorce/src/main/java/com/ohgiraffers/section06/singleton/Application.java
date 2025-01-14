package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다. */

        /* 필기.
        *   singleton 패턴이란
        *   어플리케이션이 시작될 때 어떠한 클래스가 최초 한번만 메모리를 할당하고
        *   그 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하며
        *   메모리 낭비를 방지할 수 있게 한다.
        *   ( 즉. 매번 new 키워드를 사용해서 인스턴스를 생성하지 않는다.)
        *
        *   장점 !
        *   - 첫번째 이용시에는 인스턴스를 생성해야 하기 때문에 속도 차이가 나지만,
        *     두번째 이용시에는 인스턴스 생성 없이 사용 가능하다.
        *     인스턴스가 절대적으로 한 개만 존재하는 것을 보장할 수 있다.
        *
        *   단점 !
        *   - 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면,
        *     결합도가 높아진다. ( 결합도 ▲ -> 한곳 수정 시 다른곳도 수정 必)
        *   - 동시성 문제를 고려해야 하기 때문에, 난이도가 있다. */

        /* 싱글톤 구현 방법.
        *   1. 이론 초기화 (Eager)
        *   2. 게으른 초기화 (Lazy) */

        /* 목차. 1. 이른 초기화 구현 */

        // 기본 생성자가 private 이기 때문에, 새로운 인스턴스를 생성 할 수 없다.
        //EagerSingleton eagerSingleton = new EagerSingleton();

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1의 hashcode() : " + eager1.hashCode());
        System.out.println("eager2의 hashcode() : " + eager2.hashCode());

        /* 목차. 2. 게으른 초기화 구현 */

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1의 hashcode() = " + lazy1.hashCode());
        System.out.println("lazy2의 hashcode() = " + lazy2.hashCode());

        /* 필기.
        *   이른 초기화는 클래스를 로드하는 속도는 느리지만,
        *   처음 인스턴스 반환하는 속도가 빠르다는 장점이 있다.
        *   게으른 초기화는 클래스 로드하는 속도는 빠르지만,
        *   메서드를 통해 인스턴스를 생성하고 넘기기 때문에
        *   첫번째 요청의 속도가 느리다는 특징을 가지고 있다. */


    }
}
