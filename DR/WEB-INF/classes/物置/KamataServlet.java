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

        //�f�[�^�x�[�X�ɏ�������
        InsertTest.insertUser_Table(name,pass);

        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<Profile> plist = getList();

        //�p�����[�^��JSP�ɓ]���������B

        //�T�[�u���b�g�̎��p�����[�^��JSP�]��������set

//        req.setAttribute("username",name);//name��string�^
//        req.setAttribute("userpass",pass);

//        Profile prof = new Profile();
//        prof.setName(name);
//        prof.setPass(pass);

//        req.setAttribute("profile",prof);
        req.setAttribute("users",plist);

        //�]�����JSP���w��
        RequestDispatcher dis =req.getRequestDispatcher("/list");

        //JSP�ɓ]��
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
//        //�p�����[�^��JSP�ɓ]���������B
//
//        //�T�[�u���b�g�̎��p�����[�^��JSP�]��������set
//
////        req.setAttribute("username",name);//name��string�^
////        req.setAttribute("userpass",pass);
//
//        Profile prof = new Profile();
//        prof.setName(name);
//        prof.setPass(pass);
//
//        req.setAttribute("profile",prof);
//
//        //�]�����JSP���w��
//        RequestDispatcher dis =req.getRequestDispatcher("/time");
//
//        //JSP�ɓ]��
//        dis.forward(req,res);
        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<Profile> plist = getList();
        req.setAttribute("users",plist);
        //�]�����JSP���w��
        RequestDispatcher dis =req.getRequestDispatcher("/list");
        //JSP�ɓ]��
        dis.forward(req,res);

    }
    public List<Profile> getList(){

        List<Profile> plist=QueryTest.getQueryList();

        return plist;
    }
}