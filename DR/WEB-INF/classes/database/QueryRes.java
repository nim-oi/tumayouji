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

	
	public static List<ResBean> getQueryList(String currentThread){
		
		List<ResBean> ResList = new ArrayList<ResBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
                //tuser,passはDBのユーザー名とパスワード
			System.out.println("接続完了");
			
			//select文、変わる部分
			String sql="select restext,resname,resdate,resnumber from res_table";

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
                String res_number=rs.getString(4);
                ublist.setResText(res_text);//変わる部分
                ublist.setResName(res_name);//変わる部分
                ublist.setResDate(res_date);//変わる部分
                ublist.setResNumber(res_number);//変わる部分
				
				
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










