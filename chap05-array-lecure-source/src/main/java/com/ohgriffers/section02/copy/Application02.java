package com.ohgriffers.section02.copy;

public class Application02
{
    public static void main(String[] args) {

    /* 필기.
    *   얕은 복사의 활용
    *   얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
    *   리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다. */

        String [] names = {"푸바오", "러바오", "아이바오"};

        // 얕은 복사 확인을 위한 hashcode() 구문
        System.out.println("names  배열의 hashcode() : " + names.hashCode());

        // names 를 다른 메소드로 전달.
        // 우리가 만든 배열을 출력하는 기능을 가진 메소드에 전달
        // 우리가 값을 보내면 -> 받는 곳도 값을 받을 준비를 해야한다.

        /* 목차. 1. 인자와 매개변수를 활용하는 얕은 복사 */
        print(names);

        /* 목차. 2. 리턴값으로 활용 */
        String[] animals = getAnimals(); // 주소값
        System.out.println("리턴 받은 anmimals 의 hashcode() : " + animals.hashCode());

        print(animals);

    }

    // 필기 : print() 메소드의 역할은 우리가 전달한 배열을 출력하는 역할이다.
    // 자바에서는 자료형이 가장 중요하다 !!!
    public static void print(String[] baoFamily) { // String baoFamily = names; 동일함.
        //String [] baoFamily = new String[bodFamily.length];
        System.out.println("baoFamily 의 hashcode() : " + baoFamily.hashCode());

        for ( int i = 0; i < baoFamily.length; i++ ) {
            System.out.print(baoFamily[i] + " ");
        }
        System.out.println();
    }

    // 자료형을 쓰게 되면 '반드시'  리턴값을 줘야한다!
    public static String [] getAnimals() {

        String [] animals = {"후이바오", "루이바오"};
        System.out.println("새로 만든 animals 의 hashcode() : " + animals.hashCode());
        return animals;
    }
}
