<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>top���</title>
</head>
<body>
<%! String category; %>
<ul>
    <li><a href="/ServletThread?category=1">����</a></li>
    <li><a href="/ServletThread?category=2">�v���O���~���O</a></li>
    <li><a href="/ServletThread?category=3">�X�|�[�c</a></li>
    <li><a href="/ServletThread?category=4">�Q�[��</a></li>
    <li><a href="/ServletThread?category=5">�w�Z</a></li>
    <li><a href="/ServletThread?category=6">�A�j��</a></li>
    <li><a href="/ServletThread?category=7">�j���[�X</a></li>
    <li><a href="/ServletThread?category=8">���̑�</a></li>
</ul>


<table border="1">
    <tr><th>�ԍ�</th><th>�X���b�h�^�C�g��</th><th>���t</th><th>�J�e�S���[</th><th>���[�U�[��</th><th>�X���b�h���e</th></tr>
    <c:forEach var="t" items="${tb}">
        <tr><td>${t.threadid}</td><td><a href="/ResServlet?threadid=1">${t.threadname}</a></td><td>${t.threaddate}</td><td>${t.category}</td><td>${t.username}</td><td>${t.threadtext}</td></tr>
    </c:forEach>

</table>
<p><a href="CreateThread.html">yuje</a></p>
</body>
</html>