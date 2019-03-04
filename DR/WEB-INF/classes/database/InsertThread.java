package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertThread{

    public static int thread_table(String threadname,String category,String username,String threadtext,String user_id){
        int count = 0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection cn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");

            cn.setAutoCommit(false);

            System.out.println("Ú‘±Š®—¹");

            String sql="insert into threadtable(thread_id,category,thread_name,user_name,thread_text,user_id) values(s_thread_id.nextval,'"+category+"','"+threadname+"','"+username+"','"+threadtext+"','"+user_id +"')";
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

