package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUser{
	
	
	public static int insertUser_Table(String user_name,String user_pass,int user_age,int user_sex){/*insertテーブル名,引数は列名。insert文を送るのでこの名前*/
		int count = 0; //処理した行数を入れるための変数
		try{
			//Driverインターフェイスを実装するクラスをロードする
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connectionインターフェイスを実装するクラスの
			//インスタンスを返す
			Connection cn=
				DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl","yuje","0131");/*第二引数はDBのユーザー名、第三引数はパスワード*/
			
			//自動コミットをOFFにする
			cn.setAutoCommit(false);
            
            //いるのか？
			System.out.println("接続完了");
			
			//SQL文を変数に格納する。送りたいSQLに変える。
			String sql="insert into user_table(user_id,user_name,user_pass,user_age,user_sex) values(s_user_id.nextval,'"+user_name+"','"+user_pass+"',"+user_age+","+userSex+")";
			
			//Statementインターフェイスを実装するクラスの
			//インスタンスを取得する
			Statement st=cn.createStatement();
			
			//SQLを実行しトランザクションが開始される。処理件数が返される
			count=st.executeUpdate(sql);
			
			System.out.println(count+"件処理完了");
			
			//トランザクションをコミットする
			cn.commit();
			
			//ステートメントをクローズする
			st.close();
			
			//RDBMSから切断する
			cn.close();
			
			System.out.println("切断完了");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
}

