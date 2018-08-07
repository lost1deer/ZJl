package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class add {

    public void add(int id,String newslist,String type,String author,String updatetime,int click){
        Connection conn = jdbcUtils.getConnection();
        try {
                    String sql = "insert into newsinfo(newslist,id,type,author,updatetime,click) values (?,?,?,?,?,?)"; // 插入数据的sql语句
            PreparedStatement st =conn.prepareStatement(sql);
            st.setString(1,newslist);
            st.setInt(2,id);
            st.setString(3,type);
            st.setString(4,author);
            st.setString(5,updatetime);
            st.setInt(6,click);
            st.execute();
//            Statement stmt1 =conn.createStatement();    // 创建用于执行静态sql语句的Statement对象
//                    int count = stmt1.executeUpdate(sql);  // 执行插入操作的sql语句，并返回插入数据的个数
          //          System.out.println("向biao中插入了 " + count + " 条数据"); //输出插入操作的处理结果
                    conn.close();   //关闭数据库连接

             } catch (SQLException e) {
                               e.printStackTrace(); }
             }
//             public static void main(String[] args){
//        add a=new add();
//        a.add(1,"adsd","ww","ww","ww",6);
//             }
    }

