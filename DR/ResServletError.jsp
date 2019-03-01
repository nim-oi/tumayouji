<%@ page pageEncoding="windows-31j"
         isErrorPage="true"
         contentType="text/html;charset=windows-31j" %>
<html>
<head>
    <title>エラーページ</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class="header">
    <div class="headerr">
        <h1><a href="ThreadServlet">YUJE CHANNEL</a></h1>

    </div>
    <ul class="li">
        <li><a href="ThreadServlet?category=1">恋愛</a></li>
        <li><a href="ThreadServlet?category=2">プログラミング</a></li>
        <li><a href="ThreadServlet?category=3">スポーツ</a></li>
        <li><a href="ThreadServlet?category=4">ゲーム</a></li>
        <li><a href="ThreadServlet?category=5">学校</a></li>
        <li><a href="ThreadServlet?category=6">アニメ</a></li>
        <li><a href="ThreadServlet?category=7">ニュース</a></li>
        <li><a href="ThreadServlet?category=8">その他</a></li>
    </ul>
    <hr>
</div>
    <h1 class="error">${pageContext.exception.message}</h1>
</body>
</html>