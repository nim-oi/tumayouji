import javax.servlet.http.HttpServlet;				//*
import javax.servlet.http.HttpServletRequest;		//*
import javax.servlet.http.HttpServletResponse;		//*
import javax.servlet.ServletException;				//*
import javax.servlet.RequestDispatcher;		//JSP�]���ɕK�v
import java.io.IOException;		//*		//����*�܂K�{
import java.io.PrintWriter;
import beans.ThreadBean;
import database.InsertThread;
import database.QueryThread;
import java.util.List;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		
		//�f�[�^�x�[�X���烊�X�g�����炢����
		List<ThreadBean> db=getList();
		
		//�p�����[�^��JSP�ɓ]���������ꍇ
		req.setAttribute("threads", db);
		
		//�]�����JSP���w��
		RequestDispatcher dis=req.getRequestDispatcher("/list");//������������
		
		//JSP�ɓ]��
		dis.foward(req, res);
}

	public List<ThreadBean> getList(){
		List<ThreadBean> db=QueryThread.getQueryList();
	
		return db;
}











