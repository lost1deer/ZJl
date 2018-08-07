package utils;

import java.sql.*;
import java.util.ArrayList;

public class dao {
    jdbcUtils d=new jdbcUtils();

    public ArrayList<String> getUsers(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt1 = null;
        try {
            stmt1 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs1 = null;

        ArrayList<String> li1 = new ArrayList<>();


        try {
            rs1 = stmt1.executeQuery("select Username,Password from Users");
            while (rs1.next()) {

                System.out.println(rs1.getString("Username"));

                li1.add(rs1.getString("Username"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li1;
    }

    public ArrayList<String> getPass(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt2 = null;
        try {
            stmt2 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs2 = null;

        ArrayList<String> li2 = new ArrayList<>();


        try {
            rs2 = stmt2.executeQuery("select Username,Password from Users");
            while (rs2.next()) {

                System.out.println(rs2.getString("Password"));

                li2.add(rs2.getString("Password"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li2;
    }

    public ArrayList<String> getNewsList(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt3 = null;
        try {
            stmt3 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs3 = null;

        ArrayList<String> li3 = new ArrayList<>();


        try {
            rs3 = stmt3.executeQuery("select newslist from newsinfo");
            while (rs3.next()) {

                System.out.println(rs3.getString("newslist"));

                li3.add(rs3.getString("newslist"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li3;
    }

    public ArrayList<String> getType(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt4 = null;
        try {
            stmt4 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs4 = null;

        ArrayList<String> li4 = new ArrayList<>();


        try {
            rs4 = stmt4.executeQuery("select type from newsinfo");
            while (rs4.next()) {

                System.out.println(rs4.getString("type"));

                li4.add(rs4.getString("type"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li4;
    }

    public ArrayList<String> getAuthor(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt5 = null;
        try {
            stmt5 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs5 = null;

        ArrayList<String> li5 = new ArrayList<>();


        try {
            rs5 = stmt5.executeQuery("select author from newsinfo");
            while (rs5.next()) {

                System.out.println(rs5.getString("author"));

                li5.add(rs5.getString("author"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li5;
    }

    public ArrayList<String> getUpadatetime(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt6 = null;
        try {
            stmt6 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs6 = null;

        ArrayList<String> li6 = new ArrayList<>();


        try {
            rs6 = stmt6.executeQuery("select updatetime from newsinfo");
            while (rs6.next()) {

                System.out.println(rs6.getString("updatetime"));

                li6.add(rs6.getString("updatetime"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li6;
    }

    public ArrayList<Integer> getClick(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt7 = null;
        try {
            stmt7 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs7 = null;

        ArrayList<Integer> li7 = new ArrayList<>();


        try {
            rs7 = stmt7.executeQuery("select click from newsinfo");
            while (rs7.next()) {

                System.out.println(rs7.getInt("click"));

                li7.add(rs7.getInt("click"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li7;
    }
    public ArrayList<Integer> getId(){
        Connection conn = jdbcUtils.getConnection();
        Statement stmt8 = null;
        try {
            stmt8 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs8 = null;

        ArrayList<Integer> li8 = new ArrayList<>();


        try {
            rs8 = stmt8.executeQuery("select id from newsinfo");
            while (rs8.next()) {

                System.out.println(rs8.getInt("id"));

                li8.add(rs8.getInt("id"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li8;
    }
//    public static void main(String []args){
//        dao d1=new dao();
//        ArrayList<String> li1=d1.getUsers();
//        ArrayList<String> li2=d1.getPass();
//        for (int i = 0; i < li1.size(); i++) {
//            System.out.println(li1.get(i));  //.get(index)
//            System.out.println(li2.get(i));
//        }
//    }
}




