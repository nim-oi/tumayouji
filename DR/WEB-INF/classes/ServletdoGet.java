import javax.servlet.http.HttpServlet;				//*
import javax.servlet.http.HttpServletRequest;		//*
import javax.servlet.http.HttpServletResponse;		//*
import javax.servlet.ServletException;				//*
import javax.servlet.RequestDispatcher;		//JSP転送に必要
import java.io.IOException;		//*		//この*五つ必須
import java.io.PrintWriter;
import beans.ThreadBean;
import database.InsertThread;
import database.QueryThread;
import java.util.List;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		
		//データベースからリストをもらいたい
		List<ThreadBean> db=getList();
		
		//パラメータをJSPに転送したい場合
		req.setAttribute("threads", db);
		
		//転送先のJSPを指定
		RequestDispatcher dis=req.getRequestDispatcher("/list");//書き直しあり
		
		//JSPに転送
		dis.foward(req, res);
}

	public List<ThreadBean> getList(){
		List<ThreadBean> db=QueryThread.getQueryList();
	
		return db;
}











