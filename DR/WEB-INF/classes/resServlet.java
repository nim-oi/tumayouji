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
import beans.ResBean;
import beans.ThreadBean;
import database.InsertRes;
import database.QueryThread;
import database.QueryRes;

import java.util.*;

public class ResServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");

        /*request元のinputタグ内のname属性を引数に書く*/

        String resname = req.getParameter("resname");
        String restext = req.getParameter("restext");
        String threadid= req.getParameter("threadid");
        //データベースに書き込むクラスメソッド
        if(threadid==null||threadid.isEmpty()){
            throw new ServletException("投稿できません");
        }

        restext = restext.replace("&", "&amp;");
        restext = restext.replace("\"", "&quot;");
        restext = restext.replace("<", "&lt;");
        restext = restext.replace(">", "&gt;");
        restext = restext.replace("'", "&#39;");

        if (restext != null) {
            //改行コードをHTMLの改行タグ（<br>）に変換
            restext = restext.replaceAll("\r\n", "<br>");
        }

        InsertRes.insertResTable(resname,restext,threadid);

        //これ以降doGetと共通
        //データベースからリストをもらいたい
        List<ResBean> rlist = getList(threadid);
        ThreadBean tb=QueryThread.getQueryCurrentThread(threadid);
        //パラメータをJSPに転送したい。

        //jspで受け取る変数の名前ここではusersにplistをset
        req.setAttribute("tb",tb);
        req.setAttribute("rb",rlist);
        

        //転送先のJSPを指定
        RequestDispatcher dispatcher =req.getRequestDispatcher("/ResPage");

        //JSPに転送
        dispatcher.forward(req,res);
    }

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
//
        req.setCharacterEncoding("windows-31J");
//
        String currentthread= req.getParameter("threadid");
        System.out.println(currentthread);
        if(currentthread==null||currentthread.isEmpty()){
            throw new ServletException("このページは表示できません");
        }
        //データベースからリストをもらいたい
        List<ResBean> rlist = getList(currentthread);
        ThreadBean tb=QueryThread.getQueryCurrentThread(currentthread);
        
        
        //jspで受け取る変数の名前、ここではusersにplistをset
        req.setAttribute("tb",tb);
        req.setAttribute("rb",rlist);
       
        //転送先のJSPを指定
        RequestDispatcher dispatcher =req.getRequestDispatcher("/ResPage");
        //JSPに転送
        dispatcher.forward(req,res);

    }
    public List<ResBean> getList(String currentThread){

        List<ResBean> rlist=QueryRes.getQueryList(currentThread);

        return rlist;
    }
}