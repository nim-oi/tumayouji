import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
/*���̒��͓K�X����������BBean���A
import info.ResBean;
import database.InsertRes;
import database.QueryRes;
*/
import beans.ResBean;
import database.InsertRes;
import database.QueryRes;

import java.util.*;

public class ResServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");

        /*request����input�^�O����name�����������ɏ���*/

        String resname = req.getParameter("resname");
        String restext = req.getParameter("restext");
        String threadid= req.getParameter("threadid");
        //�f�[�^�x�[�X�ɏ������ރN���X���\�b�h
        InsertRes.insertResTable(resname,restext,threadid);

        //����ȍ~doGet�Ƌ���
        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<ResBean> rlist = getList(threadid);

        //�p�����[�^��JSP�ɓ]���������B

        //jsp�Ŏ󂯎��ϐ��̖��O�����ł�users��plist��set
        req.setAttribute("rb",rlist);


        //�]�����JSP���w��
        RequestDispatcher dispatcher =req.getRequestDispatcher("/ResPage");

        //JSP�ɓ]��
        dispatcher.forward(req,res);
    }

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
//
        req.setCharacterEncoding("windows-31J");
//
        String threadid= req.getParameter("threadid");
        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<ResBean> rlist = getList(threadid);
        //jsp�Ŏ󂯎��ϐ��̖��O�A�����ł�users��plist��set
        req.setAttribute("rb",rlist);
        //�]�����JSP���w��
        RequestDispatcher dispatcher =req.getRequestDispatcher("/ResPage");
        //JSP�ɓ]��
        dispatcher.forward(req,res);

    }
    public List<ResBean> getList(String currentThread){

        List<ResBean> rlist=QueryRes.getQueryList(currentThread);

        return rlist;
    }
}