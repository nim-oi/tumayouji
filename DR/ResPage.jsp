<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title></title>
    </head>
    <body>
    <table border="1">
        <tr><th>スレッドタイトル</th><th>日付</th></tr>
        <c:forEach var="r" items="${rb}">
            <tr><td>${r.resname}</td><td>${r.restext}</td></tr>
        </c:forEach>
    </table>
    <form method="post" action="ResServlet">
        <input type="hidden" name="threadid" value="${threadid}">
        投稿者名<input type="text" name = "res_name" placeholder="匿名">
        投稿内容<textarea name='res_text' cols='100' rows='10' placeholder='ここに入力' required></textarea><br>
        <input type='submit' value="送信" >
    </form>
    </body>
</html>