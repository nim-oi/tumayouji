<%@ page pageEncoding="windows-31j"
         isErrorPage="true"
         contentType="text/html;charset=windows-31j" %>
<html>
<head>
    <title>�G���[�y�[�W</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class="header">
    <div class="headerr">
        <h1><a href="ThreadServlet">YUJE CHANNEL</a></h1>

    </div>
    <ul class="li">
        <li><a href="ThreadServlet?category=1">����</a></li>
        <li><a href="ThreadServlet?category=2">�v���O���~���O</a></li>
        <li><a href="ThreadServlet?category=3">�X�|�[�c</a></li>
        <li><a href="ThreadServlet?category=4">�Q�[��</a></li>
        <li><a href="ThreadServlet?category=5">�w�Z</a></li>
        <li><a href="ThreadServlet?category=6">�A�j��</a></li>
        <li><a href="ThreadServlet?category=7">�j���[�X</a></li>
        <li><a href="ThreadServlet?category=8">���̑�</a></li>
    </ul>
    <hr>
</div>
    <h1 class="error">${pageContext.exception.message}</h1>
</body>
</html>