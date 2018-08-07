package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addUser {
    public void addUser(String Username,String Password){
        Connection conn = jdbcUtils.getConnection();
        try {
            String sql = "insert into users(Username,Password) values (?,?)"; // 插入数据的sql语句
            PreparedStatement st =conn.prepareStatement(sql);
            st.setString(1,Username);
            st.setString(2,Password);

            st.execute();
//            Statement stmt1 =conn.createStatement();    // 创建用于执行静态sql语句的Statement对象
//                    int count = stmt1.executeUpdate(sql);  // 执行插入操作的sql语句，并返回插入数据的个数
            //          System.out.println("向biao中插入了 " + count + " 条数据"); //输出插入操作的处理结果
            conn.close();   //关闭数据库连接

        } catch (SQLException e) {
            e.printStackTrace(); }
    }
    }

