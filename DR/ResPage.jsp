<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title></title>
    </head>
    <body>
    <table border="1">
        <tr><th>�X���b�h�^�C�g��</th><th>���t</th></tr>
        <c:forEach var="r" items="${rb}">
            <tr><td>${r.resname}</td><td>${r.restext}</td></tr>
        </c:forEach>
    </table>
    <form method="post" action="ResServlet">
        <input type="hidden" name="threadid" value="${threadid}">
        ���e�Җ�<input type="text" name = "res_name" placeholder="����">
        ���e���e<textarea name='res_text' cols='100' rows='10' placeholder='�����ɓ���' required></textarea><br>
        <input type='submit' value="���M" >
    </form>
    </body>
</html>