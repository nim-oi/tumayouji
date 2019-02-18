import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import info.Profile;
import database.InsertTest;
import database.QueryTest;
import java.util.List;

public class KamataServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");

        String name = req.getParameter("name");
        String pass = req.getParameter("pass");

        //データベースに書き込む
        InsertTest.insertUser_Table(name,pass);

        //データベースからリストをもらいたい
        List<Profile> plist = getList();

        //パラメータをJSPに転送したい。

        //サーブレットの持つパラメータをJSP転送向けにset

//        req.setAttribute("username",name);//nameはstring型
//        req.setAttribute("userpass",pass);

//        Profile prof = new Profile();
//        prof.setName(name);
//        prof.setPass(pass);

//        req.setAttribute("profile",prof);
        req.setAttribute("users",plist);

        //転送先のJSPを指定
        RequestDispatcher dis =req.getRequestDispatcher("/list");

        //JSPに転送
        dis.forward(req,res);
    }

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
//
//        req.setCharacterEncoding("windows-31J");
//
//        String name = req.getParameter("name");
//        String pass = req.getParameter("pass");
//
////
////        PrintWriter out = res.getWriter();
////        res.setContentType("text/html;windows-31J");
////        out.println("<html><body><h1>");
////        out.println(name+"\t"+pass);
////        out.println("</h1></body></html>");
////
//
//        //パラメータをJSPに転送したい。
//
//        //サーブレットの持つパラメータをJSP転送向けにset
//
////        req.setAttribute("username",name);//nameはstring型
////        req.setAttribute("userpass",pass);
//
//        Profile prof = new Profile();
//        prof.setName(name);
//        prof.setPass(pass);
//
//        req.setAttribute("profile",prof);
//
//        //転送先のJSPを指定
//        RequestDispatcher dis =req.getRequestDispatcher("/time");
//
//        //JSPに転送
//        dis.forward(req,res);
        //データベースからリストをもらいたい
        List<Profile> plist = getList();
        req.setAttribute("users",plist);
        //転送先のJSPを指定
        RequestDispatcher dis =req.getRequestDispatcher("/list");
        //JSPに転送
        dis.forward(req,res);

    }
    public List<Profile> getList(){

        List<Profile> plist=QueryTest.getQueryList();

        return plist;
    }
}