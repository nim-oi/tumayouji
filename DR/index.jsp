<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>top���</title>
</head>
<body>
<table border="1">
    <tr><th>�X���b�h�^�C�g��</th><th>���t</th><th>�J�e�S���[</th><th>���[�U�[��</th><th>�X���b�h���e</th></tr>
    <c:forEach var="t" items="${tb}">
        <tr><td><a href="/ResServlet?threadid=1">${t.threadname}</a></td><td>${t.threaddate}</td><td>${t.category}</td><td>${t.username}</td><td></td></tr>
    </c:forEach>
    <p><a href="CreateThread.html">yuje</a></p>
</table>
</body>
</html>