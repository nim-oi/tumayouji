<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>

<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>スレッドを追加しました</title></head>
<body>
	
	<h1>追加されたスレッド</h1>
	<table border="1">
		<tr><th>スレッド名</th><th>作成日</th></tr>
		<c:forEach var="tb" items="${threads}">
			<tr><td>${tb.thread_name}</td><td>${tb.thread_date}</td></tr>
		</c:forEach>
	</table>
	
</body>
</html>
