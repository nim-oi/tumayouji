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
        
        /*request����input�^�O����name�����������ɏ���*/
        
        String user_name = req.getParameter("user_name");
        String user_pass = req.getParameter("user_pass");
        int user_age = req.getParameter("user_age");
        int user_sex = req.getParameter("user_sex");
        
        

        //�f�[�^�x�[�X�ɏ������ރN���X���\�b�h
        InsertUser.insertUser_Table(user_name,user_pass,user_age,user_sex);

        //����ȍ~doGet�Ƌ���
        //�f�[�^�x�[�X���烊�X�g�����炢����,
        List<UserBean> ublist = getList();

        // //�p�����[�^��JSP�ɓ]���������B

        //jsp�Ŏ󂯎��ϐ��̖��O�����ł�users��plist��set
        req.setAttribute("users",ublist);

        //�]�����JSP���w��
        RequestDispatcher dis =req.getRequestDispatcher("/list");

        //JSP�ɓ]��
        dis.forward(req,res);
    }

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
//
//        req.setCharacterEncoding("windows-31J");
//

        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<UserBean> ublist = getList();
        //jsp�Ŏ󂯎��ϐ��̖��O�A�����ł�users��plist��set
        req.setAttribute("users",ublist);
        //�]�����JSP���w��
        RequestDispatcher dis =req.getRequestDispatcher("/list");
        //JSP�ɓ]��
        dis.forward(req,res);

    }
    public List<UserBean> getList(){

        List<UserBean> ublist=QueryUser.getQueryList();

        return ublist;
    }
}