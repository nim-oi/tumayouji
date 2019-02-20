import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import beans.ResBean;
import database.InsertRes;
import database.QueryRes;

import java.util.List;

public class ResServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");
        
        /*request����input�^�O����name�����������ɏ���*/
        
        String resname = req.getParameter("resname");
        String restext = req.getParameter("restext");

        //�f�[�^�x�[�X�ɏ������ރN���X���\�b�h
        InsertTest.insertUser_Table(name,pass);

        //����ȍ~doGet�Ƌ���
        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<ResBean> rlist = getList();

        //�p�����[�^��JSP�ɓ]���������B

        //jsp�Ŏ󂯎��ϐ��̖��O�����ł�users��plist��set
        req.setAttribute("reses",rlist);
        

        //�]�����JSP���w��
        RequestDispatcher dispatcher =req.getRequestDispatcher("/resList");

        //JSP�ɓ]��
        dispatcher.forward(req,res);
    }

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
//
       req.setCharacterEncoding("windows-31J");
//

        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<ResBean> rlist = getList(currentThread);
        //jsp�Ŏ󂯎��ϐ��̖��O�A�����ł�users��plist��set
        req.setAttribute("reses",rlist);
        //�]�����JSP���w��
        RequestDispatcher dis =req.getRequestDispatcher("/resList");
        //JSP�ɓ]��
        dis.forward(req,res);

    }
    public List<ResBean> getList(String currentThread){

        List<ResBean> rlist=QueryRes.getQueryList(currentThread);

        return plist;
    }
}