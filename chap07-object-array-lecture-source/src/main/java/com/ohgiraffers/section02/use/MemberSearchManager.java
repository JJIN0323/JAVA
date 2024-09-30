package com.ohgiraffers.section02.use;

public class MemberSearchManager {
    public MemberDTO[] searchAllMember() {

        return new MemberDTO[]{
                 new MemberDTO(1, "user1", "pass1", "홍길동1", 4, '여'),
                 new MemberDTO(2, "user2", "pass2", "홍길동2", 1, '남'),
                 new MemberDTO(3, "user3", "pass3", "홍길동3", 3, '여'),
                 new MemberDTO(4, "user4", "pass4", "홍길동4", 6, '남'),
                 new MemberDTO(5, "user5", "pass5", "홍길동5", 2, '여')
        };
    }
}
