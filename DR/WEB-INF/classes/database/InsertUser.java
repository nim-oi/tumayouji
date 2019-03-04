package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUser{

    public static int user_id(String name,String pass){
        int count = 0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection cn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");

            cn.setAutoCommit(false);

            System.out.println("Ú‘±Š®—¹");

            String sql="insert into user_table(user_id,user_name,user_pass) values(s_user_id.nextval,'"+name+"','"+pass+"')";
            System.out.println(sql);
            Statement st=cn.createStatement();

            count=st.executeUpdate(sql);

            System.out.println(count+"Œˆ—‚µ‚Ü‚µ‚½");

            cn.commit();

            st.close();

            cn.close();

            System.out.println("ˆ—‚ªI—¹‚µ‚Ü‚µ‚½");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
}

