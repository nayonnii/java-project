package com.example.javaproject2.week7.day3.opgame.model;

import java.sql.SQLException;
import java.util.Optional;

public class MemberDAO extends BaseDAO {

    public void initMember() {  //member테이블 필요 컬럼: id, pw, 로그인여부 상태값, 순번(idx or sequance..), 생성날짜, 갱신날짜   *항상 필요: 순번, 생성날짜, 갱신날짜
        String sql = """
                    create table opg_member (
                     seq integer primary key autoincrement,
                     id text not null,
                     pw text not null,
                     islogined integer default '0',
                     created_at text default current_timestamp,
                     updated_at text default current_timestamp
                     )
                    """;
        try {
            getConn();
            stmt = conn.createStatement();
            stmt.executeUpdate("drop table if exists opg_member");
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }

    public Optional<Member> login(String id, String pw) {
        String sql = """
                    update opg_member set islogined='1' where id = ? and pw= ?
                    """;
        try {
            getConn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            int cnt = pstmt.executeUpdate();    // 리턴할 꺼 아니고 여기서만 쓸 꺼니까 int cnt

            if(cnt > 0) {
                pstmt = conn.prepareStatement("select id, islogined from opg_member where id= ?");
                pstmt.setString(1, id);
                rs = pstmt.executeQuery();
                if(rs.next()) {
                    String rid = rs.getString(1);   //결과라서 'r' 붙인 rid
                    boolean risLogined = rs.getBoolean(2);
                    return Optional.of(new Member(rid, risLogined));
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
        return Optional.empty();
    }


    public int join(String id, String pw) {
        int cnt = 0;
        String sql = "insert into opg_member(id, pw) values(?, ?)";
        try {
            getConn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            cnt = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
        return cnt;
    }

    public Optional<Member> logout(String id) { // 로그인과 코드 거의 비슷
        String sql = """
                    update opg_member set islogined='0' where id =?
                    """;
        try {
            getConn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
//            pstmt.setString(2, pw);
            int cnt = pstmt.executeUpdate();    // 리턴할 꺼 아니고 여기서만 쓸 꺼니까 int cnt

            if(cnt > 0) {
                pstmt = conn.prepareStatement("select id, islogined from opg_member where id=?");
                pstmt.setString(1, id);
                rs = pstmt.executeQuery();
                if(rs.next()) {
                    String rid = rs.getString(1);   //결과라서 'r' 붙인 rid
                    boolean risLogined = rs.getBoolean(2);
                    return Optional.of(new Member(rid, risLogined));
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
        return Optional.empty();
    }
}
