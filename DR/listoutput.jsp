<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>

<%--JSTL 1.1.2 core �^�O���C�u����--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>�o�^���ꂽ���[�U�[</title></head>
<body>
	
	<h1>�o�^���ꂽ���[�U�[</h1>
	<table border="1">
		<tr><th>���[�U�[��</th><th>�p�X���[�h</th><th>�p�X���[�h</th><th>�p�X���[�h</th><th>�p�X���[�h</th></tr>
		<c:forEach var="prof" items="${users}">
			<tr><td>${ublist.user_id}</td><td>${ublist.user_name}</td><td>${ublist.user_pass}</td><td>${ublist.user_age}</td><td>${ublist.user_sex}</td></tr>
		</c:forEach>
	</table>
	
</body>
</html>
