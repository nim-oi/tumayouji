package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLMaker{
	
	
	public static int SQLMake(String[] names,String[] ){/*insert�e�[�u����,�����͗񖼁Binsert���𑗂�̂ł��̖��O*/
		
		
			
			//SQL����ϐ��Ɋi�[����B���肽��SQL�ɕς���B
			String sql="insert into user_table(username,password) values('"+userName+"','"+passWord+"')";
			
		