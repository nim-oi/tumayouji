<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>

<%--JSTL 1.1.2 core �^�O���C�u����--%>
<html>
<head><title>�o�^���ꂽ���[�U�[</title></head>
<body>
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
	<h1>�o�^���ꂽ���[�U�[</h1>
	<table border="1">
		<tr><th>���[�U�[��</th><th>�p�X���[�h</th><th>�p�X���[�h</th><th>�p�X���[�h</th><th>�p�X���[�h</th></tr>
		<c:forEach var="tb" items="${tb}">
			<tr><td>${tb.thread_name}</td><td>${tb.thread_date}</td><td>${ublist.user_pass}</td><td>${ublist.user_age}</td><td>${ublist.user_sex}</td></tr>
		</c:forEach>
	</table>
	
</body>
</html>
