package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLMaker{
	
	
	public static int SQLMake(String[] names,String[] ){/*insertテーブル名,引数は列名。insert文を送るのでこの名前*/
		
		
			
			//SQL文を変数に格納する。送りたいSQLに変える。
			String sql="insert into user_table(username,password) values('"+userName+"','"+passWord+"')";
			
		