package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUser{
	
	
	public static int insertUser_Table(String user_name,String user_pass,int user_age,int user_sex){/*insert�e�[�u����,�����͗񖼁Binsert���𑗂�̂ł��̖��O*/
		int count = 0; //���������s�������邽�߂̕ϐ�
		try{
			//Driver�C���^�[�t�F�C�X����������N���X�����[�h����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection�C���^�[�t�F�C�X����������N���X��
			//�C���X�^���X��Ԃ�
			Connection cn=
				DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");/*��������DB�̃��[�U�[���A��O�����̓p�X���[�h*/
			
			//�����R�~�b�g��OFF�ɂ���
			cn.setAutoCommit(false);
            
            //����̂��H
			System.out.println("�ڑ�����");
			
			//SQL����ϐ��Ɋi�[����B���肽��SQL�ɕς���B
			String sql="insert into user_table(user_id,user_name,user_pass,user_age,user_sex) values(s_user_id.nextval,'"+user_name+"','"+user_pass+"',"+user_age+","+userSex+")";
			
			//Statement�C���^�[�t�F�C�X����������N���X��
			//�C���X�^���X���擾����
			Statement st=cn.createStatement();
			
			//SQL�����s���g�����U�N�V�������J�n�����B�����������Ԃ����
			count=st.executeUpdate(sql);
			
			System.out.println(count+"����������");
			
			//�g�����U�N�V�������R�~�b�g����
			cn.commit();
			
			//�X�e�[�g�����g���N���[�Y����
			st.close();
			
			//RDBMS����ؒf����
			cn.close();
			
			System.out.println("�ؒf����");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
}

