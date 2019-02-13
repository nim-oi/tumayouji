package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import beans.UserBean;

import java.util.ArrayList;


public class QueryUser{

	
	public static List<UserBean> getQueryList(){
		
		List<UserBean> userList = new ArrayList<UserBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
                //tuser,pass��DB�̃��[�U�[���ƃp�X���[�h
			System.out.println("�ڑ�����");
			
			//select���A�ς�镔��
			String sql="select user_name,user_pass,user_age,user_sex from user_table";

			//Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
			Statement st=cn.createStatement();

			//select�������s��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			ResultSet rs=st.executeQuery(sql);

			//�J�[�\������s�����X�N���[�����A�f�[�^���t�F�b�`����
			while(rs.next()){
				UserBean ublist = new UserBean();
				
                String user_id=rs.getString(1);
                String user_name=rs.getString(2);
                String user_pass=rs.getString(3);
                int user_age=rs.getString(4);
                int user_sex=rs.getString(5);//2��ڂ̃f�[�^���擾�A�ς�镔��
                ublist.setUser_id(user_id);//�ς�镔��
                ublist.setUser_name(user_name);//�ς�镔��
                ublist.setUser_pass(user_pass);//�ς�镔��
                ublist.setUser_age(user_age);//�ς�镔��
                ublist.setUser_sex(user_sex);//�ς�镔��
                
				
				
				userList.add(ublist);
				
			}

			
			//Oracle����ؒf����
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
		return userList;
		
	}
}










