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

        String thread_name = req.getParameter("thread_name");
        String category = req.getParameter("category");
        String res_name = req.getParameter("res_name");
        String thread_text = req.getParameter("thread_text");

        InsertThread.thread_table(thread_name,category,res_name,thread_text);

        ThreadBean tb = new ThreadBean();
        tb.setThreadNmae(thread_name);
        tb.setCategory(category);
        tb.setResName(res_name);
        tb.setResText(thread_text);


        req.setAttribute("tb",tb);

        RequestDispatcher dispatcher = req.getRequestDispatcher("index");


    }
}