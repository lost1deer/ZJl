package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
    public void update(int id,String newslist,String type,String author,String updatetime){

        Connection conn = jdbcUtils.getConnection();
        System.out.println(newslist);
        String sql = "UPDATE newsinfo SET newslist='"+newslist+"' WHERE id="+id;
        String sq2 = "UPDATE newsinfo SET type='"+type+"' WHERE id="+id;
        String sq3 = "UPDATE newsinfo SET author='"+author+"' WHERE id="+id;
        String sq4 = "UPDATE newsinfo SET updatetime='"+updatetime+"' WHERE id="+id;



             try {
                      Statement stmt1 = conn.createStatement();
                 Statement stmt2 = conn.createStatement();
                 Statement stmt3 = conn.createStatement();
                 Statement stmt4 = conn.createStatement();//或者用PreparedStatement方法
                      stmt1.executeUpdate(sql);
                      stmt2.executeUpdate(sq2);
                      stmt3.executeUpdate(sq3);
                      stmt4.executeUpdate(sq4);

                      //执行sql语句
                 if (stmt1 != null) {
                          try {
                                 stmt1.close();
                              } catch (SQLException e) {
                                 e.printStackTrace();
                              }
                      }
                     } catch (SQLException e) {
                        e.printStackTrace();
                      }
               }

}
