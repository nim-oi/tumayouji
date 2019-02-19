package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import beans.ThreadBean;

public class QueryThread{
	
	/*public static void main(String[] args){
		
		List<ThreadBean> al = getQueryList();
		System.out.println("username      password"); //���o��

		for(int i = 0; i < al.size();i++){
			ThreadBean tb = al.get(i);
			System.out.println(tb.getName()+"\t"+tb.getPass());
		
		}
	}*///�����͕K�v�Ȃ�
	
	public static List<ThreadBean> getQueryList(String currentCategory){
		
		List<ThreadBean> userList = new ArrayList<ThreadBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
			System.out.println("�ڑ�����");
			
			//select��
			String sql="select thread_name, thread_date, thread_id from thread_table 
			where category_id = '"+currentCategory+"';";

			//Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
			Statement st=cn.createStatement();

			//select�������s��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			ResultSet rs=st.executeQuery(sql);

			//�J�[�\������s�����X�N���[�����A�f�[�^���t�F�b�`����
			while(rs.next()){
				ThreadBean tb = new ThreadBean();
				
				String thread_name = rs.getString(1);	//1��ڂ̃f�[�^���擾
				String thread_date = rs.getString(2);	//2��ڂ̃f�[�^���擾
				String thread_id = rs.getString(3);		//3��ڂ̃f�[�^���擾
				tb.setThread_name(thread_name);
				tb.setThread_date(thread_date);
				tb.setThread_id(thread_id);
				
				userList.add(tb);
				
				//System.out.println("username"+"\t"+"password"); //�m�F�\��
				//System.out.println(name+"\t"+pass);				//�m�F���̂Q
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