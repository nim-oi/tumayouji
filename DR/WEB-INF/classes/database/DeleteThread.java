package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import beans.ThreadBean;

public class DeleteThread{
    public void delete(String threadid){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Oracleに接続する
            Connection cn=
                    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
            System.out.println("接続完了");

            //select文
            String sql="update threadtable set thread_flag=1 where thread_id="+threadid;
            System.out.println(sql);
            //Statementインターフェイスを実装するクラスをインスタンス化する
            Statement st=cn.createStatement();

            st.executeUpdate(sql);


//            cn.commit();

            st.close();

            cn.close();

            System.out.println("切断完了");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("クラスがないみたい。");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("SQL関連の例外みたい。");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}