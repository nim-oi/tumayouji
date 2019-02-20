package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import beans.ResBean;

import java.util.ArrayList;


public class QueryRes{

	
	public static List<ResBean> getQueryList(){
		
		List<ResBean> ResList = new ArrayList<ResBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
                //tuser,passはDBのユーザー名とパスワード
			System.out.println("接続完了");
			
			//select文、変わる部分
			String sql="select res_text,res_name,res_date,res_number,reply from res_table";

			//Statementインターフェイスを実装するクラスをインスタンス化する
			Statement st=cn.createStatement();

			//select文を実行し
			//ResultSetインターフェイスを実装したクラスの
			//インスタンスが返る
			ResultSet rs=st.executeQuery(sql);

			//カーソルを一行だけスクロールし、データをフェッチする
			while(rs.next()){
				ResBean ublist = new ResBean();
				
                String res_text=rs.getString(1);
                String res_name=rs.getString(2);
                String res_date=rs.getString(3);
                int res_number=rs.getString(4);
                int reply=rs.getString(5);//2列目のデータを取得、変わる部分
                ublist.setRes_text(res_text);//変わる部分
                ublist.setRes_name(res_name);//変わる部分
                ublist.setRes_date(res_date);//変わる部分
                ublist.setRes_number(res_number);//変わる部分
                ublist.setReply(reply);//変わる部分
                
				
				
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










