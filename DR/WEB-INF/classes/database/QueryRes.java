package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import beans.ResBean;




public class QueryRes{

	
	public static List<ResBean> getQueryList(String currentThread){
		
		List<ResBean> resList = new ArrayList<ResBean>();
	
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");
                //tuser,passはDBのユーザー名とパスワード
			System.out.println("接続完了");
			
			//select文、変わる部分
			String sql="select res_text,res_name,res_date,res_number,thread_id from res_table where thread_id="+currentThread+"order by res_id asc";
			System.out.println(sql);
			//Statementインターフェイスを実装するクラスをインスタンス化する
			Statement st=cn.createStatement();

			//select文を実行し
			//ResultSetインターフェイスを実装したクラスの
			//インスタンスが返る
			ResultSet rs=st.executeQuery(sql);

			//カーソルを一行だけスクロールし、データをフェッチする
			while(rs.next()){
				ResBean rb = new ResBean();
				
                String restext=rs.getString(1);
                String resname=rs.getString(2);
                String resdate=rs.getString(3);
				String resnumber=rs.getString(4);
				String threadid=rs.getString(5);
                rb.setRestext(restext);//変わる部分
                rb.setResname(resname);//変わる部分
                rb.setResdate(resdate);//変わる部分
                rb.setResnumber(resnumber);//変わる部分
				rb.setThreadid(threadid);

				System.out.println(threadid);
				System.out.println(resnumber);

				resList.add(rb);
				
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
		return resList;
		
	}
}










