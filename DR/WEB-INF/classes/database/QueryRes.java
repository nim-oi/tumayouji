package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import beans.ResBean;

import java.util.ArrayList;


public class QueryRes{

	
	public static List<ResBean> getQueryList(){
		
		List<ResBean> ResList = new ArrayList<ResBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
                //tuser,pass��DB�̃��[�U�[���ƃp�X���[�h
			System.out.println("�ڑ�����");
			
			//select���A�ς�镔��
			String sql="select res_text,res_name,res_date,res_number,reply from res_table";

			//Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
			Statement st=cn.createStatement();

			//select�������s��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			ResultSet rs=st.executeQuery(sql);

			//�J�[�\������s�����X�N���[�����A�f�[�^���t�F�b�`����
			while(rs.next()){
				ResBean ublist = new ResBean();
				
                String res_text=rs.getString(1);
                String res_name=rs.getString(2);
                String res_date=rs.getString(3);
                int res_number=rs.getString(4);
                int reply=rs.getString(5);//2��ڂ̃f�[�^���擾�A�ς�镔��
                ublist.setRes_text(res_text);//�ς�镔��
                ublist.setRes_name(res_name);//�ς�镔��
                ublist.setRes_date(res_date);//�ς�镔��
                ublist.setRes_number(res_number);//�ς�镔��
                ublist.setReply(reply);//�ς�镔��
                
				
				
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









