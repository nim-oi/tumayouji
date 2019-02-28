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
	
	public static List<ThreadBean> getQueryList(){
		
		List<ThreadBean> userList = new ArrayList<ThreadBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
			System.out.println("接続完了");
			
			//select文
			String sql="select thread_name, thread_date, thread_id,thread_text,user_name,category from threadtable order by thread_id desc";
			System.out.println(sql);
			//Statementインターフェイスを実装するクラスをインスタンス化する
			Statement st=cn.createStatement();

			//select文を実行し
			//ResultSetインターフェイスを実装したクラスの
			//インスタンスが返る
			ResultSet rs=st.executeQuery(sql);

			//カーソルを一行だけスクロールし、データをフェッチする
			while(rs.next()){
				ThreadBean tb = new ThreadBean();
				
				String threadname = rs.getString(1);	//1列目のデータを取得
				String threaddate = rs.getString(2);	//2列目のデータを取得
				String threadid = rs.getString(3);		//3列目のデータを取得
				String threadtext = rs.getString(4);	//4列目のデータを取得
				String username = rs.getString(5);		//5列目のデータを取得
				String category = rs.getString(6);		//6列目のデータを取得
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
	public static List<ThreadBean> getQueryList(String currentCategory){
		
		List<ThreadBean> userList = new ArrayList<ThreadBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
			System.out.println("接続完了");
			
			//select文
			String sql="select thread_name, thread_date, thread_id,thread_text,user_name,category from threadtable where category = "+currentCategory+" order by thread_id desc";
			System.out.println(sql);
			//Statementインターフェイスを実装するクラスをインスタンス化する
			Statement st=cn.createStatement();

			//select文を実行し
			//ResultSetインターフェイスを実装したクラスの
			//インスタンスが返る
			ResultSet rs=st.executeQuery(sql);

			//カーソルを一行だけスクロールし、データをフェッチする
			while(rs.next()){
				ThreadBean tb = new ThreadBean();
				
				String threadname = rs.getString(1);	//1列目のデータを取得
				String threaddate = rs.getString(2);	//2列目のデータを取得
				String threadid = rs.getString(3);		//3列目のデータを取得
				String threadtext = rs.getString(4);	//4列目のデータを取得
				String username = rs.getString(5);		//5列目のデータを取得
				String category = rs.getString(6);		//6列目のデータを取得
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