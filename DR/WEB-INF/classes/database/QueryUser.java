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

			//Oracleに接続する
			Connection cn=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
                //tuser,passはDBのユーザー名とパスワード
			System.out.println("接続完了");
			
			//select文、変わる部分
			String sql="select user_name,user_pass,user_age,user_sex from user_table";

			//Statementインターフェイスを実装するクラスをインスタンス化する
			Statement st=cn.createStatement();

			//select文を実行し
			//ResultSetインターフェイスを実装したクラスの
			//インスタンスが返る
			ResultSet rs=st.executeQuery(sql);

			//カーソルを一行だけスクロールし、データをフェッチする
			while(rs.next()){
				UserBean ublist = new UserBean();
				
                String user_id=rs.getString(1);
                String user_name=rs.getString(2);
                String user_pass=rs.getString(3);
                int user_age=rs.getString(4);
                int user_sex=rs.getString(5);//2列目のデータを取得、変わる部分
                ublist.setUser_id(user_id);//変わる部分
                ublist.setUser_name(user_name);//変わる部分
                ublist.setUser_pass(user_pass);//変わる部分
                ublist.setUser_age(user_age);//変わる部分
                ublist.setUser_sex(user_sex);//変わる部分
                
				
				
				userList.add(ublist);
				
			}

			
			//Oracleから切断する
			cn.close();

			System.out.println("切断完了");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("クラスがないみたい。");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("SQL関連の例外みたい。");
		}catch(Exception e){
			e.printStackTrace();
		}
		return userList;
		
	}
}










