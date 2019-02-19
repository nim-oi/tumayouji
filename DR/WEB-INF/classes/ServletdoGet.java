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

public class ServletdoGet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		
		req.setCharacterEncoding("Windows-31J");
		
		String currentCategory=req.getParameter("category");
		
		//�f�[�^�x�[�X���烊�X�g�����炢����
		List<ThreadBean> db=getList(currentCategory);
		
		//�p�����[�^��JSP�ɓ]���������ꍇ
		req.setAttribute("tb", db);
		
		//�]�����JSP���w��
		RequestDispatcher dis=req.getRequestDispatcher("/index");//������������
		
		//JSP�ɓ]��
		dis.foward(req, res);
}

	public List<ThreadBean> getList(String currentCategory){
		List<ThreadBean> db=QueryThread.getQueryList(currentCategory);
	
		return db;
}
}










