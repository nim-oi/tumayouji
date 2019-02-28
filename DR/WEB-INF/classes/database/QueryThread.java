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
	
	public static List<ThreadBean> getQueryList(){
		
		List<ThreadBean> userList = new ArrayList<ThreadBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
			System.out.println("�ڑ�����");
			
			//select��
			String sql="select thread_name, thread_date, thread_id,thread_text,user_name,category from threadtable order by thread_id desc";
			System.out.println(sql);
			//Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
			Statement st=cn.createStatement();

			//select�������s��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			ResultSet rs=st.executeQuery(sql);

			//�J�[�\������s�����X�N���[�����A�f�[�^���t�F�b�`����
			while(rs.next()){
				ThreadBean tb = new ThreadBean();
				
				String threadname = rs.getString(1);	//1��ڂ̃f�[�^���擾
				String threaddate = rs.getString(2);	//2��ڂ̃f�[�^���擾
				String threadid = rs.getString(3);		//3��ڂ̃f�[�^���擾
				String threadtext = rs.getString(4);	//4��ڂ̃f�[�^���擾
				String username = rs.getString(5);		//5��ڂ̃f�[�^���擾
				String category = rs.getString(6);		//6��ڂ̃f�[�^���擾
				tb.setCategory(category);
				tb.setUsername(username);
				tb.setThreadtext(threadtext);
				tb.setThreadname(threadname);
				threaddate=threaddate.substring(0,16);
				tb.setThreaddate(threaddate);
				tb.setThreadid(threadid);
				System.out.println(username);
				System.out.println(category);
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
	public static List<ThreadBean> getQueryList(String currentCategory){
		
		List<ThreadBean> userList = new ArrayList<ThreadBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
			System.out.println("�ڑ�����");
			
			//select��
			String sql="select thread_name, thread_date, thread_id,thread_text,user_name,category from threadtable where category = "+currentCategory+" order by thread_id desc";
			System.out.println(sql);
			//Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
			Statement st=cn.createStatement();

			//select�������s��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			ResultSet rs=st.executeQuery(sql);

			//�J�[�\������s�����X�N���[�����A�f�[�^���t�F�b�`����
			while(rs.next()){
				ThreadBean tb = new ThreadBean();
				
				String threadname = rs.getString(1);	//1��ڂ̃f�[�^���擾
				String threaddate = rs.getString(2);	//2��ڂ̃f�[�^���擾
				String threadid = rs.getString(3);		//3��ڂ̃f�[�^���擾
				String threadtext = rs.getString(4);	//4��ڂ̃f�[�^���擾
				String username = rs.getString(5);		//5��ڂ̃f�[�^���擾
				String category = rs.getString(6);		//6��ڂ̃f�[�^���擾
				tb.setCategory(category);
				tb.setUsername(username);
				tb.setThreadtext(threadtext);
				tb.setThreadname(threadname);
				threaddate=threaddate.substring(0,16);
				tb.setThreaddate(threaddate);
				tb.setThreadid(threadid);
				System.out.println(username);
				System.out.println(category);
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