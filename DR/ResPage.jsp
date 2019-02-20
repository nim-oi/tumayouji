<%@ page pageEncoding="windows-31J"
         contentType="text/html; charset=windows-31j" %>
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
    </body>
</html>