<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<html>
<head>
    <title>登録確認画面</title>
    <link rel="stylesheet" type="text/css" href="css/check.css">
</head>
<body>
<div class="delete">
    <h1><%= session.getAttribute("user_name") %>で登録されました！</h1>
    <a href="ThreadServlet">OK</a>
</div>
</body>
</html>