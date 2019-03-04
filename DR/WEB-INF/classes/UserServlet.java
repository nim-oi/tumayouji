import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import database.QueryUser;
import database.InsertUser;

import java.util.*;

public class UserServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("windows-31j");

        String user_name = req.getParameter("name");
        String user_pass = req.getParameter("pass");

        try{
            InsertUser.user_id(user_name,user_pass);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("ÉÜÅ[ÉUÅ[çÏê¨é∏îs");
        }


//        List<ThreadBean> db=getList();

       HttpSession session = req.getSession();
        QueryUser qu = new QueryUser();
        session.setAttribute("user_name",user_name);
        session.setAttribute("user_id",qu.getQueryList(user_name,user_pass));


        RequestDispatcher dispatcher = req.getRequestDispatcher("/RegistrationConfirmation.jsp");

        dispatcher.forward(req,res);

    }
}