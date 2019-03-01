package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import beans.ResBean;




public class QueryRes{

	
	public static List<ResBean> getQueryList(String currentThread){
		
		List<ResBean> resList = new ArrayList<ResBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
                //tuser,pass��DB�̃��[�U�[���ƃp�X���[�h
			System.out.println("�ڑ�����");
			
			//select���A�ς�镔��
			String sql="select res_text,res_name,res_date,res_number,thread_id from res_table where thread_id="+currentThread+"order by res_id asc";
			System.out.println(sql);
			//Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
			Statement st=cn.createStatement();

			//select�������s��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			ResultSet rs=st.executeQuery(sql);

			//�J�[�\������s�����X�N���[�����A�f�[�^���t�F�b�`����
			while(rs.next()){
				ResBean rb = new ResBean();
				
                String restext=rs.getString(1);
                String resname=rs.getString(2);
                String resdate=rs.getString(3);
				String resnumber=rs.getString(4);
				String threadid=rs.getString(5);
                rb.setRestext(restext);//�ς�镔��
                rb.setResname(resname);//�ς�镔��
                rb.setResdate(resdate);//�ς�镔��
                rb.setResnumber(resnumber);//�ς�镔��
				rb.setThreadid(threadid);

				System.out.println(threadid);
				System.out.println(resnumber);

				resList.add(rb);
				
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
		return resList;
		
	}
}










