<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/loginPage.css">
    <title>login</title>
</head>
<body>
<div class="header">
    <div class="headerr">
        <h1><a href="ThreadServlet">YUJE CHANNEL</a></h1>
    </div>
</div>
<div class="login">
    <h1>���O�C�����</h1>
<form action="loginPageServlet" method="post" class="logintext">
    <input type="text" name="name"  placeholder="���[�U�[��" required><br>
    <input type="text" name="pass"  placeholder="�p�X���[�h" required><br>
    <input type="submit" value="���O�C��" class="new"><br>
</form>
</div>
<p class="newR"><a href="newUser.jsp" class="new">�V�K�o�^</a></p>

</body>
</html>