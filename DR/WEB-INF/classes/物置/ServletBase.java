import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
/*���̒��͓K�X����������BBean���A
import info.Profile;
import database.InsertTest;
import database.QueryTest;
*/
import java.util.List;

public class TumayoujiServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        req.setCharacterEncoding("windows-31J");
        
        /*request����input�^�O����name�����������ɏ���*/
        // String name = req.getParameter("name");
        // String pass = req.getParameter("pass");
        

        //�f�[�^�x�[�X�ɏ������ރN���X���\�b�h
        InsertTest.insertUser_Table(name,pass);

        //����ȍ~doGet�Ƌ���
        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<Profile> plist = getList();

        //�p�����[�^��JSP�ɓ]���������B

        //jsp�Ŏ󂯎��ϐ��̖��O�����ł�users��plist��set
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

        //�f�[�^�x�[�X���烊�X�g�����炢����
        List<Profile> plist = getList();
        //jsp�Ŏ󂯎��ϐ��̖��O�A�����ł�users��plist��set
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