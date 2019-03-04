import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;


import java.util.*;

public class NoServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("windows-31j");

        HttpSession session = req.getSession();
        session.invalidate();

        RequestDispatcher dispatcher = req.getRequestDispatcher("loginPage");

        dispatcher.forward(req,res);

    }

}