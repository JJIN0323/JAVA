package com.ohgiraffers.section02.use;

public class MemberDTO {

    // DTO Class
    private int no;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    // 1. 기본생성자 Alt + insert 눌러서 select none!

    public MemberDTO() {

    }

    // 2. 모든 필드를 초기화하는 생성자

    public MemberDTO(int no, String id, String pwd, String name, int age, char gender) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 3. getter & setter

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // 4. toString

    @Override
    public String toString() {
        return "MemberDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
