package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
    public void delete(int id){


        Connection conn = jdbcUtils.getConnection();
        String Sql = "delete  from newsinfo  where id="+id;
             try {
                      Statement stmt = conn.createStatement();// 或者用PreparedStatement方法
                      stmt.executeUpdate(Sql);//执行sql语句
                 if (stmt != null) {
                     try {
                              stmt.close();
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                 }}
                  catch (SQLException e) {
                      e.printStackTrace();
                    }
    }
}
