package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 HashMap 을 이용할 수 있다. */

        /* 필기.
        *   Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        *   1. 요소의 저장 순서를 유지하지 않는다.
        *   2. 같은 요소의 중복 저장 불가능 (null 값도 하나의 null 만 허용) */

        /* 필기.
        *   HashSet 클래스
        *   Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        *   해시 알고리즘을 사용해서 검색 속도가 빠르다는 장점을 가지고 있다. */

        HashSet<String> hset = new HashSet<>();

        hset.add(new String("java"));
        hset.add("배우는데");
        hset.add("너무");
        hset.add("어렵다");
        hset.add("뭐가");
        hset.add("뭔지");
        hset.add("모르겠음.");

        // 1. 저장 순서 유지 안 함.
        System.out.println("hset = " + hset); // 저장순서 지 멋대로임ㅋㅋㅋ
        // 2. 중복 된 값 허용 여부 확인 (불가능하기에 저장 안해줌)
        hset.add("java");
        System.out.println("hset = " + hset);

        System.out.println("저장된 객체의 수 = " + hset.size());
        System.out.println("포함되어 있는 지 확인 = " + hset.contains("너무"));

        /* 필기.
        *   Set 은 저장 순서를 유지하지 않기 때문에
        *   저장된 객체를 하나씩 꺼낼 방법이 없다. */

        /* 목차. 1. toArray() 메서드를 이용해 배열로 변경 후 반복문 사용. */
        // toArray -> Object 클래스

        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

        /* 목차. 2. iterator() 반복자를 통한 목록화 연속 처리 */
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {
            System.out.println("iter = " + iter.next());
        }


    }
}
