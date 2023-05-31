package com.example.javaproject2.week7.day2.connjdbc.model;

import java.sql.SQLException;

public class CountryDAO extends BaseDAO{
    public void getCodeName() {
        String sql = "select code, name from country order by code, name";

        try {
            getConn();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                // 컬럼명으로 출력하기
                System.out.print(rs.getString("code") + "\t");
                System.out.print(rs.getString("name") + "\n");
                // 인덱스 번호로 출력하기
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }
}

