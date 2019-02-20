import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import Bean.ThreadBean;
import database.InsertThread;

public class ThreadServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("windows-31j");

        String threadname = req.getParameter("thread_name");
        String category = req.getParameter("category");
        String resname = req.getParameter("res_name");
        String threadtext = req.getParameter("thread_text");

        InsertThread.thread_table(threadname,category,resname,threadtext);

        ThreadBean tb = new ThreadBean();
        tb.setThreadNmae(threadname);
        tb.setCategory(category);
        tb.setResName(resname);
        tb.setResText(threadtext);


        req.setAttribute("tb",tb);

        RequestDispatcher dispatcher = req.getRequestDispatcher("index");

        dispatcher.forward(req,res);

    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException{

        req.setCharacterEncoding("Windows-31J");

        String currentCategory=req.getParameter("category");


        List<ThreadBean> db=getList(currentCategory);

        req.setAttribute("tb", db);

        RequestDispatcher dispatcher=req.getRequestDispatcher("/index");//������������

        dispatcher.forward(req, res);
    }

    public List<ThreadBean> getList(String currentCategory){
        List<ThreadBean> db=QueryThread.getQueryList(currentCategory);

        return db;
    }
}