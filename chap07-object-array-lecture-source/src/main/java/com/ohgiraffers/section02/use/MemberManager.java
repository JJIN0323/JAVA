package com.ohgiraffers.section02.use;

public class MemberManager {
    /* 필기.
    *   사용자에게 회원등록, 회원 조회를 요청 받게 되면
    *   1. 등록 관련 클래스에게 명령
    *   2. 조회 관련 클래스에게 명령 */

     public void signUpMembers() {
         MemberDTO[] members = new MemberDTO[5];
         members[0] = new MemberDTO(1, "user1", "pass1", "홍길동1", 4, '여');
         members[1] = new MemberDTO(2, "user2", "pass2", "홍길동2", 1, '남');
         members[2] = new MemberDTO(3, "user3", "pass3", "홍길동3", 3, '여');
         members[3] = new MemberDTO(4, "user4", "pass4", "홍길동4", 6, '남');
         members[4] = new MemberDTO(5, "user5", "pass5", "홍길동5", 2, '여');

         // 회원 등록에 특화된 직원
         MemberInsertManager insertManager = new MemberInsertManager();
         insertManager.insert(members);
     }

    public void searchAllMember() {
        MemberSearchManager searchManager = new MemberSearchManager();
        MemberDTO[] result = searchManager.searchAllMember();

        for (MemberDTO member : result) {
            System.out.println(member.toString());
        }

        System.out.println("총 " + result.length + "명의 회원이 가입되어 있습니다.");
     }
}
