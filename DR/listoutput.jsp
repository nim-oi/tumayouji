<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>

<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>登録されたユーザー</title></head>
<body>
	
	<h1>登録されたユーザー</h1>
	<table border="1">
		<tr><th>ユーザー名</th><th>パスワード</th><th>パスワード</th><th>パスワード</th><th>パスワード</th></tr>
		<c:forEach var="prof" items="${users}">
			<tr><td>${ublist.user_id}</td><td>${ublist.user_name}</td><td>${ublist.user_pass}</td><td>${ublist.user_age}</td><td>${ublist.user_sex}</td></tr>
		</c:forEach>
	</table>
	
</body>
</html>
