package com.example.javaproject2.week7.day2.connjdbc.model;

import java.sql.*;


public class BaseDAO {
    protected Connection conn = null;
    protected Statement stmt = null;
    protected PreparedStatement pstmt = null;
    protected ResultSet rs = null;

    protected void getConn() {
        String url = "jdbc:sqlite:C:\\Users\\나연\\hello_linux\\world.db";
        String user = "";   // 추후 호스트 user 필드 필요 시 대비하여 생성
        String pw = "";     // 추후 호스트 pw 필드 필요 시 대비하여 생성

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void close() {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (pstmt != null) pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
