package utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcUtils {


    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/news?characterEncoding=utf-8";
    private static final String USER="root";
    private static final String PASSWORD="root";

    private static Connection conn=null;


    //链接数据库
    public static Connection getConnection(){

        try {
            Class.forName(DRIVER);//加载驱动
            conn=DriverManager.getConnection(URL,USER,PASSWORD);//创建数据库的连接
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
    //关闭数据库
    public void closeConn(){
        Connection con = getConnection();
        try {
            if(!con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
