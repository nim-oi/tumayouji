import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
/*この中は適宜書き換える。Bean名、
import info.Profile;
import database.InsertTest;
import database.QueryTest;
*/
import java.util.List;

public class TumayoujiServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");
        
        /*request元のinputタグ内のname属性を引数に書く*/
        // String name = req.getParameter("name");
        // String pass = req.getParameter("pass");
        

        //データベースに書き込むクラスメソッド
        InsertTest.insertUser_Table(name,pass);

        //これ以降doGetと共通
        //データベースからリストをもらいたい
        List<Profile> plist = getList();

        //パラメータをJSPに転送したい。

        //jspで受け取る変数の名前ここではusersにplistをset
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

        //データベースからリストをもらいたい
        List<Profile> plist = getList();
        //jspで受け取る変数の名前、ここではusersにplistをset
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