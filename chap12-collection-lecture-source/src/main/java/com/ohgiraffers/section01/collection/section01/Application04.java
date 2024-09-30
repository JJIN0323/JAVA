package com.ohgiraffers.section01.collection.section01;

import java.util.LinkedList;
import java.util.Queue;

public class Application04 {
    public static void main(String[] args) {

    /* 수업목표. Queue 에 대해 이해하고 사용할 수 있다. */

    /* 필기.
    *   Queue
    *   선형 메모리 공간에 데이터를 저정하는 선입선출(FIFO)
    *   First Input First Out 방식의 자료구조로 Queue 인터페이스를 상속 받는
    *   하위 인터페이스는 다양하지만 대부분은 LinkedList 를 이용해 인스턴스를 생성한다. */

        Queue<String> que = new LinkedList<>();
        // Queue 데이터 넣기 offer() 메서드를 이용한다.
        que.offer("안녕");
        que.offer("하세요");
        que.offer("나는");
        que.offer("공부중");
        que.offer("입니다");
        que.offer("뭐가");
        que.offer("많아서");
        que.offer("어려워요");

        System.out.println("que = " + que);

        /* Queue 에서 데이터를 꺼내는 방법은 2가지다.
        *   peek() : 해당 큐에 가장 앞에 있는 요소 (먼저 들어온)를 반환한다.
        *   poll() : 해당 큐에 가장 앞에 있는 요소 반환 후 제거. */

        System.out.println("peek() = " + que.peek());
        System.out.println("peek() = " + que.peek());

        // 삭제 되지 않은 거 확인.
        System.out.println("que = " + que);

        // 해당 큐 가장 앞에 있는 요소 반환 후 제거.
        System.out.println("poll() = " + que.poll());
        System.out.println("poll() = " + que.poll());

        System.out.println("que = " + que);

    }
}
