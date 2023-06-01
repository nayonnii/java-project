package com.example.javaproject2.week7.day3.opgameex.model;

import java.sql.SQLException;
import java.util.Optional;

public class MemberDAO extends BaseDAO{
    /* Member 테이블 칼럼
    * seq: 순번
    * id: user ID
    * PW,: user PW,
    * islogined: 로그인 여부
    * created_at: 생성날짜
    * updated_at: 갱신날짜
    * */

    /* 테이블 초기화 메소드 */
    public void initMember() {
        String sql = """
                create table opg_member (
                seq integer primary key autoincrement,
                id text not null,
                pw text not null,
                islogined integer default '0',
                created_at text default current_timestamp,
                updated_at test default current_timestamp
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
                update opg_memger set islogined='1' where id = ? and pw = ?
                """;
        try {
            getConn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            int cnt = pstmt.executeUpdate();

            if(cnt > 0) {
                pstmt = conn.prepareStatement("select id, islogined from opg_member where id = ?");
                pstmt.setString(1, id);
                rs = pstmt.executeQuery();
                if(rs.next()) {
                    String rid = rs.getString(1);
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

    public Optional<Member> logout(String id) {
        String sql = """
                update opg_memger set islogined='0' where id = ?
                """;
        try {
            getConn();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            int cnt = pstmt.executeUpdate();

            if(cnt > 0) {
                pstmt = conn.prepareStatement("select id, islogined from opg_member where id = ?");
                pstmt.setString(1, id);
                rs = pstmt.executeQuery();
                if(rs.next()) {
                    String rid = rs.getString(1);
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
