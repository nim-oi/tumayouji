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
    <h1>登録画面</h1>
    <form form action="UserServlet" method="post" class="logintext">
        <input type="text" name="name"  placeholder="ユーザー名" required><br>
        <input type="text" name="pass"  placeholder="パスワード" required><br>
        <input type="submit" value="登録" class="new"><br>
    </form>
</div>
</body>
</html>