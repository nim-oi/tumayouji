<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>top画面</title>
</head>
<body>
<table border="1">
    <tr><th>ユーザー名</th><th>パスワード</th><th>パスワード</th><th>パスワード</th><th>パスワード</th></tr>
    <c:forEach var="tb" items="${tb}">
        <tr><td>${tb.threadname}</td><td>${tb.threaddate}</td><td>${tb.category}</td><td>${tb.resname}</td><td>${tb.thread_text}</td></tr>
    </c:forEach>
</table>
</body>
</html>