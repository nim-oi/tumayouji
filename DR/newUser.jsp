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
    <h1>�o�^���</h1>
    <form form action="UserServlet" method="post" class="logintext">
        <input type="text" name="name"  placeholder="���[�U�[��" required><br>
        <input type="text" name="pass"  placeholder="�p�X���[�h" required><br>
        <input type="submit" value="�o�^" class="new"><br>
    </form>
</div>
</body>
</html>