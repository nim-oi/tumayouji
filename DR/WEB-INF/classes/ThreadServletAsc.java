import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import beans.ThreadBean;
import database.QueryThreadAsc;
import java.util.*;

public class ThreadServletAsc extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("windows-31j");

        List<ThreadBean> db= QueryThreadAsc.thread_table();

        req.setAttribute("tb", db);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index");

        dispatcher.forward(req,res);

    }
}