package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import beans.ResBean;

public class InsertRes{
	
	
	public static int insertResTable(String resname,String restext,String threadid){
		int count = 0; 
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection?C???^?[?t?F?C?X??????????N???X??
			//?C???X?^???X????
			Connection cn=
				DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
			
			//?????R?~?b?g??OFF?????
			cn.setAutoCommit(false);
			
			System.out.println("接続完了");
			
			//SQL????????i?[????
			String sql="insert into res_table(res_name,res_text,thread_id,res_number,res_date) values('"+resname+"','"+restext+"',"+threadid+",(select max(res_number) from res_table where thread_id="+threadid+")+1,sysdate)";
			System.out.println(sql);
			//Statement?C???^?[?t?F?C?X??????????N???X??
			//?C???X?^???X???擾????
			Statement st=cn.createStatement();
			
			//SQL?????s???g?????U?N?V???????J?n?????B????????????????
			count=st.executeUpdate(sql);
			
			System.out.println(count+"件処理しました");
			
			//?g?????U?N?V???????R?~?b?g????
			cn.commit();
			
			//?X?e?[?g?????g???N???[?Y????
			st.close();
			
			//RDBMS?????f????
			cn.close();
			
			System.out.println("処理が完了しました");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
}

