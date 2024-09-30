package com.ohgiraffers.section03.map;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Map 의 자료구조에 대해 이해하고 HashMap 을 이용할 수 있다. */
        
        /* 필기
        *   Map 인터페이스의 특징
        *   일반적인 Collection 인터페이스와는 다른 저장 방식을 가지고 있다.
        *   Map 의 가장 큰 특징은 키(Key) 와 값(value)을 하나의 세트로 저장한다. */

        /* 키(Key) 란?
        *   값을 찾기 위한 이름의 역할을 하는 객체를 의미한다 -> 변수의 역할
        *   1. 키는 중복 저장이 불가능하지만, 키가 다르다면 값은 중복이 가능하다.
        *   2. 요소의 저장 순서를 유지하지 않는다. */

        /* Map 인터페이스를 구현한 클래스는 대표적으로,
        *   HashMap, HashTable, TreeMap 등이 있다.
        *   이 세가지 클래스 중 HashMap 이 가장 많이 사용되며,
        *   해시 알고리즘이 적용되어 검색 속도가 매우 빠른 특징을 가지고 있다. */

        HashMap hmap = new HashMap();

        // 앞은 key 뒤는 value

        /* 목차. 1. HashMap 인스턴스에 값 저장하기 */
        // put() : Map 에 값을 집어넣는 메서드
        hmap.put("숫자", new Date());
        hmap.put(145, "문자"); // 오토박싱 - Integer 타입과 String 타입임.
        hmap.put(23.4, 11.8); // Double 타입임.

        System.out.println("hmap = " + hmap); // 순서유지 X & Key 와 Value 묶음.

        /* 목차. 2. 키는 중복 저장 불가능. (Set 방식) */
        // 키는 중복저장이 되지 않기 때문에 가장 최신의 키로 덮어 씌워진다.
        hmap.put(145, "숫자다?");
        System.out.println("hmap = " + hmap);

        /* 목차. 3. 값은 중복 저장이 가능한지 확인 (List 방식) */
        // Key 값이 중복되지 않는다면 value 는 중복 저장이 가능하다.
        hmap.put(125, "숫자다?");
        hmap.put(55, "숫자다?");
        System.out.println("hmap = " + hmap);
        
        /* 목차. 4. Map 에 저장된 값 꺼내기 */
        System.out.println("hmap.get(145) = " + hmap.get(145)); // 145 = 키 값

        hmap.remove(55);
        System.out.println("hmap = " + hmap);

        // 저장된 객체 수 확인 size() 메서드
        System.out.println("hmap.size() = " + hmap.size());

        // 다형성 적용해서 HashMap 만들기
        Map<String, String> hmap2 = new HashMap<>(); // Map 은 HashMap 또는 HashTable 써야함

        hmap2.put("1", "가"); // key 값은 String 으로 권장한다.
        hmap2.put("2", "나"); // value 는 DTO 가 많이 나올 예정.
        hmap2.put("3", "다");
        hmap2.put("4", "라");
        hmap2.put("5", "마");
        hmap2.put("6", "바");

        System.out.println("hmap2 = " + hmap2);

        /* 목차. 1. keySet() 을 이용해서 키만 따로 Set 으로 만들고,
        *             iterator() 로 목록 만들기  */
        Set<String> keySet = hmap2.keySet(); // set 방식으로 바뀜.
        Iterator<String> keyIter = keySet.iterator(); // iterator 방식으로 바뀜.

        /* 목차. 2. Iterator 에서 제공하는 hasNext(), next() 메서드를 사용해서
        *             반복문으로 출력하기. */

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println("key = " + key);
            System.out.println("value = " + value);
            System.out.println("key + value = " + key + value);
        }

    }
}
