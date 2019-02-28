import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import beans.ThreadBean;
import database.InsertThread;
import database.QueryThread;
import java.util.*;

public class ThreadServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("windows-31j");

        String threadname = req.getParameter("thread_name");
        String category = req.getParameter("category");
        String username = req.getParameter("user_name");
        String threadtext = req.getParameter("thread_text");


        threadtext = threadtext.replace("&", "&amp;");
        threadtext = threadtext.replace("\"", "&quot;");
        threadtext = threadtext.replace("<", "&lt;");
        threadtext = threadtext.replace(">", "&gt;");
        threadtext = threadtext.replace("'", "&#39;");

        if (threadtext != null) {
            //改行コードをHTMLの改行タグ（<br>）に変換
            threadtext = threadtext.replaceAll("\r\n", "<br>");
        }

        InsertThread.thread_table(threadname,category,username,threadtext);

//        ThreadBean tb = new ThreadBean();
//        tb.setThreadname(threadname);
//        tb.setCategory(category);
//        tb.setResname(resname);
//        tb.setThreadtext(threadtext);
//
//
//        req.setAttribute("tb",tb);

//        String currentCategory=req.getParameter("category");


        List<ThreadBean> db=getList();

        req.setAttribute("tb", db);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index");

        dispatcher.forward(req,res);

    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException{

        req.setCharacterEncoding("Windows-31J");

        String currentCategory=req.getParameter("category");
        List<ThreadBean> db;

        if(currentCategory==null){
            db=getList();
        }else{
            db=getList(currentCategory);
        }
        req.setAttribute("tb", db);

        RequestDispatcher dispatcher=req.getRequestDispatcher("/index");//????????????

        dispatcher.forward(req, res);
    }

    public List<ThreadBean> getList(){
        List<ThreadBean> db = QueryThread.getQueryList();

        return db;
    }
    public List<ThreadBean> getList(String currentCategory){
        List<ThreadBean> db = QueryThread.getQueryList(currentCategory);

        return db;
    }
}