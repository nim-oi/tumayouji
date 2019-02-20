package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertThread{
    public static void main(String[] args){
        InsertThread.thread_table(args[0],args[1],args[2],args[3]);
    }

    public static int thread_table(String thread_name,String category,String res_name,String thread_text){
        int count = 0;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection cn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");

            cn.setAutoCommit(false);

            System.out.println("Ú‘±Š®—¹");

            String sql="insert into thread_table(thread_id,category,thread_name,res_name,thread_text) values('+ s_thread_id.nextval+','"+category+"','"+threadname+"','"+resname+"','"+threadtext+"')";

            Statement st=cn.createStatement();

            count=st.executeUpdate(sql);

            System.out.println(count+"Œˆ—‚µ‚Ü‚µ‚½");

            cn.commit();

            st.close();

            cn.close();

            System.out.println("Ø’fŠ®—¹");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }
}

