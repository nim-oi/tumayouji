import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import beans.ThreadBean;
import database.InsertThread;
import database.QueryUserThread;
import java.util.*;

public class MyPageServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException{

        req.setCharacterEncoding("Windows-31J");

        String currentCategory=req.getParameter("user_id");
        List<ThreadBean> db;

        db=getList(currentCategory);

//        if(currentCategory==null){
//            db=getList();
//        }else{
//            db=getList(currentCategory);
//        }
        req.setAttribute("mt", db);

        RequestDispatcher dispatcher=req.getRequestDispatcher("/MyPage");//????????????

        dispatcher.forward(req, res);
    }

    public List<ThreadBean> getList(String currentCategory){
        List<ThreadBean> db = QueryUserThread.getQueryList(currentCategory);

        return db;
    }
}