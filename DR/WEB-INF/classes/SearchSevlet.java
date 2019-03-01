import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import beans.ThreadBean;
import database.QuerySearch;
import java.util.*;

public class SearchSevlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("windows-31j");

        String search = req.getParameter("ss");

        search = search.replace("&", "&amp;");
        search = search.replace("\"", "&quot;");
        search = search.replace("<", "&lt;");
        search = search.replace(">", "&gt;");
        search = search.replace("'", "&#39;");


        List<ThreadBean> db=getList(search);

        req.setAttribute("tb", db);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index");

        dispatcher.forward(req,res);

    }
    public List<ThreadBean> getList(String currentCategory){
        List<ThreadBean> db = QuerySearch.getQueryList(currentCategory);

        return db;
    }
}