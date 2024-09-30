package com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {

        /* 수업목표 : 데이터를 추상화(필요한것만 추출) 하는 기법을 이해 할 수 있다. */

        /* 필기.
        *   캡슐화의 원칙에는 일부 어긋나긴 하지만, 다른 목적을 가진
        *   클래스와 객체를 추상화 하는 기법이 있다.
        *   행위(메서드)위주가 아닌, 데이터를 하나로 뭉치기 위한
        *   객체(Data Transfer Object)의 경우이다.
        *   이러한 객체를 설계할 때는 행위가 아닌 데이터 위주이며,
        *   캡슐화를 적용하여 모든 필드를 private 로 막고
        *   각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작정해둔다. */

        /* 필기.
        *   어떤 값을 쓸 줄 모르니, 미리 다 준비해두는 선물세트 느낌이다.
        *   private, 캡슐화가 된 필드와, 필듸의 값을 수정할 수 ㅇㅆ는
        * 설정자(Setter), 필드에 값을 접근 할 수 있는 접근자 (Getter)로
        * 구성이 된다. 주로 계층간의 데이터를 주고 받을 목적이다. */

        MemberDto member = new MemberDto();
        member.setMemberNo(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setHeight(177);
        member.setWeight(65);
        member.setActivated(true);

        // 위에 입력된 값을 getter 로 가져올 수 있다.

        System.out.println("회원번호 : " + member.getMemberNo());
        System.out.println("회원명 : " + member.getName());
        System.out.println("회원나이 : " + member.getAge());
        System.out.println("회원성별 : " + member.getGender());
        System.out.println("회원키 : " + member.getHeight());
        System.out.println("회원몸무게 : " + member.getWeight());
        System.out.println("회원상태 : " + member.isActivated());
    }
}
