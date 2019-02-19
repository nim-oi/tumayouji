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
		System.out.println("username      password"); //見出し

		for(int i = 0; i < al.size();i++){
			ThreadBean tb = al.get(i);
			System.out.println(tb.getName()+"\t"+tb.getPass());
		
		}
	}*///ここは必要なし
	
	public static List<ThreadBean> getQueryList(String currentCategory){
		
		List<ThreadBean> userList = new ArrayList<ThreadBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
			System.out.println("接続完了");
			
			//select文
			String sql="select thread_name, thread_date, thread_id from thread_table 
			where category_id = '"+currentCategory+"';";

			//Statementインターフェイスを実装するクラスをインスタンス化する
			Statement st=cn.createStatement();

			//select文を実行し
			//ResultSetインターフェイスを実装したクラスの
			//インスタンスが返る
			ResultSet rs=st.executeQuery(sql);

			//カーソルを一行だけスクロールし、データをフェッチする
			while(rs.next()){
				ThreadBean tb = new ThreadBean();
				
				String thread_name = rs.getString(1);	//1列目のデータを取得
				String thread_date = rs.getString(2);	//2列目のデータを取得
				String thread_id = rs.getString(3);		//3列目のデータを取得
				tb.setThread_name(thread_name);
				tb.setThread_date(thread_date);
				tb.setThread_id(thread_id);
				
				userList.add(tb);
				
				//System.out.println("username"+"\t"+"password"); //確認表示
				//System.out.println(name+"\t"+pass);				//確認その２
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