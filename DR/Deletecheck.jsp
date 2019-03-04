<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/check.css">
    <title>ログイン確認</title>
</head>
<body>
<div class="delete">
<h1>削除しました</h1>
<a href="MyPageServlet?user_id= <%= session.getAttribute("user_id")%>">OK</a>
</div>
</body>
</html>