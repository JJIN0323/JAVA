package com.ohgiraffers.section03.dto;

/* 필기.
*   DTO, Dto, VO(Value Object) <- 데이터를 묶어두기 위한 클래스  */

public class MemberDto {

    private int memberNo;       // 회원번호
    private String name;          // 회원이름
    private int age;                 // 나이
    private  char gender;         // 성별
    private  double height;       // 키
    private  double weight;       // 몸무게
    private boolean isActivated; // 회원 탈퇴 여부

    /* 필기.
    *   설정자(Setter)와 접근자(Getter)는 실무에서 암묵적으로 통용되는
    *   규칙이 존재한다.  */

    /*  필기 .
    *   설정자의 작성규칙 :
    *   - 필드값을 변경 할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로
    *     선언을 하고, 호출 당시 전달되는 매개변수의 값을 이용하여 필드값을 변경
    *     [ 표현식 ]
    *     public void setName(String name) {
    *         this.name = name;
    *     }
    *
    *    Set 필드명(매개변수) {
    *       this.필드명 = 매개변수;
    *    }  */

    /* 필기.
    *   접근자 작성 규칙
    *   - 필드의 값을 받환 받을 목적의 메서드 집합을 의미한다.
    *     필드에 접근을 해서  setter 를 통해 적용 된 값을  return 을 통해
    *     반환을 하게 되며. 이 때 반환 타입은 반환하려는 값의 자료형과 일치;한다.
    *     [표현식]
    *     public 자료형 get 필드명() {
    *         return 반환값;
    *     } */

    /* 목차. 1. setter(설정자) 작성 */
    // 해당하는 필드에 우리가 전달한 memberNo를 대입하겠다.
    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    /* 목차. 2. getter (접근자) 작성 */
     public int getMemberNo() {
         return memberNo;
     }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
