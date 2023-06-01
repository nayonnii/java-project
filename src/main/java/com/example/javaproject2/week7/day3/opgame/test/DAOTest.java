package com.example.javaproject2.week7.day3.opgame.test;

import com.example.javaproject2.week7.day3.opgame.model.Member;
import com.example.javaproject2.week7.day3.opgame.model.MemberDAO;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DAOTest {  //DAO: 여기서 사용할만한 클래스..?(사람마다 조금씩 다르게 정의)

    @Test
    public void testLoginAndLogout() {
        String id = "taster";
        String pw = "1234";

        MemberDAO dao = new MemberDAO();
        dao.initMember(); // DB 초기화(DB초기화를 안하면 안됨 (person > initperson이 그 역할)
        Optional<Member> user = dao.login(id, pw);
        if(user.isEmpty()) {    // user가 없으면 자동가입
            dao.join(id, pw);
            user = dao.login(id, pw);
        }

        assertEquals(id, user.get().getID());
        assertTrue(user.get().isLogined()); // 로그인 됐는지 여부

        user = dao.logout(id);  // id를 로그아웃 해라, (id를 사용 안하는 추세인데 사용하게 되면 sdq나 idq..? 사용?)
        assertFalse(user.get().isLogined()); // 로그아웃 됐는지 여부
        }
}
