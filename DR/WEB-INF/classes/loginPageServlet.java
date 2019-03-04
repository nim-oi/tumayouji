import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import database.QueryLoginUser;
import database.InsertUser;

import java.util.*;

public class loginPageServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("windows-31j");

        String user_name = req.getParameter("name");
        String user_pass = req.getParameter("pass");

//        List<ThreadBean> db=getList();

        HttpSession session = req.getSession();
        QueryLoginUser qlu = new QueryLoginUser();
        String ui = qlu.getQueryList(user_name,user_pass);
        String target;
        if(ui==null){
            target = "loginPage";
       }else{
            session.setAttribute("user_name",user_name);
            session.setAttribute("user_id",qlu.getQueryList(user_name,user_pass));

            target="/check";
        }


        RequestDispatcher dispatcher = req.getRequestDispatcher(target);

        dispatcher.forward(req,res);

    }
//    public List<ThreadBean> getList(){
//        List<ThreadBean> db = QueryThread.getQueryList();
//
//        return db;
//    }
//    public List<ThreadBean> getList(String currentCategory){
//        List<ThreadBean> db = QueryThread.getQueryList(currentCategory);
//
//        return db;
//    }
}