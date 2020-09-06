package cn.codingyoo.utils;
/*
 *  @author:  CodingYoo
 *  date:     9/6/2020  3:59 PM Sun
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DbUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        //加载数据库配置文件
        Properties properties = new Properties();
        InputStream prop = DbUtils.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    //获取数据库连接
    public static Connection getConnection()   {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    //编写查询共同类
    public static ResultSet execute(Connection connection, PreparedStatement pstm, ResultSet rs, String sql, Object[] params) throws Exception{
        pstm = connection.prepareStatement(sql);
        for(int i = 0; i < params.length; i++){
            pstm.setObject(i+1, params[i]);
        }
        rs = pstm.executeQuery();
        return rs;
    }
    //增删改公共类
    public static int execute(Connection connection,PreparedStatement pstm,String sql,Object[] params) throws Exception{
        int updateRows = 0;
        pstm = connection.prepareStatement(sql);
        for(int i = 0; i < params.length; i++){
            pstm.setObject(i+1, params[i]);
        }
        updateRows = pstm.executeUpdate();
        return updateRows;
    }
    //关闭连接
    public static boolean closeResource(Connection connection,PreparedStatement pstm,ResultSet rs) throws SQLException {
        boolean flag = true;
        if(rs != null){
            try {
                rs.close();
                rs = null;//GC回收
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                flag = false;
            }
        }
        if(pstm != null){
            try {
                pstm.close();
                pstm = null;//GC回收
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                flag = false;
            }
        }
        if(connection != null){
            try {
                connection.close();
                connection = null;//GC回收
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                flag = false;
            }
        }

        return flag;
    }
}
