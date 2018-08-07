package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class search {
    public void search(){
        Connection conn = jdbcUtils.getConnection();
        int id;
        String newslist;
        String type;
        String updatetime;
        String author;
        int  click;
        String Sql="SELECT *" +
                "FROM newsinfo" +
                "where id=4";

                 try{
                         Statement stmt=conn.createStatement(); //也可以使用PreparedStatement来做
                         ResultSet rs=stmt.executeQuery(Sql);//执行sql语句并返还结束

                    while(rs.next()){//遍历结果集 ，向下一行
                        newslist=rs.getString("newslist");
                        id=rs.getInt("id");
                        type=rs.getString("type");
                        author=rs.getString("author");
                        updatetime=rs.getString("updatetime");
                        click=rs.getInt("click");
                             }
                       if(rs !=null){
                             try{
                                     rs.close();
                                 } catch (SQLException e){
                                 e.printStackTrace();
                                }
                         }
                    if(stmt !=null){
                             try{
                                    stmt.close();
                                 }catch(SQLException e){
                                  e.printStackTrace();
                               }
                         }
                     if(conn !=null){
                             try{
                                     conn.close();
                                    }catch(SQLException e){
                                     e.printStackTrace();
                                 }
                         }
                  }catch(Exception e){
                    e.printStackTrace();
                  }
          }
    }

