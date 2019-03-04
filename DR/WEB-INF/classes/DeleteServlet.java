import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.*;

import database.DeleteThread;

public class DeleteServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException{

        req.setCharacterEncoding("Windows-31J");
        String threadid = req.getParameter("thread_id");

        DeleteThread dt = new DeleteThread();

        dt.delete(threadid);


        RequestDispatcher dispatcher=req.getRequestDispatcher("/Deletecheck");

        dispatcher.forward(req, res);
    }
}