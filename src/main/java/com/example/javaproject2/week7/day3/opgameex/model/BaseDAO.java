package com.example.javaproject2.week7.day3.opgameex.model;

import java.sql.*;

public class BaseDAO {
    protected Connection conn = null;
    protected Statement stmt = null;
    protected PreparedStatement pstmt = null;
    protected ResultSet rs = null;

    protected void getConn() {
        String url = "jdbc:sqlite:C:\\Users\\나연\\hello_linux\\java-project2\\world.db";    // 호스트 url
        String user = "";   // 호스트 user
        String pw = "";     // 호스트 pw

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
            if (pstmt != null) pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (stmt != null) stmt.close();
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
