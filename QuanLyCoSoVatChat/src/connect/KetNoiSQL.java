package Connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KetNoiSQL {
    
    
    private Connection con = null;
    private static String DB_URL = "jdbc:mysql://localhost:3306/quanlyktxsinhvien";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
     public static void closeConnection(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public static Connection ConnectSQL() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
   public KetNoiSQL() {
        String url = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(url);
            try {
                con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   public static Connection getConnection(){
        Connection conn = null;
        String url = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(url);
            try {
                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
   
   public ResultSet GetResultSet(String tableName) throws SQLException {
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String sql = "select * from " + tableName;
        rs = stmt.executeQuery(sql);
        return rs;
    }
   
   public void Close() throws Exception {
        con.close();
    }
   
}