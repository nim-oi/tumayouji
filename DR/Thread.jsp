<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>

<%--JSTL 1.1.2 core �^�O���C�u����--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>�X���b�h��ǉ����܂���</title></head>
<body>
	
	<h1>�ǉ����ꂽ�X���b�h</h1>
	<table border="1">
		<tr><th>�X���b�h��</th><th>�쐬��</th></tr>
		<c:forEach var="tb" items="${threads}">
			<tr><td>${tb.thread_name}</td><td>${tb.thread_date}</td></tr>
		</c:forEach>
	</table>
	
</body>
</html>
