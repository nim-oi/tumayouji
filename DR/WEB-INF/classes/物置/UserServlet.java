import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import beans.UserBean;
import database.InsertUser;
import database.QueryUser;

import java.util.List;

public class UserServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");
        
        /*request元のinputタグ内のname属性を引数に書く*/
        
        String user_name = req.getParameter("user_name");
        String user_pass = req.getParameter("user_pass");
        int user_age = req.getParameter("user_age");
        int user_sex = req.getParameter("user_sex");
        
        

        //データベースに書き込むクラスメソッド
        InsertUser.insertUser_Table(user_name,user_pass,user_age,user_sex);

        //これ以降doGetと共通
        //データベースからリストをもらいたい,
        List<UserBean> ublist = getList();

        // //パラメータをJSPに転送したい。

        //jspで受け取る変数の名前ここではusersにplistをset
        req.setAttribute("users",ublist);

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
        List<UserBean> ublist = getList();
        //jspで受け取る変数の名前、ここではusersにplistをset
        req.setAttribute("users",ublist);
        //転送先のJSPを指定
        RequestDispatcher dis =req.getRequestDispatcher("/list");
        //JSPに転送
        dis.forward(req,res);

    }
    public List<UserBean> getList(){

        List<UserBean> ublist=QueryUser.getQueryList();

        return ublist;
    }
}