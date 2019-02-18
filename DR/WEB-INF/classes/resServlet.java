import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
/*この中は適宜書き換える。Bean名、
import info.ResBean;
import database.InsertRes;
import database.QueryRes;
*/
import info.ResBean;
import database.InsertRes;
import database.QueryRes;

import java.util.List;

public class ResServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");
        
        /*request元のinputタグ内のname属性を引数に書く*/
        
        String res_name = req.getParameter("res_name");
        String res_text = req.getParameter("res_text");

        //データベースに書き込むクラスメソッド
        InsertTest.insertUser_Table(name,pass);

        //これ以降doGetと共通
        //データベースからリストをもらいたい
        List<ResBean> rlist = getList();

        //パラメータをJSPに転送したい。

        //jspで受け取る変数の名前ここではusersにplistをset
        req.setAttribute("reses",rlist);
        

        //転送先のJSPを指定
        RequestDispatcher dispatcher =req.getRequestDispatcher("/resList");

        //JSPに転送
        dispatcher.forward(req,res);
    }

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
//
       req.setCharacterEncoding("windows-31J");
//

        //データベースからリストをもらいたい
        List<ResBean> rlist = getList();
        //jspで受け取る変数の名前、ここではusersにplistをset
        req.setAttribute("reses",rlist);
        //転送先のJSPを指定
        RequestDispatcher dis =req.getRequestDispatcher("/resList");
        //JSPに転送
        dis.forward(req,res);

    }
    public List<ResBean> getList(){

        List<ResBean> rlist=QueryRes.getQueryList();

        return plist;
    }
}