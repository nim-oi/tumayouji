<%@ page pageEncoding="windows-31j"
                contentType="text/html;charset=windows-31j" %>
<html>
<head>
    <title>���O�C���m�F</title>
    <link rel="stylesheet" type="text/css" href="css/check.css">
</head>
<body>
<div class="delete">
<h1><%= session.getAttribute("user_name") %>���̃��[�U�[�Ń��O�C�����܂����H</h1>
<a href="ThreadServlet">yes</a>
<a href="NoServlet">no</a>
</div>
</body>
</html>