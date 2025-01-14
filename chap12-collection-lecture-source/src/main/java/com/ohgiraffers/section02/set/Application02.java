package com.ohgiraffers.section02.set;

import java.util.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet 에 대해 이해하고 사용할 수 있다. */

        /* 필기.
            TreeSet 클래스는 데이터가 정렬 된 상태로 저장되는
            이진 트리 형태로 요소를 저장하게 된다.
            이진 검색 트리 구조는 데이터를 추가하거나 제거하는 등의
            기본 동작 시간이 매우 빠르다. */

        TreeSet<String> tset = new TreeSet<>();

        tset.add("1");
        tset.add("2");
        tset.add("3");
        tset.add("4");
        tset.add("5");
        tset.add("6");
        tset.add("7");

        // 자동 오름차순 정렬을 해준다.
        System.out.println("tset = " + tset);

        /* 필기. 로또번호 발생기 실습 */
        /*  요구조건
            1. 로또 번호는 중복이 될 수 없다.
        *   2. 로또 번호는 오름차순 정렬로 나오게 한다. */
        
        // 다형성을 적용해서 인스턴스 생성
        Set<Integer> lotto = new TreeSet<>();
        //

        while (lotto.size() < 6) {
            lotto.add(((int) (Math.random() * 45)) + 1);
            System.out.println("lotto = " + lotto);
        }
        System.out.println("당첨 번호는 = " + lotto);


    }
}
