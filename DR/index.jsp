<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>top画面</title>
</head>
<body>
<table border="1">
    <tr><th>スレッドタイトル</th><th>日付</th><th>カテゴリー</th><th>ユーザー名</th><th>スレッド内容</th></tr>
    <c:forEach var="t" items="${tb}">
        <tr><td>${t.threadname}</td><td>${t.threaddate}</td><td>${t.category}</td><td>${t.resname}</td><td>${t.thread_text}</td></tr>
    </c:forEach>
</table>
</body>
</html>