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

            //Oracle�ɐڑ�����
            Connection cn=
                    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
            System.out.println("�ڑ�����");

            //select��
            String sql="update threadtable set thread_flag=1 where thread_id="+threadid;
            System.out.println(sql);
            //Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
            Statement st=cn.createStatement();

            st.executeUpdate(sql);


//            cn.commit();

            st.close();

            cn.close();

            System.out.println("�ؒf����");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("�N���X���Ȃ��݂����B");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("SQL�֘A�̗�O�݂����B");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}